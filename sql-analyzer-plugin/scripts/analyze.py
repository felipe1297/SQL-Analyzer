import sys
import json
import os
import graphviz
import matplotlib.pyplot as plt
from io import BytesIO
import base64
from antlr4 import *
from difflib import SequenceMatcher
import psycopg2
from psycopg2 import sql
import tempfile
from antlr4.error.ErrorListener import ErrorListener
from antlr.PostgreSql.PostgreSqlGrammarLexer import PostgreSqlGrammarLexer
from antlr.PostgreSql.PostgreSqlGrammarParser import PostgreSqlGrammarParser
from antlr.PostgreSql.PostgreSqlGrammarVisitor import PostgreSqlGrammarVisitor

class WhereClauseVisitor(PostgreSqlGrammarVisitor):

    def __init__(self, messages):
        super().__init__()
        self.smells = []
        self.messages = messages

    def visitFunction_call(self, ctx):
        code = "NDB004"
        message = self.messages["no_db_access"][code]["description"]
        recommendation = self.messages["no_db_access"][code]["recommendation"]
        example = self.messages["no_db_access"][code]["example"]
        self.smells.append({
            "line": ctx.start.line,
            "code": code,
            "message": message,
            "recommendation": recommendation,
            "example": example
        })
        return self.visitChildren(ctx)
    
    def visitExpr(self, ctx):
        if self._is_trivial_condition(ctx):
            code = "NDB005"
            message = self.messages["no_db_access"][code]["description"]
            recommendation = self.messages["no_db_access"][code]["recommendation"]
            example = self.messages["no_db_access"][code]["example"]
            self.smells.append({
                "line": ctx.start.line,
                "code": code,
                "message": message,
                "recommendation": recommendation,
                "example": example
            })
        elif self._is_excessive_or(ctx):
            code = "NDB007"
            message = self.messages["no_db_access"][code]["description"]
            recommendation = self.messages["no_db_access"][code]["recommendation"]
            example = self.messages["no_db_access"][code]["example"]
            self.smells.append({
                "line": ctx.start.line,
                "code": code,
                "message": message,
                "recommendation": recommendation,
                "example": example
            })
        return self.visitChildren(ctx)

    def _is_trivial_condition(self, ctx):
        if ctx.getChildCount() == 3:
            left = ctx.getChild(0).getText()
            op = ctx.getChild(1).getText()
            right = ctx.getChild(2).getText()
            if (left == right and op in ['=', '!=']) or (left in ['1', '0'] and right in ['1', '0']):
                return True
        return False

    def _is_excessive_or(self, ctx):
        if ctx.getChildCount() == 3:
            left = ctx.getChild(0)
            op = ctx.getChild(1).getText()
            right = ctx.getChild(2)
            if op == "OR" and (self._is_simple_comparison(left) or self._is_simple_comparison(right)):
                return True
        return False

    def _is_simple_comparison(self, ctx):
        if ctx.getChildCount() == 3:
            left = ctx.getChild(0).getText()
            op = ctx.getChild(1).getText()
            right = ctx.getChild(2).getText()
            if op in ["=", "!=", "<", ">", "<=", ">="] and left.isidentifier() and (right.isidentifier() or right.isnumeric() or right.startswith("'")):
                return True
        return False

