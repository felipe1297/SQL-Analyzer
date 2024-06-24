# Generated from antlr/PostgreSql/postgreSqlGrammar.g4 by ANTLR 4.13.1
from antlr4 import *
if "." in __name__:
    from .postgreSqlGrammarParser import postgreSqlGrammarParser
else:
    from postgreSqlGrammarParser import postgreSqlGrammarParser

# This class defines a complete listener for a parse tree produced by postgreSqlGrammarParser.
class postgreSqlGrammarListener(ParseTreeListener):

    # Enter a parse tree produced by postgreSqlGrammarParser#sql_stmt.
    def enterSql_stmt(self, ctx:postgreSqlGrammarParser.Sql_stmtContext):
        pass

    # Exit a parse tree produced by postgreSqlGrammarParser#sql_stmt.
    def exitSql_stmt(self, ctx:postgreSqlGrammarParser.Sql_stmtContext):
        pass


    # Enter a parse tree produced by postgreSqlGrammarParser#select_stmt.
    def enterSelect_stmt(self, ctx:postgreSqlGrammarParser.Select_stmtContext):
        pass

    # Exit a parse tree produced by postgreSqlGrammarParser#select_stmt.
    def exitSelect_stmt(self, ctx:postgreSqlGrammarParser.Select_stmtContext):
        pass


    # Enter a parse tree produced by postgreSqlGrammarParser#function_stmt.
    def enterFunction_stmt(self, ctx:postgreSqlGrammarParser.Function_stmtContext):
        pass

    # Exit a parse tree produced by postgreSqlGrammarParser#function_stmt.
    def exitFunction_stmt(self, ctx:postgreSqlGrammarParser.Function_stmtContext):
        pass


    # Enter a parse tree produced by postgreSqlGrammarParser#data_type.
    def enterData_type(self, ctx:postgreSqlGrammarParser.Data_typeContext):
        pass

    # Exit a parse tree produced by postgreSqlGrammarParser#data_type.
    def exitData_type(self, ctx:postgreSqlGrammarParser.Data_typeContext):
        pass


    # Enter a parse tree produced by postgreSqlGrammarParser#function_params.
    def enterFunction_params(self, ctx:postgreSqlGrammarParser.Function_paramsContext):
        pass

    # Exit a parse tree produced by postgreSqlGrammarParser#function_params.
    def exitFunction_params(self, ctx:postgreSqlGrammarParser.Function_paramsContext):
        pass


    # Enter a parse tree produced by postgreSqlGrammarParser#func_body.
    def enterFunc_body(self, ctx:postgreSqlGrammarParser.Func_bodyContext):
        pass

    # Exit a parse tree produced by postgreSqlGrammarParser#func_body.
    def exitFunc_body(self, ctx:postgreSqlGrammarParser.Func_bodyContext):
        pass


    # Enter a parse tree produced by postgreSqlGrammarParser#create_table_stmt.
    def enterCreate_table_stmt(self, ctx:postgreSqlGrammarParser.Create_table_stmtContext):
        pass

    # Exit a parse tree produced by postgreSqlGrammarParser#create_table_stmt.
    def exitCreate_table_stmt(self, ctx:postgreSqlGrammarParser.Create_table_stmtContext):
        pass


    # Enter a parse tree produced by postgreSqlGrammarParser#column_def.
    def enterColumn_def(self, ctx:postgreSqlGrammarParser.Column_defContext):
        pass

    # Exit a parse tree produced by postgreSqlGrammarParser#column_def.
    def exitColumn_def(self, ctx:postgreSqlGrammarParser.Column_defContext):
        pass


    # Enter a parse tree produced by postgreSqlGrammarParser#column_constraint.
    def enterColumn_constraint(self, ctx:postgreSqlGrammarParser.Column_constraintContext):
        pass

    # Exit a parse tree produced by postgreSqlGrammarParser#column_constraint.
    def exitColumn_constraint(self, ctx:postgreSqlGrammarParser.Column_constraintContext):
        pass


    # Enter a parse tree produced by postgreSqlGrammarParser#table_constraint.
    def enterTable_constraint(self, ctx:postgreSqlGrammarParser.Table_constraintContext):
        pass

    # Exit a parse tree produced by postgreSqlGrammarParser#table_constraint.
    def exitTable_constraint(self, ctx:postgreSqlGrammarParser.Table_constraintContext):
        pass


    # Enter a parse tree produced by postgreSqlGrammarParser#column_list.
    def enterColumn_list(self, ctx:postgreSqlGrammarParser.Column_listContext):
        pass

    # Exit a parse tree produced by postgreSqlGrammarParser#column_list.
    def exitColumn_list(self, ctx:postgreSqlGrammarParser.Column_listContext):
        pass


    # Enter a parse tree produced by postgreSqlGrammarParser#create_index_stmt.
    def enterCreate_index_stmt(self, ctx:postgreSqlGrammarParser.Create_index_stmtContext):
        pass

    # Exit a parse tree produced by postgreSqlGrammarParser#create_index_stmt.
    def exitCreate_index_stmt(self, ctx:postgreSqlGrammarParser.Create_index_stmtContext):
        pass


    # Enter a parse tree produced by postgreSqlGrammarParser#create_database_stmt.
    def enterCreate_database_stmt(self, ctx:postgreSqlGrammarParser.Create_database_stmtContext):
        pass

    # Exit a parse tree produced by postgreSqlGrammarParser#create_database_stmt.
    def exitCreate_database_stmt(self, ctx:postgreSqlGrammarParser.Create_database_stmtContext):
        pass


    # Enter a parse tree produced by postgreSqlGrammarParser#drop_stmt.
    def enterDrop_stmt(self, ctx:postgreSqlGrammarParser.Drop_stmtContext):
        pass

    # Exit a parse tree produced by postgreSqlGrammarParser#drop_stmt.
    def exitDrop_stmt(self, ctx:postgreSqlGrammarParser.Drop_stmtContext):
        pass


    # Enter a parse tree produced by postgreSqlGrammarParser#alter_table_stmt.
    def enterAlter_table_stmt(self, ctx:postgreSqlGrammarParser.Alter_table_stmtContext):
        pass

    # Exit a parse tree produced by postgreSqlGrammarParser#alter_table_stmt.
    def exitAlter_table_stmt(self, ctx:postgreSqlGrammarParser.Alter_table_stmtContext):
        pass


    # Enter a parse tree produced by postgreSqlGrammarParser#alter_table_action.
    def enterAlter_table_action(self, ctx:postgreSqlGrammarParser.Alter_table_actionContext):
        pass

    # Exit a parse tree produced by postgreSqlGrammarParser#alter_table_action.
    def exitAlter_table_action(self, ctx:postgreSqlGrammarParser.Alter_table_actionContext):
        pass


    # Enter a parse tree produced by postgreSqlGrammarParser#insert_stmt.
    def enterInsert_stmt(self, ctx:postgreSqlGrammarParser.Insert_stmtContext):
        pass

    # Exit a parse tree produced by postgreSqlGrammarParser#insert_stmt.
    def exitInsert_stmt(self, ctx:postgreSqlGrammarParser.Insert_stmtContext):
        pass


    # Enter a parse tree produced by postgreSqlGrammarParser#insert_values.
    def enterInsert_values(self, ctx:postgreSqlGrammarParser.Insert_valuesContext):
        pass

    # Exit a parse tree produced by postgreSqlGrammarParser#insert_values.
    def exitInsert_values(self, ctx:postgreSqlGrammarParser.Insert_valuesContext):
        pass


    # Enter a parse tree produced by postgreSqlGrammarParser#update_stmt.
    def enterUpdate_stmt(self, ctx:postgreSqlGrammarParser.Update_stmtContext):
        pass

    # Exit a parse tree produced by postgreSqlGrammarParser#update_stmt.
    def exitUpdate_stmt(self, ctx:postgreSqlGrammarParser.Update_stmtContext):
        pass


    # Enter a parse tree produced by postgreSqlGrammarParser#update_assignment.
    def enterUpdate_assignment(self, ctx:postgreSqlGrammarParser.Update_assignmentContext):
        pass

    # Exit a parse tree produced by postgreSqlGrammarParser#update_assignment.
    def exitUpdate_assignment(self, ctx:postgreSqlGrammarParser.Update_assignmentContext):
        pass


    # Enter a parse tree produced by postgreSqlGrammarParser#delete_stmt.
    def enterDelete_stmt(self, ctx:postgreSqlGrammarParser.Delete_stmtContext):
        pass

    # Exit a parse tree produced by postgreSqlGrammarParser#delete_stmt.
    def exitDelete_stmt(self, ctx:postgreSqlGrammarParser.Delete_stmtContext):
        pass


    # Enter a parse tree produced by postgreSqlGrammarParser#value.
    def enterValue(self, ctx:postgreSqlGrammarParser.ValueContext):
        pass

    # Exit a parse tree produced by postgreSqlGrammarParser#value.
    def exitValue(self, ctx:postgreSqlGrammarParser.ValueContext):
        pass


    # Enter a parse tree produced by postgreSqlGrammarParser#limit_offset_clause.
    def enterLimit_offset_clause(self, ctx:postgreSqlGrammarParser.Limit_offset_clauseContext):
        pass

    # Exit a parse tree produced by postgreSqlGrammarParser#limit_offset_clause.
    def exitLimit_offset_clause(self, ctx:postgreSqlGrammarParser.Limit_offset_clauseContext):
        pass


    # Enter a parse tree produced by postgreSqlGrammarParser#with_clause.
    def enterWith_clause(self, ctx:postgreSqlGrammarParser.With_clauseContext):
        pass

    # Exit a parse tree produced by postgreSqlGrammarParser#with_clause.
    def exitWith_clause(self, ctx:postgreSqlGrammarParser.With_clauseContext):
        pass


    # Enter a parse tree produced by postgreSqlGrammarParser#cte.
    def enterCte(self, ctx:postgreSqlGrammarParser.CteContext):
        pass

    # Exit a parse tree produced by postgreSqlGrammarParser#cte.
    def exitCte(self, ctx:postgreSqlGrammarParser.CteContext):
        pass


    # Enter a parse tree produced by postgreSqlGrammarParser#result_column.
    def enterResult_column(self, ctx:postgreSqlGrammarParser.Result_columnContext):
        pass

    # Exit a parse tree produced by postgreSqlGrammarParser#result_column.
    def exitResult_column(self, ctx:postgreSqlGrammarParser.Result_columnContext):
        pass


    # Enter a parse tree produced by postgreSqlGrammarParser#join_clause.
    def enterJoin_clause(self, ctx:postgreSqlGrammarParser.Join_clauseContext):
        pass

    # Exit a parse tree produced by postgreSqlGrammarParser#join_clause.
    def exitJoin_clause(self, ctx:postgreSqlGrammarParser.Join_clauseContext):
        pass


    # Enter a parse tree produced by postgreSqlGrammarParser#standard_join.
    def enterStandard_join(self, ctx:postgreSqlGrammarParser.Standard_joinContext):
        pass

    # Exit a parse tree produced by postgreSqlGrammarParser#standard_join.
    def exitStandard_join(self, ctx:postgreSqlGrammarParser.Standard_joinContext):
        pass


    # Enter a parse tree produced by postgreSqlGrammarParser#natural_join.
    def enterNatural_join(self, ctx:postgreSqlGrammarParser.Natural_joinContext):
        pass

    # Exit a parse tree produced by postgreSqlGrammarParser#natural_join.
    def exitNatural_join(self, ctx:postgreSqlGrammarParser.Natural_joinContext):
        pass


    # Enter a parse tree produced by postgreSqlGrammarParser#join_type.
    def enterJoin_type(self, ctx:postgreSqlGrammarParser.Join_typeContext):
        pass

    # Exit a parse tree produced by postgreSqlGrammarParser#join_type.
    def exitJoin_type(self, ctx:postgreSqlGrammarParser.Join_typeContext):
        pass


    # Enter a parse tree produced by postgreSqlGrammarParser#natural_join_type.
    def enterNatural_join_type(self, ctx:postgreSqlGrammarParser.Natural_join_typeContext):
        pass

    # Exit a parse tree produced by postgreSqlGrammarParser#natural_join_type.
    def exitNatural_join_type(self, ctx:postgreSqlGrammarParser.Natural_join_typeContext):
        pass


    # Enter a parse tree produced by postgreSqlGrammarParser#table_reference.
    def enterTable_reference(self, ctx:postgreSqlGrammarParser.Table_referenceContext):
        pass

    # Exit a parse tree produced by postgreSqlGrammarParser#table_reference.
    def exitTable_reference(self, ctx:postgreSqlGrammarParser.Table_referenceContext):
        pass


    # Enter a parse tree produced by postgreSqlGrammarParser#table_name.
    def enterTable_name(self, ctx:postgreSqlGrammarParser.Table_nameContext):
        pass

    # Exit a parse tree produced by postgreSqlGrammarParser#table_name.
    def exitTable_name(self, ctx:postgreSqlGrammarParser.Table_nameContext):
        pass


    # Enter a parse tree produced by postgreSqlGrammarParser#alias.
    def enterAlias(self, ctx:postgreSqlGrammarParser.AliasContext):
        pass

    # Exit a parse tree produced by postgreSqlGrammarParser#alias.
    def exitAlias(self, ctx:postgreSqlGrammarParser.AliasContext):
        pass


    # Enter a parse tree produced by postgreSqlGrammarParser#group_by_clause.
    def enterGroup_by_clause(self, ctx:postgreSqlGrammarParser.Group_by_clauseContext):
        pass

    # Exit a parse tree produced by postgreSqlGrammarParser#group_by_clause.
    def exitGroup_by_clause(self, ctx:postgreSqlGrammarParser.Group_by_clauseContext):
        pass


    # Enter a parse tree produced by postgreSqlGrammarParser#group_by_item.
    def enterGroup_by_item(self, ctx:postgreSqlGrammarParser.Group_by_itemContext):
        pass

    # Exit a parse tree produced by postgreSqlGrammarParser#group_by_item.
    def exitGroup_by_item(self, ctx:postgreSqlGrammarParser.Group_by_itemContext):
        pass


    # Enter a parse tree produced by postgreSqlGrammarParser#order_by_clause.
    def enterOrder_by_clause(self, ctx:postgreSqlGrammarParser.Order_by_clauseContext):
        pass

    # Exit a parse tree produced by postgreSqlGrammarParser#order_by_clause.
    def exitOrder_by_clause(self, ctx:postgreSqlGrammarParser.Order_by_clauseContext):
        pass


    # Enter a parse tree produced by postgreSqlGrammarParser#order_by_item.
    def enterOrder_by_item(self, ctx:postgreSqlGrammarParser.Order_by_itemContext):
        pass

    # Exit a parse tree produced by postgreSqlGrammarParser#order_by_item.
    def exitOrder_by_item(self, ctx:postgreSqlGrammarParser.Order_by_itemContext):
        pass


    # Enter a parse tree produced by postgreSqlGrammarParser#agg_func.
    def enterAgg_func(self, ctx:postgreSqlGrammarParser.Agg_funcContext):
        pass

    # Exit a parse tree produced by postgreSqlGrammarParser#agg_func.
    def exitAgg_func(self, ctx:postgreSqlGrammarParser.Agg_funcContext):
        pass


    # Enter a parse tree produced by postgreSqlGrammarParser#expr.
    def enterExpr(self, ctx:postgreSqlGrammarParser.ExprContext):
        pass

    # Exit a parse tree produced by postgreSqlGrammarParser#expr.
    def exitExpr(self, ctx:postgreSqlGrammarParser.ExprContext):
        pass


    # Enter a parse tree produced by postgreSqlGrammarParser#arith_expr.
    def enterArith_expr(self, ctx:postgreSqlGrammarParser.Arith_exprContext):
        pass

    # Exit a parse tree produced by postgreSqlGrammarParser#arith_expr.
    def exitArith_expr(self, ctx:postgreSqlGrammarParser.Arith_exprContext):
        pass


    # Enter a parse tree produced by postgreSqlGrammarParser#atom.
    def enterAtom(self, ctx:postgreSqlGrammarParser.AtomContext):
        pass

    # Exit a parse tree produced by postgreSqlGrammarParser#atom.
    def exitAtom(self, ctx:postgreSqlGrammarParser.AtomContext):
        pass


    # Enter a parse tree produced by postgreSqlGrammarParser#case_expr.
    def enterCase_expr(self, ctx:postgreSqlGrammarParser.Case_exprContext):
        pass

    # Exit a parse tree produced by postgreSqlGrammarParser#case_expr.
    def exitCase_expr(self, ctx:postgreSqlGrammarParser.Case_exprContext):
        pass


    # Enter a parse tree produced by postgreSqlGrammarParser#when_clause.
    def enterWhen_clause(self, ctx:postgreSqlGrammarParser.When_clauseContext):
        pass

    # Exit a parse tree produced by postgreSqlGrammarParser#when_clause.
    def exitWhen_clause(self, ctx:postgreSqlGrammarParser.When_clauseContext):
        pass


    # Enter a parse tree produced by postgreSqlGrammarParser#function_call.
    def enterFunction_call(self, ctx:postgreSqlGrammarParser.Function_callContext):
        pass

    # Exit a parse tree produced by postgreSqlGrammarParser#function_call.
    def exitFunction_call(self, ctx:postgreSqlGrammarParser.Function_callContext):
        pass


    # Enter a parse tree produced by postgreSqlGrammarParser#function_arg.
    def enterFunction_arg(self, ctx:postgreSqlGrammarParser.Function_argContext):
        pass

    # Exit a parse tree produced by postgreSqlGrammarParser#function_arg.
    def exitFunction_arg(self, ctx:postgreSqlGrammarParser.Function_argContext):
        pass



del postgreSqlGrammarParser