// Generated from frameQLParser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link frameQLParser}.
 */
public interface frameQLParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link frameQLParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(frameQLParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link frameQLParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(frameQLParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link frameQLParser#fqlStatements}.
	 * @param ctx the parse tree
	 */
	void enterFqlStatements(frameQLParser.FqlStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link frameQLParser#fqlStatements}.
	 * @param ctx the parse tree
	 */
	void exitFqlStatements(frameQLParser.FqlStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link frameQLParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(frameQLParser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link frameQLParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(frameQLParser.EmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link frameQLParser#fqlStatement}.
	 * @param ctx the parse tree
	 */
	void enterFqlStatement(frameQLParser.FqlStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link frameQLParser#fqlStatement}.
	 * @param ctx the parse tree
	 */
	void exitFqlStatement(frameQLParser.FqlStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link frameQLParser#dmlStatement}.
	 * @param ctx the parse tree
	 */
	void enterDmlStatement(frameQLParser.DmlStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link frameQLParser#dmlStatement}.
	 * @param ctx the parse tree
	 */
	void exitDmlStatement(frameQLParser.DmlStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleSelect}
	 * labeled alternative in {@link frameQLParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void enterSimpleSelect(frameQLParser.SimpleSelectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleSelect}
	 * labeled alternative in {@link frameQLParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void exitSimpleSelect(frameQLParser.SimpleSelectContext ctx);
	/**
	 * Enter a parse tree produced by {@link frameQLParser#querySpecification}.
	 * @param ctx the parse tree
	 */
	void enterQuerySpecification(frameQLParser.QuerySpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link frameQLParser#querySpecification}.
	 * @param ctx the parse tree
	 */
	void exitQuerySpecification(frameQLParser.QuerySpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link frameQLParser#selectSpec}.
	 * @param ctx the parse tree
	 */
	void enterSelectSpec(frameQLParser.SelectSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link frameQLParser#selectSpec}.
	 * @param ctx the parse tree
	 */
	void exitSelectSpec(frameQLParser.SelectSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link frameQLParser#selectElements}.
	 * @param ctx the parse tree
	 */
	void enterSelectElements(frameQLParser.SelectElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link frameQLParser#selectElements}.
	 * @param ctx the parse tree
	 */
	void exitSelectElements(frameQLParser.SelectElementsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selectColumnElement}
	 * labeled alternative in {@link frameQLParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void enterSelectColumnElement(frameQLParser.SelectColumnElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectColumnElement}
	 * labeled alternative in {@link frameQLParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void exitSelectColumnElement(frameQLParser.SelectColumnElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link frameQLParser#fullColumnName}.
	 * @param ctx the parse tree
	 */
	void enterFullColumnName(frameQLParser.FullColumnNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link frameQLParser#fullColumnName}.
	 * @param ctx the parse tree
	 */
	void exitFullColumnName(frameQLParser.FullColumnNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link frameQLParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void enterFromClause(frameQLParser.FromClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link frameQLParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void exitFromClause(frameQLParser.FromClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link frameQLParser#tableSources}.
	 * @param ctx the parse tree
	 */
	void enterTableSources(frameQLParser.TableSourcesContext ctx);
	/**
	 * Exit a parse tree produced by {@link frameQLParser#tableSources}.
	 * @param ctx the parse tree
	 */
	void exitTableSources(frameQLParser.TableSourcesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableSourceBase}
	 * labeled alternative in {@link frameQLParser#tableSource}.
	 * @param ctx the parse tree
	 */
	void enterTableSourceBase(frameQLParser.TableSourceBaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableSourceBase}
	 * labeled alternative in {@link frameQLParser#tableSource}.
	 * @param ctx the parse tree
	 */
	void exitTableSourceBase(frameQLParser.TableSourceBaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link frameQLParser#tableSourceItem}.
	 * @param ctx the parse tree
	 */
	void enterTableSourceItem(frameQLParser.TableSourceItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link frameQLParser#tableSourceItem}.
	 * @param ctx the parse tree
	 */
	void exitTableSourceItem(frameQLParser.TableSourceItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link frameQLParser#tableName}.
	 * @param ctx the parse tree
	 */
	void enterTableName(frameQLParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link frameQLParser#tableName}.
	 * @param ctx the parse tree
	 */
	void exitTableName(frameQLParser.TableNameContext ctx);
}