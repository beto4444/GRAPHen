// Generated from C:/Users/keste/IdeaProjects/GRAPHen_Polnische_Graphcomputersprache/src\GRAPHen.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GRAPHenParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GRAPHenVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GRAPHenParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(GRAPHenParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link GRAPHenParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(GRAPHenParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GRAPHenParser#node_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNode_definition(GRAPHenParser.Node_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GRAPHenParser#node_inline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNode_inline(GRAPHenParser.Node_inlineContext ctx);
	/**
	 * Visit a parse tree produced by {@link GRAPHenParser#node_properties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNode_properties(GRAPHenParser.Node_propertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GRAPHenParser#edge_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdge_definition(GRAPHenParser.Edge_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GRAPHenParser#edge_inline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdge_inline(GRAPHenParser.Edge_inlineContext ctx);
	/**
	 * Visit a parse tree produced by {@link GRAPHenParser#edge_properties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdge_properties(GRAPHenParser.Edge_propertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GRAPHenParser#graph_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGraph_definition(GRAPHenParser.Graph_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GRAPHenParser#digraph_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDigraph_definition(GRAPHenParser.Digraph_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GRAPHenParser#edge_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdge_list(GRAPHenParser.Edge_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link GRAPHenParser#edge_relation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdge_relation(GRAPHenParser.Edge_relationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GRAPHenParser#dedge_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDedge_list(GRAPHenParser.Dedge_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link GRAPHenParser#dedge_relation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDedge_relation(GRAPHenParser.Dedge_relationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GRAPHenParser#graph_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGraph_function(GRAPHenParser.Graph_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GRAPHenParser#graph_function_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGraph_function_statement(GRAPHenParser.Graph_function_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GRAPHenParser#fileFormat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileFormat(GRAPHenParser.FileFormatContext ctx);
	/**
	 * Visit a parse tree produced by {@link GRAPHenParser#exportToFileFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportToFileFunc(GRAPHenParser.ExportToFileFuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link GRAPHenParser#graph_add}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGraph_add(GRAPHenParser.Graph_addContext ctx);
	/**
	 * Visit a parse tree produced by {@link GRAPHenParser#digraph_add}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDigraph_add(GRAPHenParser.Digraph_addContext ctx);
	/**
	 * Visit a parse tree produced by {@link GRAPHenParser#graph_substract}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGraph_substract(GRAPHenParser.Graph_substractContext ctx);
	/**
	 * Visit a parse tree produced by {@link GRAPHenParser#digraph_substract}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDigraph_substract(GRAPHenParser.Digraph_substractContext ctx);
}