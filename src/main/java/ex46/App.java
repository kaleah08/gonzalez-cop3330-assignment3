package ex46;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 kaleah gonzalez
 */
public class App {
    public static void main(String[] args) throws Exception {
        //create fileName
        String fileName = "exercise46_input.txt";
        // call functions
        countWords(readFile(fileName));


    }
    public static String[] readFile(String fileName) throws IOException {

        //read files
        FileReader reader = new FileReader(fileName);
        BufferedReader br = new BufferedReader(reader);

        //get the words from the file by taking the space into account
        String line = br.readLine();
        String[] words = line.split(" ");

        return words;
    }

    public static HashMap<String, Integer> countWords(String[] words){
        //create hashmap
        HashMap<String, Integer> wordCount = new HashMap();

        //initialize variable
        int freq = 0;

        // for loop size of how many words to count frequency of each
        for(int i = 0; i < words.length; i++){

            if (wordCount.containsKey(words[i])) {
                int n = wordCount.get(words[i]);
                wordCount.put(words[i], ++n);
            }
            else {
                wordCount.put(words[i], 1);
            }
        }

        //for loop for hashmap to print words and frequency
        for (Map.Entry<String, Integer>entry : wordCount.entrySet()) {

            System.out.print(entry.getKey()+": ");
            //for size of each frequency
            for(int j = 0; j < entry.getValue(); j++){
                //print "*" everytime a word appears
                System.out.print("*");
            }
            System.out.println();

        }
        return wordCount;
    }
}
