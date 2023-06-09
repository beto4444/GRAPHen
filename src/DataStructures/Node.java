package DataStructures;

public class Node implements Variable {

    private String node_contents = "";
    private String fill_color = "0x0000FF";
    private String border_color = "#ffbb00";
    private NodeShape node_shape = NodeShape.STAR;

    private int node_size = 15;
    private int border_width = 3;
    private LineType border_line_shape = LineType.STRAIGHT;

    public double x = 0.0;
    public double y = 0.0;
    public double dx = 0.0;
    public double dy = 0.0;

    public Node(){}

    public Node(double x, double y){
        this.x = x;
        this.y= y;
    }

    public Node(String node_contents, String fill_color, String border_color, NodeShape node_shape, int size, int border_width, LineType border_line_shape) {

        this.node_contents = node_contents;
        this.fill_color = fill_color;
        this.border_color = border_color;
        this.node_shape = node_shape;
        this.node_size = size;
        this.border_width = border_width;
        this.border_line_shape = border_line_shape;
    }

    public Node(Node other){
        this.node_contents = other.node_contents;
        this.fill_color = other.fill_color;
        this.border_color = other.border_color;
        this.node_shape = other.node_shape;
        this.node_size = other.node_size;
        this.border_width = other.border_width;
        this.border_line_shape = other.border_line_shape;

    }


    public String getNodeContents() {
        return node_contents;
    }

    public void setNodeContents(String node_contents) {
        this.node_contents = node_contents;
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

    public NodeShape getNodeShape() {
        return node_shape;
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

    public LineType getBorderLineShape() {
        return border_line_shape;
    }

    public void setBorderLineShape(LineType border_line_shape) {
        this.border_line_shape = border_line_shape;
    }
}
