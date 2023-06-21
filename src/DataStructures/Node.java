package DataStructures;

import java.util.Random;

public class Node implements Variable {

    private String node_contents = "Node"; //@TODO: wip usunąć w produkcji

    private String cont_color = "0x0000FF";
    private int cont_size = 15;
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

    public Node(){
        /*
        Random random = new Random();
        int Max = 600;
        int Min = 100;
        this.x = Math.random() * ( Max - Min );
        this.y = Math.random() * ( Max - Min );
        */
    }

    public Node(double x, double y){
        this.x = x;
        this.y= y;
    }

    public Node(String node_contents, String cont_color, int cont_size, String fill_color, String border_color, NodeShape node_shape,
                int size, int border_width, LineType border_line_shape) {

        this.node_contents = node_contents;
        this.cont_color = cont_color;
        this.cont_size = cont_size;
        this.fill_color = fill_color;
        this.border_color = border_color;
        this.node_shape = node_shape;
        this.node_size = size;
        this.border_width = border_width;
        this.border_line_shape = border_line_shape;
        Random random = new Random();
        int Max = 600;
        int Min = 100;
        this.x = Math.random() * ( Max - Min );
        this.y = Math.random() * ( Max - Min );
    }

    public Node(Node other){
        this.node_contents = other.node_contents;
        this.cont_color = other.cont_color;
        this.cont_size = other.cont_size;
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

    // Getter for cont_color
    public String getContColor() {
        return cont_color;
    }

    // Setter for cont_color
    public void setContColor(String cont_color) {
        this.cont_color = cont_color;
    }

    // Getter for cont_size
    public int getContSize() {
        return cont_size;
    }

    // Setter for cont_size
    public void setContSize(int cont_size) {
        this.cont_size = cont_size;
    }

    public void setCoords(double x, double y){
        this.x=x;
        this.y=y;
    }

}
