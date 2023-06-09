package DataStructures;

import java.util.ArrayList;
import java.util.List;

public class Edge implements Variable {
    int num_color = 0;
    int line_width = 3;
    String color = "#ffbb00";
    LineType line_type = LineType.DOTTED;
    public Node source = null;
    public List<Node> target = new ArrayList<>();

    public Edge(){}

    public Edge(Node s, List<Node> t){
        this.source = s;
        this.target = t;
    }

    public Edge(int num_color, int line_width, String color, LineType line_type, Node source, List<Node> target) {
        this.num_color = num_color;
        this.line_width = line_width;
        this.color = color;
        this.line_type = line_type;
        this.source = source;
        this.target = target;
    }

    public Edge(Edge other){
        this.num_color =    other.num_color;
        this.line_width =   other.line_width;
        this.color =        other.color;
        this.line_type =    other.line_type;
        this.source = other.source;
        this.target = other.target;
    }

    public int getNumColor() {
        return num_color;
    }

    public void setNumColor(int num_color) {
        this.num_color = num_color;
    }

    public int getLineWidth() {
        return line_width;
    }

    public void setLineWidth(int line_width) {
        this.line_width = line_width;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public LineType getLineType() {
        return line_type;
    }

    public void setLineType(LineType line_type) {

        this.line_type = line_type;
    }

    public void setRelations(Node parent, List<Node> children){
        this.source = parent;
        this.target = children;
    }

    public Node getSource(){
        return this.source;
    }

    public List<Node> getTarget(){
        return this.target;
    }
}
