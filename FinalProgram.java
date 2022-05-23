import java.io.BufferedReader;  
import java.io.FileReader;  
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.io.FileWriter;
   
public class FinalProgram { 

    static long startTime = System.nanoTime();
    public static void counter(String[] args) throws Exception {  
        String line;  
        int count = 0;  
          
        
        FileReader file = new FileReader("100.txt");  
        BufferedReader br = new BufferedReader(file);  
              
  
        while((line = br.readLine()) != null) {  

            String words[] = line.split(" ");  

            count = count + words.length;  
        }  
          
        System.out.println("The number of words in the file is: " + count );  
        br.close();  

        long endTime = System.nanoTime();

        long duration = (endTime - startTime);
        
        System.out.println("The time it took to count words was: " + duration/1000000 + "ms");
    }  


    public static void arrayLists() throws IOException {
        List<String> wordsList = Files.readAllLines(Paths.get("100.txt"));
        Collections.shuffle(wordsList);
        List<String> random20WordsList = wordsList.subList(0, 19);
        System.out.printf("\r\nrandom20WordsList = %s%n", random20WordsList);
        String[] random20WordsArray = random20WordsList.toArray(new String[20]);
        System.out.printf("random20WordsArray = %s%n", Arrays.toString(random20WordsArray));
    }



        public static void bubbleSort(String []args) throws IOException {
            String str[] = {};

            String temp;
               System.out.println("\r\nStrings in sorted order:");
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


    public static void search(String[] args){

        boolean flag = false;

        Scanner input = new Scanner(System.in);

        System.out.print("\r\nEnter the word you would like to search: ");

        String word = input.nextLine();

        input.close(); 

  

        String textInput = word;
            int index = 0;
        String[] yourArray = {"Father" , "Head" , "Stand" , "Own" , "Page" ,  "Should" , "Country", "Found" , "Answer" , "School",  "Grow", "Study", "Still" , "Learn", "Plant" , "Cover" , "Food" , "Sun", "Four", "Between"};

        for (int i = 0; i <= yourArray.length - 1; i++) {

        if (textInput.contains(yourArray[i])) {
        flag = true;
        index = i;

    }
}
            if (flag) 
            System.out.println("The word is found at index " + index);
        else 
            System.out.println("The word is not found in the array");
    
    }



        public static void main(String[] args) throws Exception{
            counter(args);
            arrayLists();
            bubbleSort(args);
            search(args);



        }
    }

    