// Generated from /Users/xyz/Desktop/Th111-vtable/src/cs652/j/parser/J.g4 by ANTLR 4.5
package cs652.j.parser;

import cs652.j.semantics.*; // You will need these for stuff in "returns" clauses
import org.antlr.symbols.*;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JParser}.
 */
public interface JListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(JParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link JParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(JParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link JParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(JParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link JParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(JParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link JParser#typeList}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(JParser.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JParser#typeList}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(JParser.TypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(JParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(JParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(JParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(JParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(JParser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(JParser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclaration(JParser.MemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclaration(JParser.MemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(JParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(JParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(JParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(JParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(JParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(JParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstDeclaration(JParser.ConstDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstDeclaration(JParser.ConstDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JParser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclarator(JParser.ConstantDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JParser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclarator(JParser.ConstantDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarators(JParser.VariableDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarators(JParser.VariableDeclaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(JParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(JParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(JParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link JParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(JParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link JParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(JParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(JParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantName(JParser.EnumConstantNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantName(JParser.EnumConstantNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(JParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(JParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(JParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(JParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(JParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(JParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(JParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(JParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(JParser.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(JParser.TypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(JParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(JParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(JParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(JParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(JParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(JParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(JParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(JParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void enterConstructorBody(JParser.ConstructorBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void exitConstructorBody(JParser.ConstructorBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(JParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(JParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(JParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(JParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(JParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(JParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclarationStatement(JParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclarationStatement(JParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(JParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(JParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blockStat}
	 * labeled alternative in {@link JParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStat(JParser.BlockStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blockStat}
	 * labeled alternative in {@link JParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStat(JParser.BlockStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifStat}
	 * labeled alternative in {@link JParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfStat(JParser.IfStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifStat}
	 * labeled alternative in {@link JParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfStat(JParser.IfStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code elseStat}
	 * labeled alternative in {@link JParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterElseStat(JParser.ElseStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elseStat}
	 * labeled alternative in {@link JParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitElseStat(JParser.ElseStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileStat}
	 * labeled alternative in {@link JParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStat(JParser.WhileStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileStat}
	 * labeled alternative in {@link JParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStat(JParser.WhileStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnStat}
	 * labeled alternative in {@link JParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStat(JParser.ReturnStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnStat}
	 * labeled alternative in {@link JParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStat(JParser.ReturnStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printStat}
	 * labeled alternative in {@link JParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStat(JParser.PrintStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printStat}
	 * labeled alternative in {@link JParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStat(JParser.PrintStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expr}
	 * labeled alternative in {@link JParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExpr(JParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expr}
	 * labeled alternative in {@link JParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExpr(JParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(JParser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(JParser.ParExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(JParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(JParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code newExpr}
	 * labeled alternative in {@link JParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNewExpr(JParser.NewExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code newExpr}
	 * labeled alternative in {@link JParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNewExpr(JParser.NewExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code thisExpr}
	 * labeled alternative in {@link JParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterThisExpr(JParser.ThisExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code thisExpr}
	 * labeled alternative in {@link JParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitThisExpr(JParser.ThisExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dotExpr}
	 * labeled alternative in {@link JParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDotExpr(JParser.DotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dotExpr}
	 * labeled alternative in {@link JParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDotExpr(JParser.DotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varRefExpr}
	 * labeled alternative in {@link JParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVarRefExpr(JParser.VarRefExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varRefExpr}
	 * labeled alternative in {@link JParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVarRefExpr(JParser.VarRefExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code methodExpr}
	 * labeled alternative in {@link JParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMethodExpr(JParser.MethodExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code methodExpr}
	 * labeled alternative in {@link JParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMethodExpr(JParser.MethodExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralExpr}
	 * labeled alternative in {@link JParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExpr(JParser.LiteralExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralExpr}
	 * labeled alternative in {@link JParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExpr(JParser.LiteralExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignStat}
	 * labeled alternative in {@link JParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAssignStat(JParser.AssignStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignStat}
	 * labeled alternative in {@link JParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAssignStat(JParser.AssignStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link JParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(JParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(JParser.ArgumentsContext ctx);
}