class SmellVisitor(PostgreSqlGrammarVisitor):

    def __init__(self, messages, db_credentials=None):
        self.smells = []
        self.messages = messages
        self.no_db_access = "no_db_access"
        self.db_access = "db_access"
        self.table_references = []
        self.levenshtein_similarity_ratio = 0.6
        self.dbMessage = False
        self.db_credentials = db_credentials
        self.db_connection = None

        if self.db_credentials:
            try:
                self.db_connection = self._connect_to_db()
            except Exception as e:
                self.db_connection = None

    def _connect_to_db(self):

        if None in (self.db_credentials["host"], 
                    self.db_credentials["port"], self.db_credentials["user"], 
                    self.db_credentials["password"], self.db_credentials["database"]):
            return

        host = self.db_credentials["host"]
        port = self.db_credentials["port"]
        user = self.db_credentials["user"]
        password = self.db_credentials["password"]
        database = self.db_credentials["database"]

        conn = psycopg2.connect(
            host=host,
            port=port,
            user=user,
            password=password,
            database=database
        )
        return conn
    
    def visitSelect_stmt(self, ctx):
        self.table_references = []
        self.table_references = self._extract_table_aliases(ctx)
        # Detect SELECT *
        if ctx.STAR():
            code = "NDB001"
            message = self.messages[self.no_db_access][code]["description"]
            recommendation = self.messages[self.no_db_access][code]["recommendation"]
            example = self.messages[self.no_db_access][code]["example"]
            self.smells.append({
                "line": ctx.start.line,
                "code": code,
                "message": message,
                "recommendation": recommendation,
                "example": example
            })

        # Detect nested subqueries in select_stmt
        self._detect_nested_subqueries(ctx)

        # Detect JOIN without condition
        self._detect_cartesian_product(ctx)

        # Detect functions in WHERE clauses
        self._detect_functions_in_where(ctx)

        # Detect DISTINCT usage
        self._detect_distinct_usage(ctx)

        # Detect aggregate functions without GROUP BY clause
        self._detect_aggregate_without_group_by(ctx)

        # Detect OFFSET without LIMIT
        self._detect_offset_without_limit(ctx)

        # Detect unclear or unnecessary aliases
        self._detect_unclear_aliases(ctx)

        if self.db_connection:
            # self._detect_missing_indexes_on_joins(ctx, table_references)
            self._detect_missing_indexes_on_where(ctx, self.table_references)
        else:
            self._add_missing_db_connection_smell()

        return self.visitChildren(ctx)

    def _extract_table_aliases(self, ctx):
        table_aliases = {}

        def traverse_table_references(ctx):
            if isinstance(ctx, PostgreSqlGrammarParser.Table_referenceContext):
                table_name = None
                alias = None
                for child in ctx.getChildren():
                    if isinstance(child, PostgreSqlGrammarParser.Table_nameContext):
                        table_name = child.getText()
                    elif isinstance(child, PostgreSqlGrammarParser.AliasContext):
                        alias = child.getChild(1).getText() if child.getChildCount() == 2 else child.getChild(0).getText()
                if table_name:
                    table_aliases[alias or table_name] = table_name

            for i in range(ctx.getChildCount()):
                traverse_table_references(ctx.getChild(i))

        traverse_table_references(ctx)
        return table_aliases

    def _detect_nested_subqueries(self, ctx):
        # Check within select_stmt for nested select_stmt
        for child in ctx.getChildren():
            if isinstance(child, PostgreSqlGrammarParser.Select_stmtContext):
                self._add_nested_subquery_smell(child)
                self._detect_nested_subqueries(child)
            elif isinstance(child, PostgreSqlGrammarParser.Table_referenceContext):
                self._detect_nested_subqueries_in_table_reference(child)
            elif isinstance(child, ParserRuleContext):
                self._detect_nested_subqueries(child)

    def _detect_nested_subqueries_in_table_reference(self, ctx):
        # Check within table_reference for nested select_stmt
        for child in ctx.getChildren():
            if isinstance(child, PostgreSqlGrammarParser.Select_stmtContext):
                self._add_nested_subquery_smell(child)
                self._detect_nested_subqueries(child)
            elif isinstance(child, ParserRuleContext):
                self._detect_nested_subqueries(child)
    
    def _add_nested_subquery_smell(self, ctx):
        code = "NDB002"
        message = self.messages[self.no_db_access][code]["description"]
        recommendation = self.messages[self.no_db_access][code]["recommendation"]
        example = self.messages[self.no_db_access][code]["example"]
        self.smells.append({
            "line": ctx.start.line,
            "code": code,
            "message": message,
            "recommendation": recommendation,
            "example": example
        })

    def _detect_cartesian_product(self, ctx):
        if len(ctx.table_reference()) > 1 and not ctx.join_clause():
            code = "NDB003"
            message = self.messages[self.no_db_access][code]["description"]
            recommendation = self.messages[self.no_db_access][code]["recommendation"]
            example = self.messages[self.no_db_access][code]["example"]
            self.smells.append({
                "line": ctx.start.line,
                "code": code,
                "message": message,
                "recommendation": recommendation,
                "example": example
            })

    def _detect_functions_in_where(self, ctx):
        if ctx.WHERE():
            where_clause = ctx.expr()
            where_visitor = WhereClauseVisitor(self.messages)
            where_visitor.visit(where_clause)
            self.smells.extend(where_visitor.smells)

    def _detect_distinct_usage(self, ctx):
        if ctx.DISTINCT():
            code = "NDB006"
            message = self.messages[self.no_db_access][code]["description"]
            recommendation = self.messages[self.no_db_access][code]["recommendation"]
            example = self.messages[self.no_db_access][code]["example"]
            self.smells.append({
                "line": ctx.start.line,
                "code": code,
                "message": message,
                "recommendation": recommendation,
                "example": example
            })

    def _detect_aggregate_without_group_by(self, ctx):
        has_group_by = any(isinstance(child, PostgreSqlGrammarParser.Group_by_clauseContext) for child in ctx.children)
        if not has_group_by:
            for result_column in ctx.result_column():
                if self._is_aggregate_function(result_column):
                    code = "NDB008"
                    message = self.messages[self.no_db_access][code]["description"]
                    recommendation = self.messages[self.no_db_access][code]["recommendation"]
                    example = self.messages[self.no_db_access][code]["example"]
                    self.smells.append({
                        "line": ctx.start.line,
                        "code": code,
                        "message": message,
                        "recommendation": recommendation,
                        "example": example
                    })

    def _is_aggregate_function(self, ctx):
        if ctx.getChildCount() > 0:
            for i in range(ctx.getChildCount()):
                child = ctx.getChild(i)
                if isinstance(child, PostgreSqlGrammarParser.Agg_funcContext):
                    return True
                elif isinstance(child, TerminalNode):
                    token = child.getSymbol().text.upper()
                    return any(token.startswith(word) for word in ["COUNT", "SUM", "AVG", "MIN", "MAX"])
        return False
    
    def _detect_offset_without_limit(self, ctx):
        has_offset_without_limit = False

        for child in ctx.children:
            if isinstance(child, PostgreSqlGrammarParser.Limit_offset_clauseContext) and child.children:
                has_limit = any(grandchild for grandchild in child.children if grandchild.getText().upper() == 'LIMIT')
                has_offset = any(grandchild for grandchild in child.children if grandchild.getText().upper() == 'OFFSET')
                
                if has_offset and not has_limit:
                    has_offset_without_limit = True

        if has_offset_without_limit:
            code = "NDB009"
            message = self.messages[self.no_db_access][code]["description"]
            recommendation = self.messages[self.no_db_access][code]["recommendation"]
            example = self.messages[self.no_db_access][code]["example"]
            self.smells.append({
                "line": ctx.start.line,
                "code": code,
                "message": message,
                "recommendation": recommendation,
                "example": example
            })
    
    # Levenshtein similarity
    def _detect_unclear_aliases(self, ctx):
        def similar(a, b):
            return SequenceMatcher(None, a, b).ratio()
        for child in ctx.getChildren():
            if isinstance(child, PostgreSqlGrammarParser.Table_referenceContext):
                table_name = None
                alias = None
                for grandchild in child.getChildren():
                    if isinstance(grandchild, PostgreSqlGrammarParser.Table_nameContext):
                        table_name = grandchild.getText()
                    elif isinstance(grandchild, PostgreSqlGrammarParser.AliasContext):
                        if grandchild.getChildCount() == 2 and grandchild.getChild(0).getText().upper() == "AS":
                            alias = grandchild.getChild(1).getText()
                        else:
                            alias = grandchild.getText()

                if table_name and alias:
                    similarity_ratio = similar(alias, table_name)
                    if similarity_ratio < self.levenshtein_similarity_ratio:
                        code = "NDB010"
                        message = self.messages[self.no_db_access][code]["description"]
                        recommendation = self.messages[self.no_db_access][code]["recommendation"]
                        example = self.messages[self.no_db_access][code]["example"]
                        self.smells.append({
                            "line": ctx.start.line,
                            "code": code,
                            "message": message,
                            "recommendation": recommendation,
                            "example": example
                        })

        for child in ctx.getChildren():
            if isinstance(child, PostgreSqlGrammarParser.Result_columnContext):
                original_text = None
                alias = None

                if child.getChildCount() == 2:
                    # Handle ID ID
                    original_text = child.getChild(0).getText()
                    alias = child.getChild(1).getText()
                elif child.getChildCount() == 3 and child.getChild(1).getText().upper() == "AS":
                    # Handle ID AS ID
                    original_text = child.getChild(0).getText()
                    alias = child.getChild(2).getText()
                elif child.getChildCount() == 4 and child.getChild(1).getText() == ".":
                    # Handle ID DOT ID ID
                    original_text = child.getChild(2).getText()
                    alias = child.getChild(3).getText()
                elif child.getChildCount() == 5 and child.getChild(3).getText().upper() == "AS":
                    # Handle ID DOT ID AS ID
                    original_text = child.getChild(2).getText()
                    alias = child.getChild(4).getText()
                elif child.getChildCount() == 3 and child.getChild(1).getText() == ".":
                    # Handle ID DOT ID
                    original_text = child.getChild(2).getText()

                if original_text and alias:
                    similarity_ratio = similar(alias, original_text)
                    if similarity_ratio < self.levenshtein_similarity_ratio:
                        code = "NDB010"
                        message = self.messages[self.no_db_access][code]["description"]
                        recommendation = self.messages[self.no_db_access][code]["recommendation"]
                        example = self.messages[self.no_db_access][code]["example"]
                        self.smells.append({
                            "line": ctx.start.line,
                            "code": code,
                            "message": message,
                            "recommendation": recommendation,
                            "example": example
                        })

    def _add_missing_db_connection_smell(self):
        if not self.dbMessage:
            self.dbMessage = True
            code = "DB_CONN"
            message = "Database connection is not available. Database-specific analyses are disabled."
            self.smells.append({
                "line": 0,
                "code": code,
                "message": message,
                "recommendation": "",
                "example": ""
            })

    def visitStandard_join(self, ctx):
        on_expr = ctx.expr()
        self._analyze_on_expression(on_expr, self.table_references)

        return self.visitChildren(ctx)

    def _extract_table_aliases(self, ctx):
        table_aliases = {}

        def traverse_table_references(ctx):
            if isinstance(ctx, PostgreSqlGrammarParser.Table_referenceContext):
                table_name = None
                alias = None
                for child in ctx.getChildren():
                    if isinstance(child, PostgreSqlGrammarParser.Table_nameContext):
                        table_name = child.getText()
                    elif isinstance(child, PostgreSqlGrammarParser.AliasContext):
                        alias = child.getChild(1).getText() if child.getChildCount() == 2 else child.getChild(0).getText()
                if table_name:
                    table_aliases[alias or table_name] = table_name

            for i in range(ctx.getChildCount()):
                traverse_table_references(ctx.getChild(i))

        traverse_table_references(ctx)
        return table_aliases

    def _analyze_on_expression(self, ctx, table_references):
        if ctx.getChildCount() == 3:
            left = ctx.getChild(0)
            op = ctx.getChild(1).getText()
            right = ctx.getChild(2)

            if op.upper() in ["AND", "OR"]:
                self._analyze_on_expression(left, table_references)
                self._analyze_on_expression(right, table_references)
            else:
                self._process_comparison(left, op, right, table_references, 1)

        elif ctx.getChildCount() > 1:
            for i in range(ctx.getChildCount()):
                self._analyze_on_expression(ctx.getChild(i), table_references)

    def _process_comparison(self, left, op, right, table_references, opt):
        # Procesar columna izquierda
        if self._is_simple_column(left):
            left_table, left_column = self._resolve_column(left, table_references)
            if left_table and left_column:
                self._check_index(left_table, left_column, left.start.line, opt)
        elif self._is_function_call(left):
            self._process_function_call(left, table_references, opt)

        # Procesar columna derecha
        if self._is_simple_column(right):
            right_table, right_column = self._resolve_column(right, table_references)
            if right_table and right_column:
                self._check_index(right_table, right_column, right.start.line, opt)
        elif self._is_function_call(right):
            self._process_function_call(right, table_references, opt)

    def _is_simple_column(self, ctx):
        if isinstance(ctx, PostgreSqlGrammarParser.ComparatorExprContext):
            if ctx.getChildCount() == 3:
                child0 = ctx.getChild(0)
                child1 = ctx.getChild(1)
                child2 = ctx.getChild(2)
                if isinstance(child0, TerminalNode) and isinstance(child1, TerminalNode) and isinstance(child2, TerminalNode):
                    if child0.getSymbol().type == PostgreSqlGrammarParser.ID and \
                    child1.getSymbol().type == PostgreSqlGrammarParser.DOT and \
                    child2.getSymbol().type == PostgreSqlGrammarParser.ID:
                        return True
        elif isinstance(ctx, TerminalNode):
            if ctx.getSymbol().type == PostgreSqlGrammarParser.ID:
                return True
        return False
    
    def _is_function_call(self, ctx):
        if isinstance(ctx, PostgreSqlGrammarParser.Function_callContext):
            if len(ctx.getChildCount()) >= 3:
                third_child = ctx.children[2]
                if isinstance(third_child, PostgreSqlGrammarParser.ExpressionContext):
                    return self._is_simple_column(third_child) or self._is_function_call(third_child)
                elif isinstance(third_child, PostgreSqlGrammarParser.Function_callContext):
                    return self._is_function_call(third_child)
            return False
        return False
    
    def _resolve_column(self, ctx, table_references):
        if ctx.getChildCount() == 1:
            column = ctx.getText()
            table = self._find_table_by_column(column, table_references)
            return table, column
        elif ctx.getChildCount() == 3 and ctx.getChild(1).getText() == ".":
            table = ctx.getChild(0).getText()
            column = ctx.getChild(2).getText()
            return table_references.get(table, table), column
        elif isinstance(ctx, PostgreSqlGrammarParser.Function_callContext):
            if len(ctx.children) >= 3:
                third_child = ctx.children[2]
                if isinstance(third_child, PostgreSqlGrammarParser.ExpressionContext):
                    return self._resolve_column(third_child, table_references)
                elif isinstance(third_child, PostgreSqlGrammarParser.Function_callContext):
                    return self._resolve_column(third_child, table_references)
        return None, None

    def _find_table_by_column(self, column, table_references):
        if self.db_connection:
            for table in table_references.values():
                if self._column_exists_in_table(column, table):
                    return table
        return None

    def _column_exists_in_table(self, column, table):
        query = sql.SQL("SELECT 1 FROM information_schema.columns WHERE table_name = {table} AND column_name = {column}").format(
            table=sql.Literal(table),
            column=sql.Literal(column)
        )
        cursor = self.db_connection.cursor()
        cursor.execute(query)
        result = cursor.fetchone()
        cursor.close()
        return result is not None

    def _check_index(self, table, column, line, opt):
        if self.db_connection:
            query = sql.SQL("SELECT 1 FROM pg_indexes WHERE tablename = {table} AND indexdef LIKE {pattern}").format(
                table=sql.Literal(table),
                pattern=sql.Literal(f"%({column})%")
            )
            cursor = self.db_connection.cursor()
            cursor.execute(query)
            result = cursor.fetchone()
            cursor.close()
            if not result:
                if opt == 1:
                    code = "DB001"
                    message = self.messages["db_access"][code]["description"]
                    recommendation = self.messages["db_access"][code]["recommendation"]
                    example = self.messages["db_access"][code]["example"]
                    self.smells.append({
                        "line": line,
                        "code": code,
                        "message": message,
                        "recommendation": recommendation,
                        "example": example
                    })
                elif opt == 2:
                    code = "DB002"
                    message = self.messages["db_access"][code]["description"]
                    recommendation = self.messages["db_access"][code]["recommendation"]
                    example = self.messages["db_access"][code]["example"]
                    self.smells.append({
                        "line": line,
                        "code": code,
                        "message": message,
                        "recommendation": recommendation,
                        "example": example
                    })

    def _detect_missing_indexes_on_where(self, ctx, table_references):
        if ctx.WHERE():
            where_clause = ctx.expr()
            self._analyze_where_expression(where_clause, table_references)

    def _analyze_where_expression(self, ctx, table_references):
        if ctx.getChildCount() == 3:
            left = ctx.getChild(0)
            op = ctx.getChild(1).getText()
            right = ctx.getChild(2)

            if op.upper() in ["AND", "OR"]:
                self._analyze_where_expression(left, table_references)
                self._analyze_where_expression(right, table_references)
            else:
                self._process_comparison(left, op, right, table_references, 2)

        elif ctx.getChildCount() > 1:
            for i in range(ctx.getChildCount()):
                self._analyze_where_expression(ctx.getChild(i), table_references)

