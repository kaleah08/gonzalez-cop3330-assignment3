package ex41;


/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 kaleah gonzalez
 */


import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception{

        // Read File 'exercise41_input.txt'
        String inputFile = "exercise41_input.txt";
        // create ArrayList for the naems
        ArrayList<String> list = new ArrayList<>();
        try (Scanner input = new Scanner(new FileReader(inputFile)) ){
            while (input.hasNext()){
                list.add(input.nextLine());
            }
        }

        // Sort in alphabetical order
        Collections.sort(list);

        // call print function
        print(list);


    }


    public static void print(ArrayList list) throws IOException {
        //initialize output writer
        BufferedWriter output = null;

        //Print names with desired output format
        try {
            File file = new File("exercise41_output.txt");
            output = new BufferedWriter(new FileWriter(file));
            output.write("Total of " + list.size() + " names\n");
            output.write("-----------------\n");
            for(Object element : list){
                output.write("\n" + element);
            }
        } finally {
            if ( output != null ) {
                output.close();
            }
        }

    }



}
