import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import DataStructures.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

public class GNListener extends GRAPHenBaseListener {
    private final HashMap<String, Node> nodes = new HashMap<>();
    private final HashMap<String, Edge> edges = new HashMap<>();
    private final HashMap<String, Graph> graphs = new HashMap<>();
    private final HashMap<String, Graph> digraphs = new HashMap<>();
    private String current;
    private Node currentNode;
    private Edge currentEdge;
    private Graph currentGraph;

    @Override
    public void enterNode_definition(GRAPHenParser.Node_definitionContext ctx) {
        String id = ctx.IDENTIFIER().getText();
        Node node = new Node();
        currentNode = node;
        nodes.put(id, node);
    }

    @Override
    public void enterNode_inline(GRAPHenParser.Node_inlineContext ctx) {
        String id = ctx.IDENTIFIER().getText();
        Node node = new Node();
        currentNode = node;
        nodes.put(id, node);
    }

    @Override
    public void enterNode_properties(GRAPHenParser.Node_propertiesContext ctx) {
        Node node = currentNode;

        TerminalNode numColorNode = ctx.TEXT();
        if (numColorNode != null) {
            String contents = ctx.TEXT().getText();
            node.setNodeContents(contents);
        }
        TerminalNode fillColor = ctx.COLOR(0);
        if (fillColor != null) {
            String Color = fillColor.getText();
            node.setFillColor(Color);
        }
        TerminalNode borderColor = ctx.COLOR(1);
        if (borderColor != null) {
            String Color = borderColor.getText();
            node.setBorderColor(Color);
        }

        TerminalNode nodeShapeCtx = ctx.NODE_SHAPE();
        if (nodeShapeCtx != null) {
            NodeShape nodeShape = NodeShape.valueOf(nodeShapeCtx.getText());
            node.setNodeShape(nodeShape);
        }

        TerminalNode nodeSizeCtx = ctx.POS_NUMBER(0);
        if (nodeSizeCtx != null) {
            int nodeSize = Integer.parseInt(nodeSizeCtx.getText());
            node.setNodeSize(nodeSize);
        }

        // Get the optional 'borderWidth' property
        TerminalNode borderWidthCtx = ctx.POS_NUMBER(1);
        if (borderWidthCtx != null) {
            int borderWidth = Integer.parseInt(borderWidthCtx.getText());
            node.setBorderWidth(borderWidth);
        }

        // Get the optional 'borderLineShape' property
        TerminalNode borderLineShapeCtx = ctx.LINE_TYPE();
        if (borderLineShapeCtx != null) {
            LineType borderLineShape = LineType.valueOf(borderLineShapeCtx.getText());
            node.setBorderLineShape(borderLineShape);
        }
    }

    @Override
    public void enterEdge_definition(GRAPHenParser.Edge_definitionContext ctx) {
        String id = ctx.IDENTIFIER().getText();
        Edge edge = new Edge();
        currentEdge = edge;
        edges.put(id, edge);
    }

    @Override
    public void enterEdge_inline(GRAPHenParser.Edge_inlineContext ctx) {
        String id = ctx.IDENTIFIER().getText();
        Edge edge = new Edge();
        currentEdge = edge;
        edges.put(id, edge);
    }

    @Override
    public void enterEdge_properties(GRAPHenParser.Edge_propertiesContext ctx) {
        Edge edge = currentEdge;

        TerminalNode numberNode = ctx.NUMBER();
        if (numberNode != null) {
            int number = Integer.parseInt(numberNode.getText());
            edge.setNumColor(number);
        }

        TerminalNode posNumberNode = ctx.POS_NUMBER();
        if (posNumberNode != null) {
            int posNumber = Integer.parseInt(posNumberNode.getText());
            edge.setLineWidth(posNumber);
        }

        TerminalNode colorNode = ctx.COLOR();
        if (colorNode != null) {
            String color = colorNode.getText();
            edge.setColor(color);
        }

        TerminalNode lineTypeNode = ctx.LINE_TYPE();
        if (lineTypeNode != null) {
            LineType lineType = LineType.valueOf(lineTypeNode.getText());
            edge.setLineType(lineType);
        }
    }

