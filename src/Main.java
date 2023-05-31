import java.io.File;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sourceCodeScanner = new Scanner(new File("test1.gr"));
        String sourceCodeText = sourceCodeScanner.nextLine();
        System.out.print(sourceCodeText);
    }
}