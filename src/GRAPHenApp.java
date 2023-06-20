import javafx.application.Application;
import javafx.application.Platform;
import javafx.embed.swing.SwingFXUtils;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.FileChooser;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.geometry.Insets;

import java.awt.Desktop;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.URI;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.*;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import DataStructures.*;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import javax.imageio.ImageIO;

public class GRAPHenApp extends Application {

    private static final int WIDTH = 600;
    private static final int HEIGHT = 700;
    private static final double AREA_MULTIPLIER = 10000.0;
    private static final double FORCE_MULTIPLIER = 0.75;
    private static final double EPSILON = 0.1;
    private static final int MIN_POSITION = 60;

    private static final double REPULSION_MULTIPLIER = .6;

    private List<Node> nodes;
    private List<Edge> edges;

    private List<Graph> graphs;

    private Canvas canvas;

    private String style = "default.css";

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        //Left box
        canvas = new Canvas(WIDTH, HEIGHT);
        StackPane canvasContainer = new StackPane(canvas);

        ScrollPane scrollPane = new ScrollPane(canvasContainer);
        scrollPane.setPrefSize(600, 700);
        scrollPane.getStyleClass().add("scroll-pane");

        VBox leftBox = new VBox(10);
        leftBox.setPadding(new Insets(10));
        leftBox.getChildren().add(scrollPane);
        leftBox.getStyleClass().add("canvas");


        //right box
        TextArea textArea = new TextArea();
        textArea.setWrapText(true);
        textArea.setPrefHeight(650);
        textArea.setPrefWidth(600);
        textArea.getStyleClass().add("text-area");
        textArea.setText("#testgraph");


        TextArea feedbackArea = new TextArea();
        feedbackArea.setEditable(false);
        feedbackArea.setPrefHeight(100);
        feedbackArea.setPrefWidth(600);
        feedbackArea.getStyleClass().add("feedback-area");

        // Set initial feedback text
        feedbackArea.setText("Welcome! This is the feedback area.");

        VBox rightBox = new VBox(10);
        rightBox.setPadding(new Insets(10));
        rightBox.getChildren().addAll(textArea, feedbackArea);
        rightBox.getStyleClass().add("canvas");

        //toolbar

        Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Images/show.png")));
        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(18);
        imageView.setFitHeight(20);
        Button button = new Button();
        button.setGraphic(imageView);
        button.getStyleClass().add("button");
        // Bind the event handler to the button
        button.setOnAction(event -> drawShapes());

        image = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Images/compile.png")));
        imageView = new ImageView(image);
        imageView.setFitWidth(18);
        imageView.setFitHeight(20);
        Button compile_button = new Button();
        compile_button.setGraphic(imageView);
        compile_button.getStyleClass().add("button");

        // Create an event handler for the button
        EventHandler<ActionEvent> compileHandler = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // Functionality to be executed when the button is clicked
                String sourceCodeText = textArea.getText();

                GRAPHenLexer lexer = new GRAPHenLexer(CharStreams.fromString(sourceCodeText));
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                GRAPHenParser parser = new GRAPHenParser(tokens);
                ParseTree parseTree = parser.start();
                ParseTreeWalker walker = new ParseTreeWalker();
                GNListener listener = new GNListener();
                walker.walk(listener, parseTree);
                if (sourceCodeText.equals("#testgraph")) {
                    initializeGraph();
                    //drawShapes();
                    feedbackArea.setText("Test graphics");
                }
                else{
                    nodes = listener.getNodes();
                    edges = listener.getEdges();
                    graphs = listener.getGraphs();
                    feedbackArea.setText(listener.errorsToString());
                    }

