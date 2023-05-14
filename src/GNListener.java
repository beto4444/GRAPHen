import java.util.HashMap;

import DataStructures.*;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

public class GNListener extends GRAPHenBaseListener {
    private final HashMap<String, Node> nodes = new HashMap<>();
    private final HashMap<String, Edge> edges = new HashMap<>();
    private final HashMap<String, Graph> graphs = new HashMap<>();
    private final HashMap<String, Graph> digraphs = new HashMap<>();
    private String current;

    @Override
    public void enterNode_definition(GRAPHenParser.Node_definitionContext ctx) {
        String id = ctx.IDENTIFIER().getText();
        Node node = new Node();
        current = id;
        nodes.put(id, node);
    }

    @Override
    public void enterNode_inline(GRAPHenParser.Node_inlineContext ctx) {
        String id = ctx.IDENTIFIER().getText();
        Node node = new Node();
        current = id;
        nodes.put(id, node);
    }

    @Override
    public void enterNode_properties(GRAPHenParser.Node_propertiesContext ctx) {
        Node node = nodes.get(current);

        TerminalNode numColorNode = ctx.TEXT();
        if (numColorNode != null) {
            int numColor = Integer.parseInt(ctx.TEXT().getText());
            node.setNumColor(numColor);
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
        current = id;
        edges.put(id, edge);
    }

    @Override
    public void enterEdge_inline(GRAPHenParser.Edge_inlineContext ctx) {
        String id = ctx.IDENTIFIER().getText();
        Edge edge = new Edge();
        current = id;
        edges.put(id, edge);
    }

    @Override
    public void enterEdge_properties(GRAPHenParser.Edge_propertiesContext ctx) {
        Edge edge = edges.get(current);

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

    //@TODO
}
