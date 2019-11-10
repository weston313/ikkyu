// Generated from /Users/wozipa/ProductCode/ikkyu/ikkyu-dsl/src/main/antlr/DslBase.g4 by ANTLR 4.7.2

    package org.ikkyu.dsl.antlr.base;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DslBaseParser}.
 */
public interface DslBaseListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DslBaseParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(DslBaseParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link DslBaseParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(DslBaseParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link DslBaseParser#readDataStatement}.
	 * @param ctx the parse tree
	 */
	void enterReadDataStatement(DslBaseParser.ReadDataStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DslBaseParser#readDataStatement}.
	 * @param ctx the parse tree
	 */
	void exitReadDataStatement(DslBaseParser.ReadDataStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DslBaseParser#readFileStatement}.
	 * @param ctx the parse tree
	 */
	void enterReadFileStatement(DslBaseParser.ReadFileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DslBaseParser#readFileStatement}.
	 * @param ctx the parse tree
	 */
	void exitReadFileStatement(DslBaseParser.ReadFileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DslBaseParser#fileType}.
	 * @param ctx the parse tree
	 */
	void enterFileType(DslBaseParser.FileTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DslBaseParser#fileType}.
	 * @param ctx the parse tree
	 */
	void exitFileType(DslBaseParser.FileTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DslBaseParser#readDBTableStatement}.
	 * @param ctx the parse tree
	 */
	void enterReadDBTableStatement(DslBaseParser.ReadDBTableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DslBaseParser#readDBTableStatement}.
	 * @param ctx the parse tree
	 */
	void exitReadDBTableStatement(DslBaseParser.ReadDBTableStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DslBaseParser#dbType}.
	 * @param ctx the parse tree
	 */
	void enterDbType(DslBaseParser.DbTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DslBaseParser#dbType}.
	 * @param ctx the parse tree
	 */
	void exitDbType(DslBaseParser.DbTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DslBaseParser#writeDataStatement}.
	 * @param ctx the parse tree
	 */
	void enterWriteDataStatement(DslBaseParser.WriteDataStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DslBaseParser#writeDataStatement}.
	 * @param ctx the parse tree
	 */
	void exitWriteDataStatement(DslBaseParser.WriteDataStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DslBaseParser#writeFileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWriteFileStatement(DslBaseParser.WriteFileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DslBaseParser#writeFileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWriteFileStatement(DslBaseParser.WriteFileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DslBaseParser#writeDBTableStatement}.
	 * @param ctx the parse tree
	 */
	void enterWriteDBTableStatement(DslBaseParser.WriteDBTableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DslBaseParser#writeDBTableStatement}.
	 * @param ctx the parse tree
	 */
	void exitWriteDBTableStatement(DslBaseParser.WriteDBTableStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DslBaseParser#writeType}.
	 * @param ctx the parse tree
	 */
	void enterWriteType(DslBaseParser.WriteTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DslBaseParser#writeType}.
	 * @param ctx the parse tree
	 */
	void exitWriteType(DslBaseParser.WriteTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DslBaseParser#assignDataStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignDataStatement(DslBaseParser.AssignDataStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DslBaseParser#assignDataStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignDataStatement(DslBaseParser.AssignDataStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DslBaseParser#singleSqlStatment}.
	 * @param ctx the parse tree
	 */
	void enterSingleSqlStatment(DslBaseParser.SingleSqlStatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DslBaseParser#singleSqlStatment}.
	 * @param ctx the parse tree
	 */
	void exitSingleSqlStatment(DslBaseParser.SingleSqlStatmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link DslBaseParser#tableIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterTableIdentifier(DslBaseParser.TableIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link DslBaseParser#tableIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitTableIdentifier(DslBaseParser.TableIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link DslBaseParser#errorCapturingIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterErrorCapturingIdentifier(DslBaseParser.ErrorCapturingIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link DslBaseParser#errorCapturingIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitErrorCapturingIdentifier(DslBaseParser.ErrorCapturingIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link DslBaseParser#errorCapturingIdentifierExtra}.
	 * @param ctx the parse tree
	 */
	void enterErrorCapturingIdentifierExtra(DslBaseParser.ErrorCapturingIdentifierExtraContext ctx);
	/**
	 * Exit a parse tree produced by {@link DslBaseParser#errorCapturingIdentifierExtra}.
	 * @param ctx the parse tree
	 */
	void exitErrorCapturingIdentifierExtra(DslBaseParser.ErrorCapturingIdentifierExtraContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unquotedIdentifier}
	 * labeled alternative in {@link DslBaseParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterUnquotedIdentifier(DslBaseParser.UnquotedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unquotedIdentifier}
	 * labeled alternative in {@link DslBaseParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitUnquotedIdentifier(DslBaseParser.UnquotedIdentifierContext ctx);
}