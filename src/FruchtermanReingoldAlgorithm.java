import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.geometry.Insets;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FruchtermanReingoldAlgorithm extends Application {

    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static final double AREA_MULTIPLIER = 10000.0;
    private static final double FORCE_MULTIPLIER = 0.75;
    private static final double EPSILON = 0.1;
    private static final int MIN_POSITION = 10;

    private static final double REPULSION_MULTIPLIER = 0.44;

    private List<Node> nodes;
    private List<Edge> edges;
    private Random random;

    private Canvas canvas;
    private TextArea textArea;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        canvas = new Canvas(400, 300);

        textArea = new TextArea();
        textArea.setWrapText(true);

        VBox leftBox = new VBox(10);
        leftBox.setPadding(new Insets(10));
        leftBox.getChildren().add(canvas);

        VBox rightBox = new VBox(10);
        rightBox.setPadding(new Insets(10));
        rightBox.getChildren().add(textArea);

        HBox root = new HBox(10);
        root.setPadding(new Insets(10));
        root.getChildren().addAll(leftBox, rightBox);

        Scene scene = new Scene(root, 800, 400);
        primaryStage.setTitle("Draw and Write");
        primaryStage.setScene(scene);
        primaryStage.show();

        drawShapes();
        writeText("Sample text");

       /* Group root = new Group();
        Scene scene = new Scene(root, WIDTH, HEIGHT);

        initializeGraph();

        for (Edge edge : edges) {
            Line line = new Line(edge.source.x, edge.source.y, edge.target.x, edge.target.y);
            line.setStroke(Color.GRAY);
            root.getChildren().add(line);
        }

        for (Node node : nodes) {
            System.out.println(node.x + node.y);
            Circle circle = new Circle(node.x, node.y, 5);
            circle.setFill(Color.BLUE);
            root.getChildren().add(circle);
        }

        primaryStage.setTitle("Fruchterman-Reingold Algorithm");
        primaryStage.setScene(scene);
        primaryStage.show();*/
    }

    private void drawShapes() {
        GraphicsContext gc = canvas.getGraphicsContext2D();

        initializeGraph();

        for (Edge edge : edges) {

            gc.setStroke(Color.RED);
            gc.setLineWidth(2);
            gc.strokeLine(edge.source.x, edge.source.y, edge.target.x, edge.target.y);
        }

        for (Node node : nodes) {
            gc.setFill(Color.BLUE);
            gc.fillOval(node.x, node.y, 5, 5);
        }

    }

    private void writeText(String text) {
        textArea.setText(text);
    }

    private void initializeGraph() {
        nodes = new ArrayList<>();
        edges = new ArrayList<>();
        random = new Random();

        // Generate example graph
        Node node1 = new Node(100, 100);
        Node node2 = new Node(200, 100);
        Node node3 = new Node(150, 200);
        Node node4 = new Node(250, 200);
        Node node5 = new Node(300, 100);

        nodes.add(node1);
        nodes.add(node2);
        nodes.add(node3);
        nodes.add(node4);
        nodes.add(node5);

        edges.add(new Edge(node1, node2));
        edges.add(new Edge(node1, node3));
        edges.add(new Edge(node2, node3));
        edges.add(new Edge(node3, node4));
        edges.add(new Edge(node4, node5));

        // Apply Fruchterman-Reingold algorithm
        fruchtermanReingold();
    }

    private void fruchtermanReingold() {
        double area = (WIDTH - MIN_POSITION) * (HEIGHT - MIN_POSITION) * AREA_MULTIPLIER;
        double k = Math.sqrt(area / nodes.size());


        for (int i = 0; i < 100; i++) {
            for (Node node : nodes) {
                node.dx = 0;
                node.dy = 0;
                for (Node otherNode : nodes) {
                    if (node != otherNode) {
                        double vx = node.x - otherNode.x;
                        double vy = node.y - otherNode.y;
                        double distance = Math.max(EPSILON, Math.sqrt(vx * vx + vy * vy));
                        double force = (k * k) / distance;
                        node.dx += (vx / distance) * force;
                        node.dy += (vy / distance) * force;
                    }
                }
            }

            for (Edge edge : edges) {
                double vx = edge.source.x - edge.target.x;
                double vy = edge.source.y - edge.target.y;
                double distance = Math.max(EPSILON, Math.sqrt(vx * vx + vy * vy));
                double force = (distance * distance) / k;
                edge.source.dx -= (vx / distance) * force * FORCE_MULTIPLIER;
                edge.source.dy -= (vy / distance) * force * FORCE_MULTIPLIER;
                edge.target.dx += (vx / distance) * force * FORCE_MULTIPLIER;
                edge.target.dy += (vy / distance) * force * FORCE_MULTIPLIER;
            }

            for (Node node : nodes) {
               /* double dx = node.dx;
                double dy = node.dy;
                double distance = Math.max(EPSILON, Math.sqrt(dx * dx + dy * dy));
                double displacement = Math.min(distance, k) / distance;
                node.x += dx * displacement;
                node.y += dy * displacement;
                node.x = Math.max(MIN_POSITION, Math.min(WIDTH, node.x));
                node.y = Math.max(MIN_POSITION, Math.min(HEIGHT, node.y));*/
                for (Node otherNode : nodes) {
                    if (node != otherNode) {
                        double vx = node.x - otherNode.x;
                        double vy = node.y - otherNode.y;
                        double distance = Math.max(EPSILON, Math.sqrt(vx * vx + vy * vy));
                        double repulsion = (k * k) / distance;
                        node.dx += (vx / distance) * repulsion * REPULSION_MULTIPLIER;
                        node.dy += (vy / distance) * repulsion * REPULSION_MULTIPLIER;
                    }
                }
            }
        }
    }

    private static class Node {
        double x;
        double y;
        double dx;
        double dy;

        Node(double x, double y) {
            this.x = x;
            this.y = y;
        }
    }

    private static class Edge {
        Node source;
        Node target;

        Edge(Node source, Node target) {
            this.source = source;
            this.target = target;
        }
    }
}
