package se.simple;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class ArrayWrite {

    public static void main(String[] args) {

        //1. Create an array
        List<String> words = new ArrayList<String>();

        //2. Read a file line by line and add file words to words array.
        try (BufferedReader br = new BufferedReader(new FileReader("100.txt"))) {
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {
                words.add(sCurrentLine);
                //System.out.println(words);
            }

            System.out.println(words);

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(words.size());

        //3. Randomizing to pick up a word from arraylist
        Random rand = new Random();
        int randomNumber = rand.nextInt(words.size() - 1) + 1;

        System.out.println(randomNumber);

        //4. Prints the randomly selected word. 
        String word = words.get(randomNumber);
        System.out.println(word);

        
    }
}

