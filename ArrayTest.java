import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class ArrayTest {
    public static void main(String[] args) {
        List<String> wordsList = Files.readAllLines(Paths.get("100.txt"));
        Collections.shuffle(wordsList);
        List<String> random20WordsList = wordsList.subList(0, 19);
        System.out.printf("random20WordsList = %s%n", random20WordsList);
        String[] random20WordsArray = random20WordsList.toArray(new String[20]);
        System.out.printf("random20WordsArray = %s%n", Arrays.toString(random20WordsArray));
    }
    
        public static void bubbleSort() {

         String str[] = {"Lorem" , "Ipsum" , "Dolor" , "Sit" , "Etiam" ,  "Amet" , "Consectetur", "Adipiscing" , "Elit" , "Integer",  "Auctor", "Purus", "Nec" , "Congue", "Dolor" , "Tellus" , "Scelerisque" , "Mongo", "Nam", "Diam"};

         String temp;
            System.out.println("Strings in sorted order:");
                for (int j = 0; j < str.length; j++) {
                for (int i = j + 1; i < str.length; i++) {
                    
                if (str[i].compareTo(str[j]) < 0) {
                 temp = str[j];
                 str[j] = str[i];
                 str[i] = temp;
             }
            }
             System.out.println(str[j]);
            }            
        }
    }




