import sys
import json
import os
from antlr4 import *
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

    def __init__(self, messages):
        self.smells = []
        self.messages = messages
        self.no_db_access = "no_db_access"
        self.db_access = "db_access"

    def visitSelect_stmt(self, ctx):
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

        return self.visitChildren(ctx)

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

class CustomErrorListener(ErrorListener):
    def __init__(self):
        super(CustomErrorListener, self).__init__()
        self.errors = []

    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
        self.errors.append({"line": line, "message": f"❌ Syntax error at line {line}: {msg}"})

def analyze_sql(sql_content, messages):
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

    visitor = SmellVisitor(messages)
    visitor.visit(tree)

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
        "codeSmells": detailed_messages_list
    }, indent=2)

def read_json_file(file_path):
    with open(file_path, 'r') as file:
        return json.load(file)

if __name__ == "__main__":
    script_dir = os.path.dirname(os.path.realpath(__file__))
    messages_path = os.path.abspath(os.path.join(script_dir, '..', '..', 'resources', 'smell-codes', 'smellCodeDictionary.json'))

    messages = read_json_file(messages_path)

    query = sys.argv[1]
    result = analyze_sql(query, messages)
    print(result)



# def read_sql_file(file_path):
#     with open(file_path, 'r') as file:
#         return file.read()
    
# if __name__ == "__main__":
#     # Ajustar la ruta para subir dos niveles en el directorio
#     script_dir = os.path.dirname(os.path.realpath(__file__))
#     messages_path = os.path.abspath(os.path.join(script_dir, '..', '..', 'resources', 'smell-codes', 'smellCodeDictionary.json'))
#     messages = read_json_file(messages_path)

#     sql_file = 'sql-analyzer-plugin/scripts/test/test_1.sql'  # Ruta al archivo de consultas SQL
#     query = read_sql_file(sql_file)
#     result = analyze_sql(query, messages)
#     print(result)