class CustomErrorListener(ErrorListener):
    def __init__(self):
        super(CustomErrorListener, self).__init__()
        self.errors = []

    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
        self.errors.append({"line": line, "message": f"❌ Syntax error at line {line}: {msg}"})

output_dir = os.path.join(os.path.dirname(os.path.realpath(__file__)), 'output_images')
if not os.path.exists(output_dir):
    os.makedirs(output_dir)

def create_execution_plan_tree_base64(json_string):
    try:
        # Convertir el JSON string a un diccionario
        json_data = json.loads(json_string)
        
        # Verificar si json_data es una lista o un diccionario
        if isinstance(json_data, list):
            json_data = json_data[0]  # Obtener el primer elemento si es una lista

        # Crear un gráfico dirigido con Graphviz
        dot = graphviz.Digraph(comment='Execution Plan Tree')

        # Colores y emojis por tipo de nodo
        node_styles = {
            "Seq Scan": {"color": "lightblue", "emoji": "🔍"},
            "Hash Join": {"color": "lightgreen", "emoji": "🔗"},
            "Nested Loop": {"color": "lightyellow", "emoji": "🔄"},
            "Sort": {"color": "lightpink", "emoji": "🔃"},
            "Index Only Scan": {"color": "lightcoral", "emoji": "📇"},
            "Aggregate": {"color": "lightgrey", "emoji": "Σ"},
            "Bitmap Heap Scan": {"color": "lightgoldenrodyellow", "emoji": "📂"},
            "Bitmap Index Scan": {"color": "lightsteelblue", "emoji": "🗃"},
            "Hash": {"color": "lavender", "emoji": "🔑"},
            "default": {"color": "white", "emoji": "🔍"}
        }

        # Función recursiva para agregar nodos y bordes al gráfico
        def add_nodes_edges(node, parent_id=None):
            if isinstance(node, dict):
                node_id = str(id(node))
                node_type = node.get("Node Type", "default")
                style = node_styles.get(node_type, node_styles["default"])
                emoji = style["emoji"]
                color = style["color"]

                node_label = f"{emoji} " + "\n".join([f"{k}: {v}" for k, v in node.items() if not isinstance(v, (dict, list))])
                dot.node(node_id, label=node_label, shape='box', style='rounded,filled', fillcolor=color)
                
                if parent_id:
                    dot.edge(parent_id, node_id)

                for k, v in node.items():
                    if isinstance(v, (dict, list)):
                        add_nodes_edges(v, node_id)
                        
            elif isinstance(node, list):
                for item in node:
                    add_nodes_edges(item, parent_id)

        # Agregar el nodo raíz
        root_key = list(json_data.keys())[0]
        root_node = json_data[root_key]
        root_id = str(id(root_node))
        root_label = f"📄 {root_key}\n" + "\n".join([f"{k}: {v}" for k, v in root_node.items() if not isinstance(v, (dict, list))])
        dot.node(root_id, label=root_label, shape='box', style='rounded,filled', fillcolor='lightblue')
        add_nodes_edges(root_node, root_id)

        # Guardar el gráfico como un archivo SVG y devolver el SVG como cadena base64
        dot.format = 'svg'
        svg_data = dot.pipe().decode('utf-8')
        svg_base64 = base64.b64encode(svg_data.encode('utf-8')).decode('utf-8')
        return svg_base64

    except Exception as e:
        # Manejar errores en la generación del diagrama y devolver un SVG con el mensaje de error
        dot = graphviz.Digraph(comment='Execution Plan Error')
        error_message = f"❌ Error: {str(e)}"
        dot.node('error', label=error_message, shape='box', style='rounded,filled', fillcolor='red')
        dot.format = 'svg'
        svg_data = dot.pipe().decode('utf-8')
        svg_base64 = base64.b64encode(svg_data.encode('utf-8')).decode('utf-8')
        return svg_base64


