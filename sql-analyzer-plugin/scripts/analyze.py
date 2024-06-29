import sys
import json
import os
from antlr4 import *
from antlr4.error.ErrorListener import ErrorListener
from antlr.PostgreSql.PostgreSqlGrammarLexer import PostgreSqlGrammarLexer
from antlr.PostgreSql.PostgreSqlGrammarParser import PostgreSqlGrammarParser
from antlr.PostgreSql.PostgreSqlGrammarVisitor import PostgreSqlGrammarVisitor

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
