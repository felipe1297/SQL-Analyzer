# Generated from antlr/postgresqlgrammar.g4 by ANTLR 4.9.3
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .postgresqlgrammarParser import postgresqlgrammarParser
else:
    from postgresqlgrammarParser import postgresqlgrammarParser

# This class defines a complete listener for a parse tree produced by postgresqlgrammarParser.
class postgresqlgrammarListener(ParseTreeListener):

    # Enter a parse tree produced by postgresqlgrammarParser#initial.
    def enterInitial(self, ctx:postgresqlgrammarParser.InitialContext):
        pass

    # Exit a parse tree produced by postgresqlgrammarParser#initial.
    def exitInitial(self, ctx:postgresqlgrammarParser.InitialContext):
        pass


    # Enter a parse tree produced by postgresqlgrammarParser#statement.
    def enterStatement(self, ctx:postgresqlgrammarParser.StatementContext):
        pass

    # Exit a parse tree produced by postgresqlgrammarParser#statement.
    def exitStatement(self, ctx:postgresqlgrammarParser.StatementContext):
        pass


    # Enter a parse tree produced by postgresqlgrammarParser#escrStatement.
    def enterEscrStatement(self, ctx:postgresqlgrammarParser.EscrStatementContext):
        pass

    # Exit a parse tree produced by postgresqlgrammarParser#escrStatement.
    def exitEscrStatement(self, ctx:postgresqlgrammarParser.EscrStatementContext):
        pass


    # Enter a parse tree produced by postgresqlgrammarParser#expr.
    def enterExpr(self, ctx:postgresqlgrammarParser.ExprContext):
        pass

    # Exit a parse tree produced by postgresqlgrammarParser#expr.
    def exitExpr(self, ctx:postgresqlgrammarParser.ExprContext):
        pass


    # Enter a parse tree produced by postgresqlgrammarParser#id.
    def enterId(self, ctx:postgresqlgrammarParser.IdContext):
        pass

    # Exit a parse tree produced by postgresqlgrammarParser#id.
    def exitId(self, ctx:postgresqlgrammarParser.IdContext):
        pass


    # Enter a parse tree produced by postgresqlgrammarParser#funStatement.
    def enterFunStatement(self, ctx:postgresqlgrammarParser.FunStatementContext):
        pass

    # Exit a parse tree produced by postgresqlgrammarParser#funStatement.
    def exitFunStatement(self, ctx:postgresqlgrammarParser.FunStatementContext):
        pass


    # Enter a parse tree produced by postgresqlgrammarParser#convertStatement.
    def enterConvertStatement(self, ctx:postgresqlgrammarParser.ConvertStatementContext):
        pass

    # Exit a parse tree produced by postgresqlgrammarParser#convertStatement.
    def exitConvertStatement(self, ctx:postgresqlgrammarParser.ConvertStatementContext):
        pass


    # Enter a parse tree produced by postgresqlgrammarParser#assignStatement.
    def enterAssignStatement(self, ctx:postgresqlgrammarParser.AssignStatementContext):
        pass

    # Exit a parse tree produced by postgresqlgrammarParser#assignStatement.
    def exitAssignStatement(self, ctx:postgresqlgrammarParser.AssignStatementContext):
        pass


    # Enter a parse tree produced by postgresqlgrammarParser#ifStatement.
    def enterIfStatement(self, ctx:postgresqlgrammarParser.IfStatementContext):
        pass

    # Exit a parse tree produced by postgresqlgrammarParser#ifStatement.
    def exitIfStatement(self, ctx:postgresqlgrammarParser.IfStatementContext):
        pass


    # Enter a parse tree produced by postgresqlgrammarParser#whileStatement.
    def enterWhileStatement(self, ctx:postgresqlgrammarParser.WhileStatementContext):
        pass

    # Exit a parse tree produced by postgresqlgrammarParser#whileStatement.
    def exitWhileStatement(self, ctx:postgresqlgrammarParser.WhileStatementContext):
        pass


    # Enter a parse tree produced by postgresqlgrammarParser#forStatement.
    def enterForStatement(self, ctx:postgresqlgrammarParser.ForStatementContext):
        pass

    # Exit a parse tree produced by postgresqlgrammarParser#forStatement.
    def exitForStatement(self, ctx:postgresqlgrammarParser.ForStatementContext):
        pass


    # Enter a parse tree produced by postgresqlgrammarParser#switchStatement.
    def enterSwitchStatement(self, ctx:postgresqlgrammarParser.SwitchStatementContext):
        pass

    # Exit a parse tree produced by postgresqlgrammarParser#switchStatement.
    def exitSwitchStatement(self, ctx:postgresqlgrammarParser.SwitchStatementContext):
        pass



del postgresqlgrammarParser