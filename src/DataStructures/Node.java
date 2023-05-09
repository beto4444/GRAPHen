package DataStructures;

public class Node {
    private int num_color;
    private String fill_color;
    private String border_color;
    private NodeShape node_shape;

    private int node_size;
    private int border_width;
    private String border_line_shape;

    public Node(int num_color, String fill_color, String border_color, NodeShape node_shape, int size, int border_width, String border_line_shape) {
        this.num_color = num_color;
        this.fill_color = fill_color;
        this.border_color = border_color;
        this.node_shape = node_shape;
        this.node_size = size;
        this.border_width = border_width;
        this.border_line_shape = border_line_shape;
    }

    public int getNumColor() {
        return num_color;
    }

    public void setNumColor(int num_color) {
        this.num_color = num_color;
    }

    public String getFillColor() {
        return fill_color;
    }

    public void setFillColor(String fill_color) {
        this.fill_color = fill_color;
    }

    public String getBorderColor() {
        return border_color;
    }

    public void setBorderColor(String border_color) {
        this.border_color = border_color;
    }

    public String getNodeShape() {
        return node_shape.toString();
    }

    public void setNodeShape(NodeShape node_shape) {
        this.node_shape = node_shape;
    }

    public int getNodeSize() {
        return node_size;
    }

    public void setNodeSize(int node_size) {
        this.node_size = node_size;
    }

    public int getBorderWidth() {
        return border_width;
    }

    public void setBorderWidth(int border_width) {
        this.border_width = border_width;
    }

    public String getBorderLineShape() {
        return border_line_shape;
    }

    public void setBorderLineShape(String border_line_shape) {
        this.border_line_shape = border_line_shape;
    }
}
