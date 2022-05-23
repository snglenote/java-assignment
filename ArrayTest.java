import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;



public class ArrayTest {
    public static void main(String[] args) throws IOException {
        List<String> wordsList = Files.readAllLines(Paths.get("100.txt"));
        Collections.shuffle(wordsList);
        List<String> random20WordsList = wordsList.subList(0, 20);
        System.out.printf("random20WordsList = %s%n", random20WordsList);
        String[] random20WordsArray = random20WordsList.toArray(new String[20]);
        System.out.printf("random20WordsArray = %s%n", Arrays.toString(random20WordsArray));
    }
}
 




