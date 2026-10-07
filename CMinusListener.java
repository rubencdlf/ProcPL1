// Generated from CMinus.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CMinusParser}.
 */
public interface CMinusListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CMinusParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CMinusParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CMinusParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#declaration_list}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_list(CMinusParser.Declaration_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#declaration_list}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_list(CMinusParser.Declaration_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(CMinusParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(CMinusParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#var_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVar_declaration(CMinusParser.Var_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#var_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVar_declaration(CMinusParser.Var_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#type_specifier}.
	 * @param ctx the parse tree
	 */
	void enterType_specifier(CMinusParser.Type_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#type_specifier}.
	 * @param ctx the parse tree
	 */
	void exitType_specifier(CMinusParser.Type_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#fun_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFun_declaration(CMinusParser.Fun_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#fun_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFun_declaration(CMinusParser.Fun_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(CMinusParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(CMinusParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#param_list}.
	 * @param ctx the parse tree
	 */
	void enterParam_list(CMinusParser.Param_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#param_list}.
	 * @param ctx the parse tree
	 */
	void exitParam_list(CMinusParser.Param_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(CMinusParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(CMinusParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCompound_stmt(CMinusParser.Compound_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCompound_stmt(CMinusParser.Compound_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#local_declarations}.
	 * @param ctx the parse tree
	 */
	void enterLocal_declarations(CMinusParser.Local_declarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#local_declarations}.
	 * @param ctx the parse tree
	 */
	void exitLocal_declarations(CMinusParser.Local_declarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void enterStatement_list(CMinusParser.Statement_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void exitStatement_list(CMinusParser.Statement_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CMinusParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CMinusParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#expression_stmt}.
	 * @param ctx the parse tree
	 */
	void enterExpression_stmt(CMinusParser.Expression_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#expression_stmt}.
	 * @param ctx the parse tree
	 */
	void exitExpression_stmt(CMinusParser.Expression_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#selection_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSelection_stmt(CMinusParser.Selection_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#selection_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSelection_stmt(CMinusParser.Selection_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#iteration_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIteration_stmt(CMinusParser.Iteration_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#iteration_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIteration_stmt(CMinusParser.Iteration_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(CMinusParser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(CMinusParser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CMinusParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CMinusParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#or_expr}.
	 * @param ctx the parse tree
	 */
	void enterOr_expr(CMinusParser.Or_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#or_expr}.
	 * @param ctx the parse tree
	 */
	void exitOr_expr(CMinusParser.Or_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#and_expr}.
	 * @param ctx the parse tree
	 */
	void enterAnd_expr(CMinusParser.And_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#and_expr}.
	 * @param ctx the parse tree
	 */
	void exitAnd_expr(CMinusParser.And_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(CMinusParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(CMinusParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#simple_expression}.
	 * @param ctx the parse tree
	 */
	void enterSimple_expression(CMinusParser.Simple_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#simple_expression}.
	 * @param ctx the parse tree
	 */
	void exitSimple_expression(CMinusParser.Simple_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#relop}.
	 * @param ctx the parse tree
	 */
	void enterRelop(CMinusParser.RelopContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#relop}.
	 * @param ctx the parse tree
	 */
	void exitRelop(CMinusParser.RelopContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#additive_expression}.
	 * @param ctx the parse tree
	 */
	void enterAdditive_expression(CMinusParser.Additive_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#additive_expression}.
	 * @param ctx the parse tree
	 */
	void exitAdditive_expression(CMinusParser.Additive_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#addop}.
	 * @param ctx the parse tree
	 */
	void enterAddop(CMinusParser.AddopContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#addop}.
	 * @param ctx the parse tree
	 */
	void exitAddop(CMinusParser.AddopContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#unary_expr}.
	 * @param ctx the parse tree
	 */
	void enterUnary_expr(CMinusParser.Unary_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#unary_expr}.
	 * @param ctx the parse tree
	 */
	void exitUnary_expr(CMinusParser.Unary_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(CMinusParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(CMinusParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#mulop}.
	 * @param ctx the parse tree
	 */
	void enterMulop(CMinusParser.MulopContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#mulop}.
	 * @param ctx the parse tree
	 */
	void exitMulop(CMinusParser.MulopContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(CMinusParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(CMinusParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(CMinusParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(CMinusParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(CMinusParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(CMinusParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#arg_list}.
	 * @param ctx the parse tree
	 */
	void enterArg_list(CMinusParser.Arg_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#arg_list}.
	 * @param ctx the parse tree
	 */
	void exitArg_list(CMinusParser.Arg_listContext ctx);
}