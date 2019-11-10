// Generated from /Users/wozipa/ProductCode/ikkyu/ikkyu-dsl/src/main/antlr/DslBase.g4 by ANTLR 4.7.2

    package org.ikkyu.dsl.antlr.base;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DslBaseParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DslBaseVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DslBaseParser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(DslBaseParser.RootContext ctx);
	/**
	 * Visit a parse tree produced by {@link DslBaseParser#readDataStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadDataStatement(DslBaseParser.ReadDataStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DslBaseParser#readFileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadFileStatement(DslBaseParser.ReadFileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DslBaseParser#fileType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileType(DslBaseParser.FileTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DslBaseParser#readDBTableStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadDBTableStatement(DslBaseParser.ReadDBTableStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DslBaseParser#dbType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDbType(DslBaseParser.DbTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DslBaseParser#writeDataStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteDataStatement(DslBaseParser.WriteDataStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DslBaseParser#writeFileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteFileStatement(DslBaseParser.WriteFileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DslBaseParser#writeDBTableStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteDBTableStatement(DslBaseParser.WriteDBTableStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DslBaseParser#writeType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteType(DslBaseParser.WriteTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DslBaseParser#assignDataStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignDataStatement(DslBaseParser.AssignDataStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DslBaseParser#singleSqlStatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleSqlStatment(DslBaseParser.SingleSqlStatmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link DslBaseParser#tableIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableIdentifier(DslBaseParser.TableIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link DslBaseParser#errorCapturingIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitErrorCapturingIdentifier(DslBaseParser.ErrorCapturingIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link DslBaseParser#errorCapturingIdentifierExtra}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitErrorCapturingIdentifierExtra(DslBaseParser.ErrorCapturingIdentifierExtraContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unquotedIdentifier}
	 * labeled alternative in {@link DslBaseParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnquotedIdentifier(DslBaseParser.UnquotedIdentifierContext ctx);
}