def create_smells_bar_chart(smells):
    smell_counts = {}
    for smell in smells:
        code = smell['code']
        if (code not in smell_counts):
            smell_counts[code] = 0
        smell_counts[code] += 1
    
    plt.figure(figsize=(10, 6))
    plt.bar(smell_counts.keys(), smell_counts.values(), color='blue')
    plt.xlabel('Code Smells')
    plt.ylabel('Frequency')
    plt.title('Code Smells Frequency')
    
    buf = BytesIO()
    plt.savefig(buf, format='png')
    buf.seek(0)
    img_str = base64.b64encode(buf.read()).decode('utf-8')
    plt.close()
    return img_str

def get_execution_plan(query, db_credentials):
    try:
        conn = psycopg2.connect(
            host=db_credentials["host"],
            port=db_credentials["port"],
            user=db_credentials["user"],
            password=db_credentials["password"],
            database=db_credentials["database"]
        )
        cursor = conn.cursor()
        cursor.execute(f"EXPLAIN (FORMAT JSON) {query}")
        plan = cursor.fetchone()[0]
        cursor.close()
        conn.close()
        return json.dumps(plan, indent=2)
    except Exception as e:
        return json.dumps({
            "query": {
                "statement": query,
                "execPlanStatus": "Not available",
                "reason": str(e)
            }
        }, indent=2)
    
