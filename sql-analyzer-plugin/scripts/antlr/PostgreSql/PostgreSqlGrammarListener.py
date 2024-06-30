# Generated from antlr/PostgreSql/PostgreSqlGrammar.g4 by ANTLR 4.13.1
from antlr4 import *
if "." in __name__:
    from .PostgreSqlGrammarParser import PostgreSqlGrammarParser
else:
    from PostgreSqlGrammarParser import PostgreSqlGrammarParser

# This class defines a complete listener for a parse tree produced by PostgreSqlGrammarParser.
class PostgreSqlGrammarListener(ParseTreeListener):

    # Enter a parse tree produced by PostgreSqlGrammarParser#initial.
    def enterInitial(self, ctx:PostgreSqlGrammarParser.InitialContext):
        pass

    # Exit a parse tree produced by PostgreSqlGrammarParser#initial.
    def exitInitial(self, ctx:PostgreSqlGrammarParser.InitialContext):
        pass


    # Enter a parse tree produced by PostgreSqlGrammarParser#sql_stmt.
    def enterSql_stmt(self, ctx:PostgreSqlGrammarParser.Sql_stmtContext):
        pass

    # Exit a parse tree produced by PostgreSqlGrammarParser#sql_stmt.
    def exitSql_stmt(self, ctx:PostgreSqlGrammarParser.Sql_stmtContext):
        pass


    # Enter a parse tree produced by PostgreSqlGrammarParser#select_stmt.
    def enterSelect_stmt(self, ctx:PostgreSqlGrammarParser.Select_stmtContext):
        pass

    # Exit a parse tree produced by PostgreSqlGrammarParser#select_stmt.
    def exitSelect_stmt(self, ctx:PostgreSqlGrammarParser.Select_stmtContext):
        pass


    # Enter a parse tree produced by PostgreSqlGrammarParser#limit_offset_clause.
    def enterLimit_offset_clause(self, ctx:PostgreSqlGrammarParser.Limit_offset_clauseContext):
        pass

    # Exit a parse tree produced by PostgreSqlGrammarParser#limit_offset_clause.
    def exitLimit_offset_clause(self, ctx:PostgreSqlGrammarParser.Limit_offset_clauseContext):
        pass


    # Enter a parse tree produced by PostgreSqlGrammarParser#function_stmt.
    def enterFunction_stmt(self, ctx:PostgreSqlGrammarParser.Function_stmtContext):
        pass

    # Exit a parse tree produced by PostgreSqlGrammarParser#function_stmt.
    def exitFunction_stmt(self, ctx:PostgreSqlGrammarParser.Function_stmtContext):
        pass


    # Enter a parse tree produced by PostgreSqlGrammarParser#data_type.
    def enterData_type(self, ctx:PostgreSqlGrammarParser.Data_typeContext):
        pass

    # Exit a parse tree produced by PostgreSqlGrammarParser#data_type.
    def exitData_type(self, ctx:PostgreSqlGrammarParser.Data_typeContext):
        pass


    # Enter a parse tree produced by PostgreSqlGrammarParser#function_params.
    def enterFunction_params(self, ctx:PostgreSqlGrammarParser.Function_paramsContext):
        pass

    # Exit a parse tree produced by PostgreSqlGrammarParser#function_params.
    def exitFunction_params(self, ctx:PostgreSqlGrammarParser.Function_paramsContext):
        pass


    # Enter a parse tree produced by PostgreSqlGrammarParser#func_body.
    def enterFunc_body(self, ctx:PostgreSqlGrammarParser.Func_bodyContext):
        pass

    # Exit a parse tree produced by PostgreSqlGrammarParser#func_body.
    def exitFunc_body(self, ctx:PostgreSqlGrammarParser.Func_bodyContext):
        pass


    # Enter a parse tree produced by PostgreSqlGrammarParser#create_table_stmt.
    def enterCreate_table_stmt(self, ctx:PostgreSqlGrammarParser.Create_table_stmtContext):
        pass

    # Exit a parse tree produced by PostgreSqlGrammarParser#create_table_stmt.
    def exitCreate_table_stmt(self, ctx:PostgreSqlGrammarParser.Create_table_stmtContext):
        pass


    # Enter a parse tree produced by PostgreSqlGrammarParser#column_def.
    def enterColumn_def(self, ctx:PostgreSqlGrammarParser.Column_defContext):
        pass

    # Exit a parse tree produced by PostgreSqlGrammarParser#column_def.
    def exitColumn_def(self, ctx:PostgreSqlGrammarParser.Column_defContext):
        pass


    # Enter a parse tree produced by PostgreSqlGrammarParser#column_constraint.
    def enterColumn_constraint(self, ctx:PostgreSqlGrammarParser.Column_constraintContext):
        pass

    # Exit a parse tree produced by PostgreSqlGrammarParser#column_constraint.
    def exitColumn_constraint(self, ctx:PostgreSqlGrammarParser.Column_constraintContext):
        pass


    # Enter a parse tree produced by PostgreSqlGrammarParser#table_constraint.
    def enterTable_constraint(self, ctx:PostgreSqlGrammarParser.Table_constraintContext):
        pass

    # Exit a parse tree produced by PostgreSqlGrammarParser#table_constraint.
    def exitTable_constraint(self, ctx:PostgreSqlGrammarParser.Table_constraintContext):
        pass


    # Enter a parse tree produced by PostgreSqlGrammarParser#column_list.
    def enterColumn_list(self, ctx:PostgreSqlGrammarParser.Column_listContext):
        pass

    # Exit a parse tree produced by PostgreSqlGrammarParser#column_list.
    def exitColumn_list(self, ctx:PostgreSqlGrammarParser.Column_listContext):
        pass


    # Enter a parse tree produced by PostgreSqlGrammarParser#create_index_stmt.
    def enterCreate_index_stmt(self, ctx:PostgreSqlGrammarParser.Create_index_stmtContext):
        pass

    # Exit a parse tree produced by PostgreSqlGrammarParser#create_index_stmt.
    def exitCreate_index_stmt(self, ctx:PostgreSqlGrammarParser.Create_index_stmtContext):
        pass


    # Enter a parse tree produced by PostgreSqlGrammarParser#create_database_stmt.
    def enterCreate_database_stmt(self, ctx:PostgreSqlGrammarParser.Create_database_stmtContext):
        pass

    # Exit a parse tree produced by PostgreSqlGrammarParser#create_database_stmt.
    def exitCreate_database_stmt(self, ctx:PostgreSqlGrammarParser.Create_database_stmtContext):
        pass


    # Enter a parse tree produced by PostgreSqlGrammarParser#drop_stmt.
    def enterDrop_stmt(self, ctx:PostgreSqlGrammarParser.Drop_stmtContext):
        pass

    # Exit a parse tree produced by PostgreSqlGrammarParser#drop_stmt.
    def exitDrop_stmt(self, ctx:PostgreSqlGrammarParser.Drop_stmtContext):
        pass


    # Enter a parse tree produced by PostgreSqlGrammarParser#alter_table_stmt.
    def enterAlter_table_stmt(self, ctx:PostgreSqlGrammarParser.Alter_table_stmtContext):
        pass

    # Exit a parse tree produced by PostgreSqlGrammarParser#alter_table_stmt.
    def exitAlter_table_stmt(self, ctx:PostgreSqlGrammarParser.Alter_table_stmtContext):
        pass


    # Enter a parse tree produced by PostgreSqlGrammarParser#alter_table_action.
    def enterAlter_table_action(self, ctx:PostgreSqlGrammarParser.Alter_table_actionContext):
        pass

    # Exit a parse tree produced by PostgreSqlGrammarParser#alter_table_action.
    def exitAlter_table_action(self, ctx:PostgreSqlGrammarParser.Alter_table_actionContext):
        pass


    # Enter a parse tree produced by PostgreSqlGrammarParser#insert_stmt.
    def enterInsert_stmt(self, ctx:PostgreSqlGrammarParser.Insert_stmtContext):
        pass

    # Exit a parse tree produced by PostgreSqlGrammarParser#insert_stmt.
    def exitInsert_stmt(self, ctx:PostgreSqlGrammarParser.Insert_stmtContext):
        pass


    # Enter a parse tree produced by PostgreSqlGrammarParser#insert_values.
    def enterInsert_values(self, ctx:PostgreSqlGrammarParser.Insert_valuesContext):
        pass

    # Exit a parse tree produced by PostgreSqlGrammarParser#insert_values.
    def exitInsert_values(self, ctx:PostgreSqlGrammarParser.Insert_valuesContext):
        pass


    # Enter a parse tree produced by PostgreSqlGrammarParser#update_stmt.
    def enterUpdate_stmt(self, ctx:PostgreSqlGrammarParser.Update_stmtContext):
        pass

    # Exit a parse tree produced by PostgreSqlGrammarParser#update_stmt.
    def exitUpdate_stmt(self, ctx:PostgreSqlGrammarParser.Update_stmtContext):
        pass


    # Enter a parse tree produced by PostgreSqlGrammarParser#update_assignment.
    def enterUpdate_assignment(self, ctx:PostgreSqlGrammarParser.Update_assignmentContext):
        pass

    # Exit a parse tree produced by PostgreSqlGrammarParser#update_assignment.
    def exitUpdate_assignment(self, ctx:PostgreSqlGrammarParser.Update_assignmentContext):
        pass


    # Enter a parse tree produced by PostgreSqlGrammarParser#delete_stmt.
    def enterDelete_stmt(self, ctx:PostgreSqlGrammarParser.Delete_stmtContext):
        pass

    # Exit a parse tree produced by PostgreSqlGrammarParser#delete_stmt.
    def exitDelete_stmt(self, ctx:PostgreSqlGrammarParser.Delete_stmtContext):
        pass


    # Enter a parse tree produced by PostgreSqlGrammarParser#value.
    def enterValue(self, ctx:PostgreSqlGrammarParser.ValueContext):
        pass

    # Exit a parse tree produced by PostgreSqlGrammarParser#value.
    def exitValue(self, ctx:PostgreSqlGrammarParser.ValueContext):
        pass


    # Enter a parse tree produced by PostgreSqlGrammarParser#with_clause.
    def enterWith_clause(self, ctx:PostgreSqlGrammarParser.With_clauseContext):
        pass

    # Exit a parse tree produced by PostgreSqlGrammarParser#with_clause.
    def exitWith_clause(self, ctx:PostgreSqlGrammarParser.With_clauseContext):
        pass


    # Enter a parse tree produced by PostgreSqlGrammarParser#cte.
    def enterCte(self, ctx:PostgreSqlGrammarParser.CteContext):
        pass

    # Exit a parse tree produced by PostgreSqlGrammarParser#cte.
    def exitCte(self, ctx:PostgreSqlGrammarParser.CteContext):
        pass


    # Enter a parse tree produced by PostgreSqlGrammarParser#result_column.
    def enterResult_column(self, ctx:PostgreSqlGrammarParser.Result_columnContext):
        pass

    # Exit a parse tree produced by PostgreSqlGrammarParser#result_column.
    def exitResult_column(self, ctx:PostgreSqlGrammarParser.Result_columnContext):
        pass


    # Enter a parse tree produced by PostgreSqlGrammarParser#join_clause.
    def enterJoin_clause(self, ctx:PostgreSqlGrammarParser.Join_clauseContext):
        pass

    # Exit a parse tree produced by PostgreSqlGrammarParser#join_clause.
    def exitJoin_clause(self, ctx:PostgreSqlGrammarParser.Join_clauseContext):
        pass


    # Enter a parse tree produced by PostgreSqlGrammarParser#standard_join.
    def enterStandard_join(self, ctx:PostgreSqlGrammarParser.Standard_joinContext):
        pass

    # Exit a parse tree produced by PostgreSqlGrammarParser#standard_join.
    def exitStandard_join(self, ctx:PostgreSqlGrammarParser.Standard_joinContext):
        pass


    # Enter a parse tree produced by PostgreSqlGrammarParser#natural_join.
    def enterNatural_join(self, ctx:PostgreSqlGrammarParser.Natural_joinContext):
        pass

    # Exit a parse tree produced by PostgreSqlGrammarParser#natural_join.
    def exitNatural_join(self, ctx:PostgreSqlGrammarParser.Natural_joinContext):
        pass


    # Enter a parse tree produced by PostgreSqlGrammarParser#join_type.
    def enterJoin_type(self, ctx:PostgreSqlGrammarParser.Join_typeContext):
        pass

    # Exit a parse tree produced by PostgreSqlGrammarParser#join_type.
    def exitJoin_type(self, ctx:PostgreSqlGrammarParser.Join_typeContext):
        pass


    # Enter a parse tree produced by PostgreSqlGrammarParser#natural_join_type.
    def enterNatural_join_type(self, ctx:PostgreSqlGrammarParser.Natural_join_typeContext):
        pass

    # Exit a parse tree produced by PostgreSqlGrammarParser#natural_join_type.
    def exitNatural_join_type(self, ctx:PostgreSqlGrammarParser.Natural_join_typeContext):
        pass


    # Enter a parse tree produced by PostgreSqlGrammarParser#table_reference.
    def enterTable_reference(self, ctx:PostgreSqlGrammarParser.Table_referenceContext):
        pass

    # Exit a parse tree produced by PostgreSqlGrammarParser#table_reference.
    def exitTable_reference(self, ctx:PostgreSqlGrammarParser.Table_referenceContext):
        pass


    # Enter a parse tree produced by PostgreSqlGrammarParser#table_name.
    def enterTable_name(self, ctx:PostgreSqlGrammarParser.Table_nameContext):
        pass

    # Exit a parse tree produced by PostgreSqlGrammarParser#table_name.
    def exitTable_name(self, ctx:PostgreSqlGrammarParser.Table_nameContext):
        pass


    # Enter a parse tree produced by PostgreSqlGrammarParser#alias.
    def enterAlias(self, ctx:PostgreSqlGrammarParser.AliasContext):
        pass

    # Exit a parse tree produced by PostgreSqlGrammarParser#alias.
    def exitAlias(self, ctx:PostgreSqlGrammarParser.AliasContext):
        pass


    # Enter a parse tree produced by PostgreSqlGrammarParser#group_by_clause.
    def enterGroup_by_clause(self, ctx:PostgreSqlGrammarParser.Group_by_clauseContext):
        pass

    # Exit a parse tree produced by PostgreSqlGrammarParser#group_by_clause.
    def exitGroup_by_clause(self, ctx:PostgreSqlGrammarParser.Group_by_clauseContext):
        pass


    # Enter a parse tree produced by PostgreSqlGrammarParser#group_by_item.
    def enterGroup_by_item(self, ctx:PostgreSqlGrammarParser.Group_by_itemContext):
        pass

    # Exit a parse tree produced by PostgreSqlGrammarParser#group_by_item.
    def exitGroup_by_item(self, ctx:PostgreSqlGrammarParser.Group_by_itemContext):
        pass


    # Enter a parse tree produced by PostgreSqlGrammarParser#order_by_clause.
    def enterOrder_by_clause(self, ctx:PostgreSqlGrammarParser.Order_by_clauseContext):
        pass

    # Exit a parse tree produced by PostgreSqlGrammarParser#order_by_clause.
    def exitOrder_by_clause(self, ctx:PostgreSqlGrammarParser.Order_by_clauseContext):
        pass


    # Enter a parse tree produced by PostgreSqlGrammarParser#order_by_item.
    def enterOrder_by_item(self, ctx:PostgreSqlGrammarParser.Order_by_itemContext):
        pass

    # Exit a parse tree produced by PostgreSqlGrammarParser#order_by_item.
    def exitOrder_by_item(self, ctx:PostgreSqlGrammarParser.Order_by_itemContext):
        pass


    # Enter a parse tree produced by PostgreSqlGrammarParser#agg_func.
    def enterAgg_func(self, ctx:PostgreSqlGrammarParser.Agg_funcContext):
        pass

    # Exit a parse tree produced by PostgreSqlGrammarParser#agg_func.
    def exitAgg_func(self, ctx:PostgreSqlGrammarParser.Agg_funcContext):
        pass


    # Enter a parse tree produced by PostgreSqlGrammarParser#expr.
    def enterExpr(self, ctx:PostgreSqlGrammarParser.ExprContext):
        pass

    # Exit a parse tree produced by PostgreSqlGrammarParser#expr.
    def exitExpr(self, ctx:PostgreSqlGrammarParser.ExprContext):
        pass


    # Enter a parse tree produced by PostgreSqlGrammarParser#arith_expr.
    def enterArith_expr(self, ctx:PostgreSqlGrammarParser.Arith_exprContext):
        pass

    # Exit a parse tree produced by PostgreSqlGrammarParser#arith_expr.
    def exitArith_expr(self, ctx:PostgreSqlGrammarParser.Arith_exprContext):
        pass


    # Enter a parse tree produced by PostgreSqlGrammarParser#atom.
    def enterAtom(self, ctx:PostgreSqlGrammarParser.AtomContext):
        pass

    # Exit a parse tree produced by PostgreSqlGrammarParser#atom.
    def exitAtom(self, ctx:PostgreSqlGrammarParser.AtomContext):
        pass


    # Enter a parse tree produced by PostgreSqlGrammarParser#case_expr.
    def enterCase_expr(self, ctx:PostgreSqlGrammarParser.Case_exprContext):
        pass

    # Exit a parse tree produced by PostgreSqlGrammarParser#case_expr.
    def exitCase_expr(self, ctx:PostgreSqlGrammarParser.Case_exprContext):
        pass


    # Enter a parse tree produced by PostgreSqlGrammarParser#when_clause.
    def enterWhen_clause(self, ctx:PostgreSqlGrammarParser.When_clauseContext):
        pass

    # Exit a parse tree produced by PostgreSqlGrammarParser#when_clause.
    def exitWhen_clause(self, ctx:PostgreSqlGrammarParser.When_clauseContext):
        pass


    # Enter a parse tree produced by PostgreSqlGrammarParser#function_call.
    def enterFunction_call(self, ctx:PostgreSqlGrammarParser.Function_callContext):
        pass

    # Exit a parse tree produced by PostgreSqlGrammarParser#function_call.
    def exitFunction_call(self, ctx:PostgreSqlGrammarParser.Function_callContext):
        pass


    # Enter a parse tree produced by PostgreSqlGrammarParser#function_arg.
    def enterFunction_arg(self, ctx:PostgreSqlGrammarParser.Function_argContext):
        pass

    # Exit a parse tree produced by PostgreSqlGrammarParser#function_arg.
    def exitFunction_arg(self, ctx:PostgreSqlGrammarParser.Function_argContext):
        pass



del PostgreSqlGrammarParser