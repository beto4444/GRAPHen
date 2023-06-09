import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Polygon;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.geometry.Insets;

import java.awt.Desktop;
import java.net.URI;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import DataStructures.*;

public class GRAPHenApp extends Application {

    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static final double AREA_MULTIPLIER = 10000.0;
    private static final double FORCE_MULTIPLIER = 0.75;
    private static final double EPSILON = 0.1;
    private static final int MIN_POSITION = 60;

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
        //Left box
        canvas = new Canvas(600, 700);

        VBox leftBox = new VBox(10);
        leftBox.setPadding(new Insets(10));
        leftBox.getChildren().add(canvas);

        //right box
        textArea = new TextArea();
        textArea.setWrapText(true);
        textArea.setPrefHeight(650);
        textArea.setPrefWidth(600);
        textArea.setText("Sample text");


        TextArea feedbackArea = new TextArea();
        feedbackArea.setEditable(false);
        feedbackArea.setPrefHeight(100);
        feedbackArea.setPrefWidth(600);
        //@TODO: css

        // Set initial feedback text
        feedbackArea.setText("Welcome! This is the feedback area.");

        VBox rightBox = new VBox(10);
        rightBox.setPadding(new Insets(10));
        rightBox.getChildren().addAll(textArea, feedbackArea);

        //toolbar

        Button button = new Button("Generate");
        // Bind the event handler to the button
        button.setOnAction(event -> drawShapes());

        Button compile_button = new Button("Compile");

