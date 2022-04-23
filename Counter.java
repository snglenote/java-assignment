import java.io.BufferedReader;  
import java.io.FileReader;  
   
public class Counter   
{  
    public static void main(String[] args) throws Exception {  
        String line;  
        int count = 0;  
          
        //Opens a file in read mode  
        FileReader file = new FileReader("100.txt");  
        BufferedReader br = new BufferedReader(file);  
              
        //Gets each line till end of file is reached  
        while((line = br.readLine()) != null) {  
            //Splits each line into words  
            String words[] = line.split(" ");  
            //Counts each word  
            count = count + words.length;  
        }  
          
        System.out.println("The number of words in the file is: " + count);  
        br.close();  
    }  
} 
    
        