def calculate_complexity(visitor, tree):
    depth = calculate_ast_depth(tree)
    smells_count = len(visitor.smells)
    complexity_score = depth / (smells_count + 1)  # Avoid division by zero
    return {
        "depth": depth,
        "smells_count": smells_count,
        "complexity_score": complexity_score
    }

def calculate_ast_depth(tree, depth=0):
    if tree.getChildCount() == 0:
        return depth
    else:
        return max(calculate_ast_depth(tree.getChild(i), depth+1) for i in range(tree.getChildCount()))

def execution_plan_exec(sql_content, db_credentials, execution_plan_diagram, separator=";"):
    parts = sql_content.split(separator)
    for i in range(len(parts) - 1):
        if parts[i] is not None or parts[i] != '':
            query = parts[i] + separator    
            execution_plan = get_execution_plan(query, db_credentials)
            execution_plan_diagram.append(create_execution_plan_tree_base64(execution_plan))
    
    return parts

def analyze_sql(sql_content, messages, db_credentials=None, generate_execution_plan=False):
    input_stream = InputStream(sql_content)
    lexer = PostgreSqlGrammarLexer(input_stream)
    token_stream = CommonTokenStream(lexer)
    parser = PostgreSqlGrammarParser(token_stream)
    parser.removeErrorListeners()
    lexer.removeErrorListeners()
    error_listener = CustomErrorListener()
    parser.addErrorListener(error_listener)
    lexer.addErrorListener(error_listener)

    tree = parser.initial()  # Usar la regla 'initial' como punto de entrada

    if error_listener.errors:
        return json.dumps({
            "lexicalErrors": error_listener.errors,
            "syntaxErrors": [],
            "codeSmells": []
        })

    visitor = SmellVisitor(messages, db_credentials)
    visitor.visit(tree)

    execution_plan_diagram = []
    if generate_execution_plan and db_credentials:
        execution_plan_exec(sql_content, db_credentials, execution_plan_diagram)

    smells_bar_chart = create_smells_bar_chart(visitor.smells)
    complexity_score = calculate_complexity(visitor, tree)

    # Agrupar mensajes por línea sin duplicados
    detailed_messages = {}

    for smell in visitor.smells:
        line = smell["line"]
        code = smell["code"]
        if line not in detailed_messages:
            detailed_messages[line] = {
                "line": line,
                "message": "",
                "smells": []
            }
        detailed_messages[line]["smells"].append(smell)
        detailed_messages[line]["message"] += f"{code} - {smell['message']}\n"

    detailed_messages_list = [
        {
            "line": k,
            "message": v["message"].strip(),
            "smells": v["smells"]
        }
        for k, v in detailed_messages.items()
    ]

    return json.dumps({
        "lexicalErrors": [],
        "syntaxErrors": [],
        "codeSmells": detailed_messages_list,
        "executionPlan": execution_plan_diagram if generate_execution_plan else None,
        "smellsBarChart": smells_bar_chart,
        "complexityScore": complexity_score
    }, indent=2)

