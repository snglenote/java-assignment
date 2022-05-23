import java.io.FileWriter;
import java.io.IOException;


public class BubbleSort {

    public static void main(String []args) throws IOException {
        
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

                try (FileWriter writer = new FileWriter("BubbleSortResults")) {
                    for(String s: str){
                        writer.write(s);
                        writer.write("\r\n");
        
                                   
        }
                }
            }
        }
    }