    @Override
    public void enterGraph_definition(GRAPHenParser.Graph_definitionContext ctx) {
        String graphName = ctx.IDENTIFIER().getText();
        Graph graph;
        graph = new Graph();
        graphs.put(graphName, graph);
        currentGraph = graph;

        if (ctx.edge_list() != null) {
            enterEdge_list(ctx.edge_list());
            if (ctx.graph_function() != null){
                enterGraph_function(ctx.graph_function());
            }
        } else if (ctx.graph_add() != null) {
            enterGraph_add(ctx.graph_add());
        } else if (ctx.graph_substract() != null) {
            enterGraph_substract(ctx.graph_substract());
        } else if (ctx.graph_union() != null){
            enterGraph_union(ctx.graph_union());
        }
    }

    @Override
    public void enterEdge_list(GRAPHenParser.Edge_listContext ctx) {
        List<GRAPHenParser.Edge_relationContext> edgeRelationContexts = ctx.edge_relation();

        for (GRAPHenParser.Edge_relationContext edgeRelationContext : edgeRelationContexts) {
            enterEdge_relation(edgeRelationContext);
        }
    }

    @Override
    public void enterEdge_relation(GRAPHenParser.Edge_relationContext ctx) {
        List<ParseTree> children = ctx.children;
        Node parent = null;
        Edge edge = null;
        List<Node> child = new ArrayList<>();


        ParseTree firstNodeOrIdentifier = children.get(0);
        if (firstNodeOrIdentifier instanceof TerminalNode) {
            // Handle identifier
            String identifier = firstNodeOrIdentifier.getText();
            if (!nodes.containsKey(identifier)){
                //@TODO: throw node does not exist error
            }else {
                parent = nodes.get(identifier);
            }
        } else if (firstNodeOrIdentifier instanceof GRAPHenParser.Node_inlineContext) {
            // Handle node_inline
            enterNode_inline((GRAPHenParser.Node_inlineContext) firstNodeOrIdentifier);
            parent = currentNode; //@TODO: zabezpieczyć (np. zmieniać currentNode na null po zakończeniu używnaia i sprawdzać czy wszystko działa
        }

        ParseTree edgeOrIdentifier = children.get(3);
        if (edgeOrIdentifier instanceof TerminalNode) {
            String identifier = edgeOrIdentifier.getText();
            if (!edges.containsKey(identifier)){
                //@TODO: throw edge does not exist error
            }
            else {
                edge = edges.get(identifier);
            }
        } else if (edgeOrIdentifier instanceof GRAPHenParser.Edge_inlineContext) {
            enterEdge_inline((GRAPHenParser.Edge_inlineContext) edgeOrIdentifier);
            edge = currentEdge;
        }

        ParseTree secondNodeOrIdentifier = children.get(4);
        if (secondNodeOrIdentifier instanceof TerminalNode) {
            // Handle identifier
            String identifier = secondNodeOrIdentifier.getText();
            if (!nodes.containsKey(identifier)){
                //@TODO: throw node does not exist error
            }else {
                child.add(nodes.get(identifier));
            }
        } else if (secondNodeOrIdentifier instanceof GRAPHenParser.Node_inlineContext) {
            // Handle node_inline
            enterNode_inline((GRAPHenParser.Node_inlineContext) secondNodeOrIdentifier);
           child.add(currentNode); //@TODO: zabezpieczyć (np. zmieniać currentNode na null po zakończeniu używnaia i sprawdzać czy wszystko działa
        }

        for (int i = 5; i < children.size(); i += 2) {
            ParseTree nodeOrIdentifier = children.get(i);
            if (nodeOrIdentifier instanceof TerminalNode) {
                // Handle identifier
                String identifier = nodeOrIdentifier.getText();
                if (!nodes.containsKey(identifier)){
                    //@TODO: throw node does not exist error
                }else {
                    child.add(nodes.get(identifier));
                }
            } else if (nodeOrIdentifier instanceof GRAPHenParser.Node_inlineContext) {
                // Handle node_inline
                enterNode_inline((GRAPHenParser.Node_inlineContext) nodeOrIdentifier);
                child.add(currentNode); //@TODO: zabezpieczyć (np. zmieniać currentNode na null po zakończeniu używnaia i sprawdzać czy wszystko działa
            }
        }
        if (parent == null || edge == null || child.size() == 0){
            return; //nie powinno się zdarzyć
        }
        currentGraph.addRelation(parent, edge, child);
    }

    @Override
    public void enterGraph_add(GRAPHenParser.Graph_addContext ctx) {
        String firstId = ctx.IDENTIFIER(0).getText();
        if (!graphs.containsKey(firstId)){
            //@TODO: graph does not exist
        }
        Graph first = graphs.get(firstId);
        String secondId = ctx.IDENTIFIER(0).getText();
        if (!graphs.containsKey(secondId)){
            //@TODO: graph does not exist
        }
        Graph second = graphs.get(secondId);
        currentGraph.copy(first.Add(second)); //@TODO: czy tu potrzebne copy?
    }