def read_json_file(file_path):
    with open(file_path, 'r') as file:
        return json.load(file)

def str_to_bool(value):
    if isinstance(value, str):
        if value.lower() in ['true', '1', 't', 'yes', 'y']:
            return True
        elif value.lower() in ['false', '0', 'f', 'no', 'n']:
            return False
    raise False

if __name__ == "__main__":
    script_dir = os.path.dirname(os.path.realpath(__file__))
    messages_path = os.path.abspath(os.path.join(script_dir, '..', '..', 'resources', 'smell-codes', 'smellCodeDictionary.json'))

    messages = read_json_file(messages_path)

    query = sys.argv[1]
    db_credentials = None
    if len(sys.argv) > 2:
        db_credentials = {
            "host": sys.argv[2],
            "port": sys.argv[3],
            "user": sys.argv[4],
            "password": sys.argv[5],
            "database": sys.argv[6]
        }

    result = analyze_sql(query, messages, db_credentials, str_to_bool(sys.argv[7]))
    print(result)



def read_sql_file(file_path):
    with open(file_path, 'r') as file:
        return file.read()
    
# if __name__ == "__main__":
#     # Ajustar la ruta para subir dos niveles en el directorio
#     script_dir = os.path.dirname(os.path.realpath(__file__))
#     messages_path = os.path.abspath(os.path.join(script_dir, '..', '..', 'resources', 'smell-codes', 'smellCodeDictionary.json'))
#     messages = read_json_file(messages_path)

#     sql_file = 'sql-analyzer-plugin/scripts/test/test_1.sql'  # Ruta al archivo de consultas SQL
#     query = read_sql_file(sql_file)

#     # Datos de la base de datos para pruebas
#     db_credentials = {
#         "host": "localhost",
#         "port": 5433,
#         "user": "testuser",
#         "password": "testpassword",
#         "database": "testdb"
#     }

#     result = analyze_sql(query, messages, db_credentials, True)
#     print(result)