        // Create an event handler for the button
        EventHandler<ActionEvent> compileButtonClickHandler = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // Functionality to be executed when the button is clicked
                String code = textArea.getText();
                //@TODO tutaj puścić to do parsera i ustawić listy node'ów i edgy na te z listenera, użyć feedbackArea do wypluwania błędów
                feedbackArea.setText(code);
            }
        };

        // Bind the event handler to the button
        compile_button.setOnAction(compileButtonClickHandler);

        ToolBar toolBar = new ToolBar(
                compile_button, //@TODO - polepszyć
                button
        );

        toolBar.setOrientation(Orientation.VERTICAL);

        //Menu
        MenuBar menuBar = new MenuBar();

        Menu fileMenu = new Menu("File");
        MenuItem openMenuItem = new MenuItem("Open"); //@TODO opcjonalnie
        MenuItem saveMenuItem = new MenuItem("Save"); //@TODO opcjonalnie
        MenuItem exportMenuItem = new MenuItem("Export");
        MenuItem exitMenuItem = new MenuItem("Exit");
        exitMenuItem.setOnAction( e -> {
            Platform.exit();
        });
        fileMenu.getItems().addAll(openMenuItem, saveMenuItem, exportMenuItem,exitMenuItem);

        menuBar.getMenus().add(fileMenu);

        Menu optionsMenu = new Menu("Options");
        MenuItem settingsMenuItem = new MenuItem("Settings");
        MenuItem aboutMenuItem = new MenuItem("About...");
        aboutMenuItem.setOnAction(e -> {
            openHyperlink("https://github.com/beto4444/GRAPHen_Polnische_Graphcomputersprache");
        });
        optionsMenu.getItems().addAll(settingsMenuItem, aboutMenuItem);

        menuBar.getMenus().add(optionsMenu);


        //root
        BorderPane root = new BorderPane();
        root.setTop(menuBar);
        root.setLeft(leftBox);
        root.setCenter(rightBox);
        root.setRight(toolBar);

        Scene scene = new Scene(root, 1366, 768);
        primaryStage.setTitle("GRAPHen");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    private void openHyperlink(String url) {
        try {
            Desktop.getDesktop().browse(new URI(url));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void drawShapes() {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());

        initializeGraph();

        for (Edge edge : edges) {
            for (Node t: edge.target){
                gc.setStroke(Color.web(edge.getColor()));
                gc.setLineWidth(edge.getLineWidth());
                if (edge.getLineType() == LineType.DOTTED){
                    gc.setLineDashes(5, 5);
                }else {
                    gc.setLineDashes(0, 0);
                }
                gc.strokeLine(edge.source.x, edge.source.y, t.x, t.y);
            }

        }

        for (Node node : nodes) {
            double r = node.getNodeSize();
            double border = node.getBorderWidth();
            gc.setFill(Color.web(node.getFillColor()));
            if (node.getNodeShape() == NodeShape.OVAL) {
                gc.fillOval(node.x - r / 2, node.y - r / 2, r, r);
                gc.setStroke(Color.web(node.getBorderColor()));
                gc.setLineWidth(border);
                if (node.getBorderLineShape() == LineType.DOTTED) {
                    gc.setLineDashes(3, 3);
                } else {
                    gc.setLineDashes(0, 0);
                }
                gc.strokeOval(node.x - r / 2, node.y - r / 2, r, r);
            } else if (node.getNodeShape() == NodeShape.DIAMOND){
                double [] xPoints = {node.x-r, node.x, node.x+r, node.x};
                double [] yPoints = {node.y, node.y+r, node.y, node.y-r};
                gc.fillPolygon(xPoints, yPoints, 4);
                gc.setStroke(Color.web(node.getBorderColor()));
                gc.setLineWidth(border);
                if (node.getBorderLineShape() == LineType.DOTTED) {
                    gc.setLineDashes(3, 3);
                } else {
                    gc.setLineDashes(0, 0);
                }
                gc.strokePolygon(xPoints, yPoints, 4);
            } else if (node.getNodeShape() == NodeShape.CROSS){
                double [] xPoints = {node.x-r, node.x-r/2, node.x-r/2, node.x+r/2, node.x+r/2, node.x+r,
                        node.x+r,node.x+r/2, node.x+r/2, node.x-r/2,node.x-r/2, node.x-r};
                double [] yPoints = {node.y+r/2,node.y+r/2, node.y+r,node.y+r, node.y+r/2,node.y+r/2,
                        node.y-r/2,node.y-r/2, node.y-r, node.y-r, node.y-r/2,node.y-r/2,};
                gc.fillPolygon(xPoints, yPoints, 12);
                gc.setStroke(Color.web(node.getBorderColor()));
                gc.setLineWidth(border);
                if (node.getBorderLineShape() == LineType.DOTTED) {
                    gc.setLineDashes(3, 3);
                } else {
                    gc.setLineDashes(0, 0);
                }
                gc.strokePolygon(xPoints, yPoints, 12);
            } else if (node.getNodeShape() == NodeShape.STAR){
                double angle = 2 * Math.PI / 5;

                double[] xPoints = new double[10];
                double[] yPoints = new double[10];

                for (int i = 0; i < 10; i++) {
                    double currentRadius = i % 2 == 0 ? r : r / 2; // alternate between outer and inner radius
                    double currentAngle = i * angle - Math.PI / 2; // start at the top

                    double x = node.x + currentRadius * Math.cos(currentAngle);
                    double y = node.y + currentRadius * Math.sin(currentAngle);

                    xPoints[i] = x;
                    yPoints[i] = y;
                }
                gc.fillPolygon(xPoints, yPoints, 10);
                gc.setStroke(Color.web(node.getBorderColor()));
                gc.setLineWidth(border);
                if (node.getBorderLineShape() == LineType.DOTTED) {
                    gc.setLineDashes(3, 3);
                } else {
                    gc.setLineDashes(0, 0);
                }
                gc.strokePolygon(xPoints, yPoints, 10);

            }
        }

    }

    private void initializeGraph() { //@TODO: przenieść w inne miejsce?
        nodes = new ArrayList<>();
        edges = new ArrayList<>();
        Random random = new Random();
        int Max = 600;
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

    private void fruchtermanReingold() { //@TODO: przenieść w inne miejsce?
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
