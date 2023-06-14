import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File sourceCodeFile = new File("test1.txt");
        Scanner sourceCodeScanner = new Scanner(new File("test1.txt"));
        StringBuilder sb = new StringBuilder();
        while(sourceCodeScanner.hasNextLine()) {
            sb.append(sourceCodeScanner.nextLine());
            sb.append('\n');
        }

        String sourceCodeText = sb.toString();
        GRAPHenLexer lexer = new GRAPHenLexer(CharStreams.fromString(sourceCodeText));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        GRAPHenParser parser = new GRAPHenParser(tokens);
        ParseTree parseTree = parser.start();
        ParseTreeWalker walker = new ParseTreeWalker();
        GNListener listener = new GNListener();
        walker.walk(listener, parseTree);

        listener.describeData();
    }
}