    @Override
    public void enterGraph_substract(GRAPHenParser.Graph_substractContext ctx) {
        String firstId = ctx.IDENTIFIER(0).getText();
        if (!graphs.containsKey(firstId)){
            //@TODO: graph does not exist
        }
        Graph first = graphs.get(firstId);
        String secondId = ctx.IDENTIFIER(0).getText();
        if (!graphs.containsKey(secondId)){
            //@TODO: graph does not exist
        }
        Graph second = graphs.get(secondId);
        currentGraph.copy(first.Substract(second)); //@TODO: czy tu potrzebne copy?
    }

    @Override
    public void enterGraph_union(GRAPHenParser.Graph_unionContext ctx) {
        String firstId = ctx.IDENTIFIER(0).getText();
        if (!graphs.containsKey(firstId)){
            //@TODO: graph does not exist
        }
        Graph first = graphs.get(firstId);
        String secondId = ctx.IDENTIFIER(0).getText();
        if (!graphs.containsKey(secondId)){
            //@TODO: graph does not exist
        }
        Graph second = graphs.get(secondId);
        currentGraph.copy(first.Union(second)); //@TODO: czy tu potrzebne copy?
    }

    @Override
    public void enterGraph_function(GRAPHenParser.Graph_functionContext ctx) {
        if (ctx.exportToFileFunc() != null){
            enterExportToFileFunc(ctx.exportToFileFunc());
        }
        else if (ctx.colorEdgesFunc() != null){
            enterColorEdgesFunc(ctx.colorEdgesFunc());
        }
        else if (ctx.colorNodesFunc() != null){
            enterColorNodesFunc(ctx.colorNodesFunc());
        }
        else {
            String foo = ctx.getText();
            if (foo.equals("clearEdges()")) {
                currentGraph.clearEdges();
            }
        }
    }

    @Override
    public void enterColorEdgesFunc(GRAPHenParser.ColorEdgesFuncContext ctx) {
        currentGraph.colorEdges();
    }

    @Override
    public void enterColorNodesFunc(GRAPHenParser.ColorNodesFuncContext ctx) {
        currentGraph.colorNodes();
    }

    @Override
    public void enterDigraph_definition(GRAPHenParser.Digraph_definitionContext ctx) {
        String graphName = ctx.IDENTIFIER().getText();
        Graph graph;
        graph = new Graph();
        graphs.put(graphName, graph);
        currentGraph = graph;

        if (ctx.dedge_list() != null) {
            enterDedge_list(ctx.dedge_list());
            if (ctx.graph_function() != null){
                enterGraph_function(ctx.graph_function());
            }
        } else if (ctx.digraph_add() != null) {
            enterDigraph_add(ctx.digraph_add());
        } else if (ctx.digraph_substract() != null) {
            enterDigraph_substract(ctx.digraph_substract());
        } else if (ctx.digraph_union() != null) {
            enterDigraph_union(ctx.digraph_union());
        }
    }

    @Override
    public void enterDedge_list(GRAPHenParser.Dedge_listContext ctx) {
        List<GRAPHenParser.Dedge_relationContext> dedgeRelationContexts = ctx.dedge_relation();

        for (GRAPHenParser.Dedge_relationContext dedgeRelationContext : dedgeRelationContexts) {
            enterDedge_relation(dedgeRelationContext);
        }
    }

