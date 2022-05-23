import java.io.BufferedReader;  
import java.io.FileReader;  
   
public class Counter {  

    static long startTime = System.nanoTime();

    public static void main(String[] args) throws Exception {  
        String line;  
        int count = 0;  
          
        
        FileReader file = new FileReader("100.txt");  
        BufferedReader br = new BufferedReader(file);  
              
  
        while((line = br.readLine()) != null) {  

            String words[] = line.split(" ");  

            count = count + words.length;  
        }  
          
        System.out.println("The number of words in the file is: " + count);  
        br.close();  

        long endTime = System.nanoTime();

        long duration = (endTime - startTime);
        
        System.out.println("The time it took to count words was: " + duration/1000000 + "ms");
    }
 
} 
    
        
