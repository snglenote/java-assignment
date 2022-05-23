import java.io.FileWriter;
import java.io.IOException;


public class BubbleSort {

    public static void main(String []args) throws IOException {
        
            String str[] = {"Father" , "Head" , "Stand" , "Own" , "Page" ,  "Should" , "Country", "Found" , "Answer" , "School",  "Grow", "Study", "Still" , "Learn", "Plant" , "Cover" , "Food" , "Sun", "Four", "Between"};

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

                try (FileWriter writer = new FileWriter("BubbleSortResults")) {
                    for(String s: str){
                        writer.write(s);
                        writer.write("\r\n");
        
                                   
        }
                }
            }
        }
    }