    @Override
    public void enterDedge_relation(GRAPHenParser.Dedge_relationContext ctx) {
        List<ParseTree> children = ctx.children;
        Node parent = null;
        Edge edge = null;
        List<Node> child = new ArrayList<>();


        ParseTree firstNodeOrIdentifier = children.get(0);
        if (firstNodeOrIdentifier instanceof TerminalNode) {
            // Handle identifier
            String identifier = firstNodeOrIdentifier.getText();
            if (!nodes.containsKey(identifier)){
                //@TODO: throw node does not exist error
            }else {
                parent = nodes.get(identifier);
            }
        } else if (firstNodeOrIdentifier instanceof GRAPHenParser.Node_inlineContext) {
            // Handle node_inline
            enterNode_inline((GRAPHenParser.Node_inlineContext) firstNodeOrIdentifier);
            parent = currentNode; //@TODO: zabezpieczyć (np. zmieniać currentNode na null po zakończeniu używnaia i sprawdzać czy wszystko działa
        }

        ParseTree edgeOrIdentifier = children.get(3);
        if (edgeOrIdentifier instanceof TerminalNode) {
            String identifier = edgeOrIdentifier.getText();
            if (!edges.containsKey(identifier)){
                //@TODO: throw edge does not exist error
            }
            else {
                edge = edges.get(identifier);
            }
        } else if (edgeOrIdentifier instanceof GRAPHenParser.Edge_inlineContext) {
            enterEdge_inline((GRAPHenParser.Edge_inlineContext) edgeOrIdentifier);
            edge = currentEdge;
        }

        ParseTree secondNodeOrIdentifier = children.get(4);
        if (secondNodeOrIdentifier instanceof TerminalNode) {
            // Handle identifier
            String identifier = secondNodeOrIdentifier.getText();
            if (!nodes.containsKey(identifier)){
                //@TODO: throw node does not exist error
            }else {
                child.add(nodes.get(identifier));
            }
        } else if (secondNodeOrIdentifier instanceof GRAPHenParser.Node_inlineContext) {
            // Handle node_inline
            enterNode_inline((GRAPHenParser.Node_inlineContext) secondNodeOrIdentifier);
            child.add(currentNode); //@TODO: zabezpieczyć (np. zmieniać currentNode na null po zakończeniu używnaia i sprawdzać czy wszystko działa
        }

        for (int i = 5; i < children.size(); i += 2) {
            ParseTree nodeOrIdentifier = children.get(i);
            if (nodeOrIdentifier instanceof TerminalNode) {
                // Handle identifier
                String identifier = nodeOrIdentifier.getText();
                if (!nodes.containsKey(identifier)){
                    //@TODO: throw node does not exist error
                }else {
                    child.add(nodes.get(identifier));
                }
            } else if (nodeOrIdentifier instanceof GRAPHenParser.Node_inlineContext) {
                // Handle node_inline
                enterNode_inline((GRAPHenParser.Node_inlineContext) nodeOrIdentifier);
                child.add(currentNode); //@TODO: zabezpieczyć (np. zmieniać currentNode na null po zakończeniu używnaia i sprawdzać czy wszystko działa
            }
        }
        if (parent == null || edge == null || child.size() == 0){
            return; //nie powinno się zdarzyć
        }
        currentGraph.addRelation(parent, edge, child);
    }

    @Override
    public void enterDigraph_add(GRAPHenParser.Digraph_addContext ctx) {
        String firstId = ctx.IDENTIFIER(0).getText();
        if (!graphs.containsKey(firstId)){
            //@TODO: graph does not exist
        }
        Graph first = graphs.get(firstId);
        String secondId = ctx.IDENTIFIER(0).getText();
        if (!graphs.containsKey(secondId)){
            //@TODO: graph does not exist
        }
        Graph second = graphs.get(secondId);
        currentGraph.copy(first.Add(second));
    }

    @Override
    public void enterDigraph_substract(GRAPHenParser.Digraph_substractContext ctx) {
        String firstId = ctx.IDENTIFIER(0).getText();
        if (!graphs.containsKey(firstId)){
            //@TODO: graph does not exist
        }
        Graph first = graphs.get(firstId);
        String secondId = ctx.IDENTIFIER(0).getText();
        if (!graphs.containsKey(secondId)){
            //@TODO: graph does not exist
        }
        Graph second = graphs.get(secondId);
        currentGraph.copy(first.Substract(second));
    }

    @Override
    public void enterDigraph_union(GRAPHenParser.Digraph_unionContext ctx) {
        String firstId = ctx.IDENTIFIER(0).getText();
        if (!graphs.containsKey(firstId)){
            //@TODO: graph does not exist
        }
        Graph first = graphs.get(firstId);
        String secondId = ctx.IDENTIFIER(0).getText();
        if (!graphs.containsKey(secondId)){
            //@TODO: graph does not exist
        }
        Graph second = graphs.get(secondId);
        currentGraph.copy(first.Union(second));
    }

    @Override
    public void enterGraph_function_statement(GRAPHenParser.Graph_function_statementContext ctx) {
        String id = ctx.IDENTIFIER().getText();
        if (!graphs.containsKey(id)){
            //@TODO: error
        }
        else {
            currentGraph = graphs.get(id);
            enterGraph_function(ctx.graph_function());
        }
    }

    //@TODO: export to file function
}
