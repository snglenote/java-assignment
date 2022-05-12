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

        
    }
}

