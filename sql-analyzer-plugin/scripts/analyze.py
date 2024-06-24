import sys
import json

def analyze_sql(query):
    # Simular análisis léxico
    lexical_errors = []
    if "lex_error" in query:
        lexical_errors.append({"line": 0, "message": "Lexical error at line 1."})

    # Simular análisis sintáctico
    syntax_errors = []
    if "syn_error" in query:
        syntax_errors.append({"line": 2, "message": "Syntax error at line 3."})

    # Simular análisis de smells codes
    code_smells = []
    if not lexical_errors and not syntax_errors:
        code_smells.append({"line": 1, "message": "Consider adding an index at line 2."})
        code_smells.append({"line": 3, "message": "Avoid using SELECT *."})

    # Simular contenido del diagrama
    diagram = "<div>Diagram content here</div>"

    analysis_results = {
        "lexicalErrors": lexical_errors,
        "syntaxErrors": syntax_errors,
        "codeSmells": code_smells,
        "diagram": diagram
    }
    
    return json.dumps(analysis_results)

if __name__ == "__main__":
    query = sys.argv[1]
    result = analyze_sql(query)
    print(result)
