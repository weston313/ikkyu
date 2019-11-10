// Generated from /Users/wozipa/ProductCode/ikkyu/ikkyu-dsl/src/main/antlr/DslLine.g4 by ANTLR 4.7.2

    package org.ikkyu.dsl.antlr.line;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DslLineParser}.
 */
public interface DslLineListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DslLineParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(DslLineParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link DslLineParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(DslLineParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link DslLineParser#semicolonLine}.
	 * @param ctx the parse tree
	 */
	void enterSemicolonLine(DslLineParser.SemicolonLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link DslLineParser#semicolonLine}.
	 * @param ctx the parse tree
	 */
	void exitSemicolonLine(DslLineParser.SemicolonLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link DslLineParser#functionLine}.
	 * @param ctx the parse tree
	 */
	void enterFunctionLine(DslLineParser.FunctionLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link DslLineParser#functionLine}.
	 * @param ctx the parse tree
	 */
	void exitFunctionLine(DslLineParser.FunctionLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link DslLineParser#templateAddAction}.
	 * @param ctx the parse tree
	 */
	void enterTemplateAddAction(DslLineParser.TemplateAddActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DslLineParser#templateAddAction}.
	 * @param ctx the parse tree
	 */
	void exitTemplateAddAction(DslLineParser.TemplateAddActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DslLineParser#methodBodyCode}.
	 * @param ctx the parse tree
	 */
	void enterMethodBodyCode(DslLineParser.MethodBodyCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DslLineParser#methodBodyCode}.
	 * @param ctx the parse tree
	 */
	void exitMethodBodyCode(DslLineParser.MethodBodyCodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DslLineParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(DslLineParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link DslLineParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(DslLineParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link DslLineParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(DslLineParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link DslLineParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(DslLineParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unquotedIdentifier}
	 * labeled alternative in {@link DslLineParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterUnquotedIdentifier(DslLineParser.UnquotedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unquotedIdentifier}
	 * labeled alternative in {@link DslLineParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitUnquotedIdentifier(DslLineParser.UnquotedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code quotedIdentifierAlternative}
	 * labeled alternative in {@link DslLineParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterQuotedIdentifierAlternative(DslLineParser.QuotedIdentifierAlternativeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code quotedIdentifierAlternative}
	 * labeled alternative in {@link DslLineParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitQuotedIdentifierAlternative(DslLineParser.QuotedIdentifierAlternativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DslLineParser#quotedIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterQuotedIdentifier(DslLineParser.QuotedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link DslLineParser#quotedIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitQuotedIdentifier(DslLineParser.QuotedIdentifierContext ctx);
}