                //feedbackArea.setText(sourceCodeText);
            }
        };

        // Bind the event handler to the button
        compile_button.setOnAction(compileHandler);

        ToolBar toolBar = new ToolBar(
                compile_button,
                button
        );

        toolBar.setOrientation(Orientation.VERTICAL);
        toolBar.getStyleClass().add("menu");

        //Menu
        MenuBar menuBar = new MenuBar();
        menuBar.getStyleClass().add("menu");

        Menu fileMenu = new Menu("File");
        fileMenu.getStyleClass().add("menu");
        MenuItem openMenuItem = new MenuItem("Open");
        openMenuItem.setOnAction(e-> {
            try {
                handleOpen(primaryStage, textArea);
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
        });
        MenuItem saveMenuItem = new MenuItem("Save");
        saveMenuItem.setOnAction(e -> handleSave(primaryStage, textArea.getText()));
        MenuItem exportMenuItem = new MenuItem("Export");
        exportMenuItem.setOnAction(e -> handleExport(primaryStage));
        MenuItem exitMenuItem = new MenuItem("Exit");
        exitMenuItem.setOnAction( e -> {
            Platform.exit();
        });
        fileMenu.getItems().addAll(openMenuItem, saveMenuItem, exportMenuItem,exitMenuItem);

        menuBar.getMenus().add(fileMenu);

        Menu optionsMenu = new Menu("Options");
        MenuItem dmodeMenuItem = new MenuItem("Dark mode");
        dmodeMenuItem.setOnAction(e -> changeStyle(primaryStage, "dracula.css") );
        MenuItem lmodeMenuItem = new MenuItem("Light mode");
        lmodeMenuItem.setOnAction(e -> changeStyle(primaryStage, "default.css"));
        MenuItem aboutMenuItem = new MenuItem("About...");
        aboutMenuItem.setOnAction(e -> {
            openHyperlink();
        });
        optionsMenu.getItems().addAll(dmodeMenuItem, lmodeMenuItem,aboutMenuItem);

        menuBar.getMenus().add(optionsMenu);


        //root
        BorderPane root = new BorderPane();
        root.setTop(menuBar);
        root.setLeft(leftBox);
        root.setCenter(rightBox);
        root.setRight(toolBar);

        Scene scene = new Scene(root, 1366, 768);
        scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource(this.style)).toExternalForm());
        primaryStage.setTitle("GRAPHen");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    private void changeStyle(Stage primaryStage, String style) {
        // Clear current stylesheets
        Scene scene = primaryStage.getScene();
        scene.getStylesheets().clear();

        // Set new stylesheet
        this.style = style;
        scene.getStylesheets().add(style);
    }

    private void handleSave(Stage primaryStage, String code) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Save File");
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("GRAPHen files", "*.ghen"));

        File file = fileChooser.showSaveDialog(primaryStage);
        if (file != null) {
            writeEncrypt(file.getPath(), code);
        }
    }

    private void handleOpen(Stage primaryStage, TextArea textArea) throws FileNotFoundException, NoSuchPaddingException,
            IllegalBlockSizeException, NoSuchAlgorithmException, BadPaddingException, InvalidKeyException {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open File");

        // Set the extension filter (optional)
        FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("GRAPHen files", "*.ghen");
        fileChooser.getExtensionFilters().add(extFilter);

        File file = fileChooser.showOpenDialog(primaryStage);

        if (file != null) {
            String code = readEnrcypt(file.getPath());
            textArea.setText(code);
        } else {
            throw new FileNotFoundException();
        }
    }

    private void handleExport(Stage primaryStage){
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Export File");
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("png", "*.png"));
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("jpg", "*.jpg"));
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("bmp", "*.bmp"));

        File outputFile = fileChooser.showSaveDialog(primaryStage);
        if (outputFile != null) {
            String fileName = outputFile.getName();
            String fileExtension = "";

            int dotIndex = fileName.lastIndexOf('.');
            if (dotIndex > 0 && dotIndex < fileName.length() - 1) {
                fileExtension = fileName.substring(dotIndex + 1);
            }

            WritableImage writableImage = new WritableImage((int) canvas.getWidth(), (int) canvas.getHeight());
            canvas.snapshot(null, writableImage);

            try {
                BufferedImage bufferedImage = SwingFXUtils.fromFXImage(writableImage,
                        new BufferedImage((int)writableImage.getWidth(), (int)writableImage.getHeight(), BufferedImage.TYPE_INT_RGB));
                ImageIO.write(bufferedImage, fileExtension, outputFile);
                System.out.println("Canvas saved successfully.");
            } catch (IOException e) {
                System.out.println("Failed to save canvas " + e.getMessage());
            }
        }
    }


    private void openHyperlink() {
        try {
            Desktop.getDesktop().browse(new URI("https://github.com/beto4444/GRAPHen_Polnische_Graphcomputersprache"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void writeEncrypt(String filename, String code){
        try{

            byte[] decodedKey = Base64.getDecoder().decode(readKeyFromEnvFile());
            SecretKey myDesKey = new SecretKeySpec(decodedKey, 0, decodedKey.length, "DES");

            Cipher desCipher;
            desCipher = Cipher.getInstance("DES");


            byte[] text = code.getBytes("UTF8");

            desCipher.init(Cipher.ENCRYPT_MODE, myDesKey);
            byte[] textEncrypted = desCipher.doFinal(text);

            try (OutputStream outputStream = new FileOutputStream(filename)) {
                outputStream.write(textEncrypted);
            }
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    private String readEnrcypt(String filename) throws NoSuchPaddingException, NoSuchAlgorithmException,
            FileNotFoundException, IllegalBlockSizeException, BadPaddingException, InvalidKeyException {

        byte[] decodedKey = Base64.getDecoder().decode(readKeyFromEnvFile());
        SecretKey myDesKey = new SecretKeySpec(decodedKey, 0, decodedKey.length, "DES");

        Cipher desCipher;
        desCipher = Cipher.getInstance("DES");
        desCipher.init(Cipher.DECRYPT_MODE, myDesKey);

        byte[] encryptedBytes;
        try (InputStream inputStream = new FileInputStream(filename)) {
            encryptedBytes = inputStream.readAllBytes();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        byte[] textDecrypted = desCipher.doFinal(encryptedBytes);

        return new String(textDecrypted);
    }

    private static String readKeyFromEnvFile() throws FileNotFoundException {
        File envFile = new File("src/.env");
        Scanner scanner = new Scanner(envFile);
        return scanner.nextLine().trim();
    }
    private void drawShapes() {
        if (this.graphs == null){
            return;
        }
        GraphicsContext gc = canvas.getGraphicsContext2D();
        //gc.setFill(Color.TRANSPARENT);
        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
        canvas.setHeight(HEIGHT*graphs.size());
        int index=0;

        for (Graph graph: graphs){
            this.edges = graph.getEdges();
            this.nodes = graph.getNodes();
            fruchtermanReingold();

            for (Node node : nodes) {
                node.y += index*HEIGHT;
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
                if (node.getNodeContents().length() != 0) {
                    gc.setFill(Color.web(node.getContColor()));
                    gc.setFont(javafx.scene.text.Font.font("Arial", node.getContSize()));

                    // Write text on the canvas
                    gc.fillText(node.getNodeContents(), node.x + r + border + 5, node.y);
                }
            }

            for (Edge edge : edges) {
                for (Node t: edge.target){
                    gc.setStroke(Color.web(edge.getColor()));
                    gc.setLineWidth(edge.getLineWidth());
                    if (edge.getLineType() == LineType.DOTTED){
                        gc.setLineDashes(5, 5);
                    }else {
                        gc.setLineDashes(0, 0);
                    }
                    if (graph.digraph){
                        drawArrow(gc, edge.source.x, edge.source.y, t.x, t.y, edge.getLineWidth()*10);
                    }
                    gc.strokeLine(edge.source.x, edge.source.y, t.x, t.y);
                }

            }

            index++;
        }
    }

    private void drawArrow(GraphicsContext gc, double startX, double startY, double endX, double endY, double arrowSize) {
        double angle = Math.atan2(endY - startY, endX - startX);
        double arrowAngle = Math.toRadians(30);

        // Draw the line
        gc.strokeLine(startX, startY, endX, endY);

        // Draw the arrowhead
        double arrowX1 = endX - arrowSize * Math.cos(angle + arrowAngle);
        double arrowY1 = endY - arrowSize * Math.sin(angle + arrowAngle);
        double arrowX2 = endX - arrowSize * Math.cos(angle - arrowAngle);
        double arrowY2 = endY - arrowSize * Math.sin(angle - arrowAngle);

        gc.strokeLine(endX, endY, arrowX1, arrowY1);
        gc.strokeLine(endX, endY, arrowX2, arrowY2);
    }

    private void initializeGraph() { //@TODO: przenieść w inne miejsce?
        nodes = new ArrayList<>();
        edges = new ArrayList<>();
        graphs = new ArrayList<>();
        Graph graph = new Graph(true);
        // Generate example graph
        Node node1 = new Node();
        Node node2 = new Node();
        Node node3 = new Node();
        Node node4 = new Node();
        Node node5 = new Node();

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
        
        Edge e = new Edge();

        graph.addRelation(node1, e, t1);
        graph.addRelation(node1, e, t2);
        graph.addRelation(node2, e, t3);
        graph.addRelation(node3, e, t4);
        graph.addRelation(node4, e, t5);

        graphs.add(graph);
        graphs.add(new Graph(graph));

        nodes = graph.getNodes();
        edges = graph.getEdges();

    }

    private void initialiseNodes(){
        for (Node node: nodes){
              node.setCoords(Math.random() * ( 420.0 - (double) GRAPHenApp.MIN_POSITION), Math.random() * ( (double) 640 - (double) GRAPHenApp.MIN_POSITION));
        }

    }

    private void fruchtermanReingold() { //@TODO: przenieść w inne miejsce?
        double area = (HEIGHT -MIN_POSITION) * (WIDTH - MIN_POSITION) * AREA_MULTIPLIER;
        double k = Math.sqrt(area / nodes.size());
        initialiseNodes( );


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
