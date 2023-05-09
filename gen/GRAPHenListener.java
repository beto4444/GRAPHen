// Generated from C:/Users/keste/IdeaProjects/GRAPHen_Polnische_Graphcomputersprache/src\GRAPHen.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GRAPHenParser}.
 */
public interface GRAPHenListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GRAPHenParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(GRAPHenParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link GRAPHenParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(GRAPHenParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link GRAPHenParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(GRAPHenParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GRAPHenParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(GRAPHenParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GRAPHenParser#node_definition}.
	 * @param ctx the parse tree
	 */
	void enterNode_definition(GRAPHenParser.Node_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GRAPHenParser#node_definition}.
	 * @param ctx the parse tree
	 */
	void exitNode_definition(GRAPHenParser.Node_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GRAPHenParser#node_inline}.
	 * @param ctx the parse tree
	 */
	void enterNode_inline(GRAPHenParser.Node_inlineContext ctx);
	/**
	 * Exit a parse tree produced by {@link GRAPHenParser#node_inline}.
	 * @param ctx the parse tree
	 */
	void exitNode_inline(GRAPHenParser.Node_inlineContext ctx);
	/**
	 * Enter a parse tree produced by {@link GRAPHenParser#node_properties}.
	 * @param ctx the parse tree
	 */
	void enterNode_properties(GRAPHenParser.Node_propertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GRAPHenParser#node_properties}.
	 * @param ctx the parse tree
	 */
	void exitNode_properties(GRAPHenParser.Node_propertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GRAPHenParser#edge_definition}.
	 * @param ctx the parse tree
	 */
	void enterEdge_definition(GRAPHenParser.Edge_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GRAPHenParser#edge_definition}.
	 * @param ctx the parse tree
	 */
	void exitEdge_definition(GRAPHenParser.Edge_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GRAPHenParser#edge_inline}.
	 * @param ctx the parse tree
	 */
	void enterEdge_inline(GRAPHenParser.Edge_inlineContext ctx);
	/**
	 * Exit a parse tree produced by {@link GRAPHenParser#edge_inline}.
	 * @param ctx the parse tree
	 */
	void exitEdge_inline(GRAPHenParser.Edge_inlineContext ctx);
	/**
	 * Enter a parse tree produced by {@link GRAPHenParser#edge_properties}.
	 * @param ctx the parse tree
	 */
	void enterEdge_properties(GRAPHenParser.Edge_propertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GRAPHenParser#edge_properties}.
	 * @param ctx the parse tree
	 */
	void exitEdge_properties(GRAPHenParser.Edge_propertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GRAPHenParser#graph_definition}.
	 * @param ctx the parse tree
	 */
	void enterGraph_definition(GRAPHenParser.Graph_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GRAPHenParser#graph_definition}.
	 * @param ctx the parse tree
	 */
	void exitGraph_definition(GRAPHenParser.Graph_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GRAPHenParser#digraph_definition}.
	 * @param ctx the parse tree
	 */
	void enterDigraph_definition(GRAPHenParser.Digraph_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GRAPHenParser#digraph_definition}.
	 * @param ctx the parse tree
	 */
	void exitDigraph_definition(GRAPHenParser.Digraph_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GRAPHenParser#edge_list}.
	 * @param ctx the parse tree
	 */
	void enterEdge_list(GRAPHenParser.Edge_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link GRAPHenParser#edge_list}.
	 * @param ctx the parse tree
	 */
	void exitEdge_list(GRAPHenParser.Edge_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link GRAPHenParser#edge_relation}.
	 * @param ctx the parse tree
	 */
	void enterEdge_relation(GRAPHenParser.Edge_relationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GRAPHenParser#edge_relation}.
	 * @param ctx the parse tree
	 */
	void exitEdge_relation(GRAPHenParser.Edge_relationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GRAPHenParser#dedge_list}.
	 * @param ctx the parse tree
	 */
	void enterDedge_list(GRAPHenParser.Dedge_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link GRAPHenParser#dedge_list}.
	 * @param ctx the parse tree
	 */
	void exitDedge_list(GRAPHenParser.Dedge_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link GRAPHenParser#dedge_relation}.
	 * @param ctx the parse tree
	 */
	void enterDedge_relation(GRAPHenParser.Dedge_relationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GRAPHenParser#dedge_relation}.
	 * @param ctx the parse tree
	 */
	void exitDedge_relation(GRAPHenParser.Dedge_relationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GRAPHenParser#graph_function}.
	 * @param ctx the parse tree
	 */
	void enterGraph_function(GRAPHenParser.Graph_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GRAPHenParser#graph_function}.
	 * @param ctx the parse tree
	 */
	void exitGraph_function(GRAPHenParser.Graph_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GRAPHenParser#graph_function_statement}.
	 * @param ctx the parse tree
	 */
	void enterGraph_function_statement(GRAPHenParser.Graph_function_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GRAPHenParser#graph_function_statement}.
	 * @param ctx the parse tree
	 */
	void exitGraph_function_statement(GRAPHenParser.Graph_function_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GRAPHenParser#fileFormat}.
	 * @param ctx the parse tree
	 */
	void enterFileFormat(GRAPHenParser.FileFormatContext ctx);
	/**
	 * Exit a parse tree produced by {@link GRAPHenParser#fileFormat}.
	 * @param ctx the parse tree
	 */
	void exitFileFormat(GRAPHenParser.FileFormatContext ctx);
	/**
	 * Enter a parse tree produced by {@link GRAPHenParser#exportToFileFunc}.
	 * @param ctx the parse tree
	 */
	void enterExportToFileFunc(GRAPHenParser.ExportToFileFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link GRAPHenParser#exportToFileFunc}.
	 * @param ctx the parse tree
	 */
	void exitExportToFileFunc(GRAPHenParser.ExportToFileFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link GRAPHenParser#graph_add}.
	 * @param ctx the parse tree
	 */
	void enterGraph_add(GRAPHenParser.Graph_addContext ctx);
	/**
	 * Exit a parse tree produced by {@link GRAPHenParser#graph_add}.
	 * @param ctx the parse tree
	 */
	void exitGraph_add(GRAPHenParser.Graph_addContext ctx);
	/**
	 * Enter a parse tree produced by {@link GRAPHenParser#digraph_add}.
	 * @param ctx the parse tree
	 */
	void enterDigraph_add(GRAPHenParser.Digraph_addContext ctx);
	/**
	 * Exit a parse tree produced by {@link GRAPHenParser#digraph_add}.
	 * @param ctx the parse tree
	 */
	void exitDigraph_add(GRAPHenParser.Digraph_addContext ctx);
	/**
	 * Enter a parse tree produced by {@link GRAPHenParser#graph_substract}.
	 * @param ctx the parse tree
	 */
	void enterGraph_substract(GRAPHenParser.Graph_substractContext ctx);
	/**
	 * Exit a parse tree produced by {@link GRAPHenParser#graph_substract}.
	 * @param ctx the parse tree
	 */
	void exitGraph_substract(GRAPHenParser.Graph_substractContext ctx);
	/**
	 * Enter a parse tree produced by {@link GRAPHenParser#digraph_substract}.
	 * @param ctx the parse tree
	 */
	void enterDigraph_substract(GRAPHenParser.Digraph_substractContext ctx);
	/**
	 * Exit a parse tree produced by {@link GRAPHenParser#digraph_substract}.
	 * @param ctx the parse tree
	 */
	void exitDigraph_substract(GRAPHenParser.Digraph_substractContext ctx);
}