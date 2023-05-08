package DataStructures;

public class Edge {
    int num_color;
    int line_width;
    String color;
    String line_type;

    public Edge(int num_color, int line_width, String color, String line_type) {
        this.num_color = num_color;
        this.line_width = line_width;
        this.color = color;
        this.line_type = line_type;
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

    public String getLineType() {
        return line_type;
    }

    public void setLineType(String line_type) {
        this.line_type = line_type;
    }
}
