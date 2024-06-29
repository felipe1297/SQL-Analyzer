import sys
import json
from antlr4 import *
from antlr4.error.ErrorListener import ErrorListener
from antlr.PostgreSql.PostgreSqlGrammarLexer import PostgreSqlGrammarLexer
from antlr.PostgreSql.PostgreSqlGrammarParser import PostgreSqlGrammarParser
from antlr.PostgreSql.PostgreSqlGrammarVisitor import PostgreSqlGrammarVisitor

class SmellVisitor(PostgreSqlGrammarVisitor):
    def __init__(self):
        self.smells = []

    def visitSelect_stmt(self, ctx):
        if ctx.STAR():  # Detectar SELECT *
            self.smells.append({
                "line": ctx.start.line,
                "code": "NDB001",
                "message": "⚠️ Selecting all columns can be inefficient and lead to excessive data retrieval.",
                "recommendation": "💡 Select only the necessary columns."
            })
        return self.visitChildren(ctx)

class CustomErrorListener(ErrorListener):
    def __init__(self):
        super(CustomErrorListener, self).__init__()
        self.errors = []

    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
        self.errors.append({"line": line, "message": f"❌ Syntax error at line {line}: {msg}"})

def analyze_sql(sql_content):
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

    visitor = SmellVisitor()
    visitor.visit(tree)

    return json.dumps({
        "lexicalErrors": [],
        "syntaxErrors": [],
        "codeSmells": visitor.smells
    })

if __name__ == "__main__":
    query = sys.argv[1]
    result = analyze_sql(query)
    print(result)

# def read_sql_file(file_path):
#     with open(file_path, 'r') as file:
#         return file.read()
    
# if __name__ == "__main__":
#     sql_file = 'sql-analyzer-plugin/scripts/test/test_1.sql'  # Ruta al archivo de consultas SQL
#     sql_content = read_sql_file(sql_file)
#     result = analyze_sql(sql_content)
#     print(result)
