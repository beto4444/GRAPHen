import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sourceCodeScanner = new Scanner(new File("test1.gr"));
        String sourceCodeText = sourceCodeScanner.nextLine();
        System.out.print(sourceCodeText);
    }
}