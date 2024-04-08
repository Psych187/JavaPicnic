import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCounter {
    public int countWords(File file) {
        int count = 0;
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                scanner.next();
                count++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        return count;
    }
}
