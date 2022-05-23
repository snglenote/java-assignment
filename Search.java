import java.util.Scanner;

public class Search {
    public static void search(String[] args){

        boolean flag = false;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the word you would like to search: ");

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
}
