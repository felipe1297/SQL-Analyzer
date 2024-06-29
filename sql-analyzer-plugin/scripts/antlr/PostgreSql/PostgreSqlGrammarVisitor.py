# Generated from antlr/PostgreSql/PostgreSqlGrammar.g4 by ANTLR 4.13.1
from antlr4 import *
if "." in __name__:
    from .PostgreSqlGrammarParser import PostgreSqlGrammarParser
else:
    from PostgreSqlGrammarParser import PostgreSqlGrammarParser

# This class defines a complete generic visitor for a parse tree produced by PostgreSqlGrammarParser.

class PostgreSqlGrammarVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by PostgreSqlGrammarParser#initial.
    def visitInitial(self, ctx:PostgreSqlGrammarParser.InitialContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSqlGrammarParser#sql_stmt.
    def visitSql_stmt(self, ctx:PostgreSqlGrammarParser.Sql_stmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSqlGrammarParser#select_stmt.
    def visitSelect_stmt(self, ctx:PostgreSqlGrammarParser.Select_stmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSqlGrammarParser#function_stmt.
    def visitFunction_stmt(self, ctx:PostgreSqlGrammarParser.Function_stmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSqlGrammarParser#data_type.
    def visitData_type(self, ctx:PostgreSqlGrammarParser.Data_typeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSqlGrammarParser#function_params.
    def visitFunction_params(self, ctx:PostgreSqlGrammarParser.Function_paramsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSqlGrammarParser#func_body.
    def visitFunc_body(self, ctx:PostgreSqlGrammarParser.Func_bodyContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSqlGrammarParser#create_table_stmt.
    def visitCreate_table_stmt(self, ctx:PostgreSqlGrammarParser.Create_table_stmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSqlGrammarParser#column_def.
    def visitColumn_def(self, ctx:PostgreSqlGrammarParser.Column_defContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSqlGrammarParser#column_constraint.
    def visitColumn_constraint(self, ctx:PostgreSqlGrammarParser.Column_constraintContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSqlGrammarParser#table_constraint.
    def visitTable_constraint(self, ctx:PostgreSqlGrammarParser.Table_constraintContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSqlGrammarParser#column_list.
    def visitColumn_list(self, ctx:PostgreSqlGrammarParser.Column_listContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSqlGrammarParser#create_index_stmt.
    def visitCreate_index_stmt(self, ctx:PostgreSqlGrammarParser.Create_index_stmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSqlGrammarParser#create_database_stmt.
    def visitCreate_database_stmt(self, ctx:PostgreSqlGrammarParser.Create_database_stmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSqlGrammarParser#drop_stmt.
    def visitDrop_stmt(self, ctx:PostgreSqlGrammarParser.Drop_stmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSqlGrammarParser#alter_table_stmt.
    def visitAlter_table_stmt(self, ctx:PostgreSqlGrammarParser.Alter_table_stmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSqlGrammarParser#alter_table_action.
    def visitAlter_table_action(self, ctx:PostgreSqlGrammarParser.Alter_table_actionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSqlGrammarParser#insert_stmt.
    def visitInsert_stmt(self, ctx:PostgreSqlGrammarParser.Insert_stmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSqlGrammarParser#insert_values.
    def visitInsert_values(self, ctx:PostgreSqlGrammarParser.Insert_valuesContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSqlGrammarParser#update_stmt.
    def visitUpdate_stmt(self, ctx:PostgreSqlGrammarParser.Update_stmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSqlGrammarParser#update_assignment.
    def visitUpdate_assignment(self, ctx:PostgreSqlGrammarParser.Update_assignmentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSqlGrammarParser#delete_stmt.
    def visitDelete_stmt(self, ctx:PostgreSqlGrammarParser.Delete_stmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSqlGrammarParser#value.
    def visitValue(self, ctx:PostgreSqlGrammarParser.ValueContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSqlGrammarParser#limit_offset_clause.
    def visitLimit_offset_clause(self, ctx:PostgreSqlGrammarParser.Limit_offset_clauseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSqlGrammarParser#with_clause.
    def visitWith_clause(self, ctx:PostgreSqlGrammarParser.With_clauseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSqlGrammarParser#cte.
    def visitCte(self, ctx:PostgreSqlGrammarParser.CteContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSqlGrammarParser#result_column.
    def visitResult_column(self, ctx:PostgreSqlGrammarParser.Result_columnContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSqlGrammarParser#join_clause.
    def visitJoin_clause(self, ctx:PostgreSqlGrammarParser.Join_clauseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSqlGrammarParser#standard_join.
    def visitStandard_join(self, ctx:PostgreSqlGrammarParser.Standard_joinContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSqlGrammarParser#natural_join.
    def visitNatural_join(self, ctx:PostgreSqlGrammarParser.Natural_joinContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSqlGrammarParser#join_type.
    def visitJoin_type(self, ctx:PostgreSqlGrammarParser.Join_typeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSqlGrammarParser#natural_join_type.
    def visitNatural_join_type(self, ctx:PostgreSqlGrammarParser.Natural_join_typeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSqlGrammarParser#table_reference.
    def visitTable_reference(self, ctx:PostgreSqlGrammarParser.Table_referenceContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSqlGrammarParser#table_name.
    def visitTable_name(self, ctx:PostgreSqlGrammarParser.Table_nameContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSqlGrammarParser#alias.
    def visitAlias(self, ctx:PostgreSqlGrammarParser.AliasContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSqlGrammarParser#group_by_clause.
    def visitGroup_by_clause(self, ctx:PostgreSqlGrammarParser.Group_by_clauseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSqlGrammarParser#group_by_item.
    def visitGroup_by_item(self, ctx:PostgreSqlGrammarParser.Group_by_itemContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSqlGrammarParser#order_by_clause.
    def visitOrder_by_clause(self, ctx:PostgreSqlGrammarParser.Order_by_clauseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSqlGrammarParser#order_by_item.
    def visitOrder_by_item(self, ctx:PostgreSqlGrammarParser.Order_by_itemContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSqlGrammarParser#agg_func.
    def visitAgg_func(self, ctx:PostgreSqlGrammarParser.Agg_funcContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSqlGrammarParser#expr.
    def visitExpr(self, ctx:PostgreSqlGrammarParser.ExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSqlGrammarParser#arith_expr.
    def visitArith_expr(self, ctx:PostgreSqlGrammarParser.Arith_exprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSqlGrammarParser#atom.
    def visitAtom(self, ctx:PostgreSqlGrammarParser.AtomContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSqlGrammarParser#case_expr.
    def visitCase_expr(self, ctx:PostgreSqlGrammarParser.Case_exprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSqlGrammarParser#when_clause.
    def visitWhen_clause(self, ctx:PostgreSqlGrammarParser.When_clauseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSqlGrammarParser#function_call.
    def visitFunction_call(self, ctx:PostgreSqlGrammarParser.Function_callContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PostgreSqlGrammarParser#function_arg.
    def visitFunction_arg(self, ctx:PostgreSqlGrammarParser.Function_argContext):
        return self.visitChildren(ctx)



del PostgreSqlGrammarParser