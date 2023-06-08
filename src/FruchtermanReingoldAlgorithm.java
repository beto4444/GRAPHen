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

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

import DataStructures.*;

public class FruchtermanReingoldAlgorithm extends Application {

    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static final double AREA_MULTIPLIER = 10000.0;
    private static final double FORCE_MULTIPLIER = 0.75;
    private static final double EPSILON = 0.1;
    private static final int MIN_POSITION = 10;

    private static final double REPULSION_MULTIPLIER = .6;

    private List<Node> nodes;
    private List<Edge> edges;

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

        Button button = new Button("Generate");

        // Create an event handler for the button
        EventHandler<ActionEvent> buttonClickHandler = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // Functionality to be executed when the button is clicked
                String code = textArea.getText();
                //@TODO tutaj puścić to do parsera i ustawić listy node'ów i edgy na te z listenera
                System.out.println(code);
                drawShapes();
            }
        };

        // Bind the event handler to the button
        button.setOnAction(buttonClickHandler);


        VBox rightBox = new VBox(10);
        rightBox.setPadding(new Insets(10));
        rightBox.getChildren().add(textArea);
        rightBox.getChildren().add(button);

        HBox root = new HBox(10);
        root.setPadding(new Insets(10));
        root.getChildren().addAll(leftBox, rightBox);

        Scene scene = new Scene(root, 800, 400);
        primaryStage.setTitle("GRAPHen");
        primaryStage.setScene(scene);
        primaryStage.show();

        //drawShapes();
        writeText("Sample text");
    }

    private void drawShapes() {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());

        initializeGraph();

        for (Edge edge : edges) {
            for (Node t: edge.target){
                gc.setStroke(Color.RED);
                gc.setLineWidth(2);
                gc.strokeLine(edge.source.x, edge.source.y, t.x, t.y);
            }

        }

        for (Node node : nodes) {
            gc.setFill(Color.BLUE);
            gc.fillOval(node.x-7.5, node.y-7.5, 15, 15);
        }

    }

    private void writeText(String text) {
        textArea.setText(text);
    }

    private void initializeGraph() {
        nodes = new ArrayList<>();
        edges = new ArrayList<>();
        Random random = new Random();
        int Max = 300;
        int Min = 100;

        // Generate example graph
        Node node1 = new Node(Math.random() * ( Max - Min ), Math.random() * ( Max - Min ));
        Node node2 = new Node(Math.random() * ( Max - Min ), Math.random() * ( Max - Min ));
        Node node3 = new Node(Math.random() * ( Max - Min ), Math.random() * ( Max - Min ));
        Node node4 = new Node(Math.random() * ( Max - Min ), Math.random() * ( Max - Min ));
        Node node5 = new Node(Math.random() * ( Max - Min ), Math.random() * ( Max - Min ));

        nodes.add(node1);
        nodes.add(node2);
        nodes.add(node3);
        nodes.add(node4);
        nodes.add(node5);

        List<Node> t1 = new ArrayList<>();
        List<Node> t2 = new ArrayList<>();
        List<Node> t3 = new ArrayList<>();
        List<Node> t4 = new ArrayList<>();
        List<Node> t5 = new ArrayList<>();
        t1.add(node2);
        t2.add(node3);
        t3.add(node3);
        t4.add(node4);
        t5.add(node5);


        edges.add(new Edge(node1, t1));
        edges.add(new Edge(node1, t2));
        edges.add(new Edge(node2, t3));
        edges.add(new Edge(node3, t4));
        edges.add(new Edge(node4, t5));

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
                for (Node t: edge.target) {
                    double vx = edge.source.x - t.x;
                    double vy = edge.source.y - t.y;
                    double distance = Math.max(EPSILON, Math.sqrt(vx * vx + vy * vy));
                    double force = (distance * distance) / k;
                    edge.source.dx -= (vx / distance) * force * FORCE_MULTIPLIER;
                    edge.source.dy -= (vy / distance) * force * FORCE_MULTIPLIER;
                    t.dx += (vx / distance) * force * FORCE_MULTIPLIER;
                    t.dy += (vy / distance) * force * FORCE_MULTIPLIER;
                }
            }

            for (Node node : nodes) {
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

}
