import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    static String[] splitWords = {"0", "0"};

    public static void readFile() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("calories.txt"));
        String oneLine;
        while (scanner.hasNextLine()) {
            oneLine = scanner.nextLine();
            splitWords = oneLine.split(";");
        }
    }
}
