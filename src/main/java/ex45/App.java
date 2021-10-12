package ex45;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 kaleah gonzalez
 */

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class App {

    public static String readFile(String fileName)throws Exception
    {
        String paragraph = "";
        paragraph = new String(Files.readAllBytes(Paths.get(fileName)));
        return paragraph;
    }

    public static void main(String[] args) throws Exception
    {
        String paragraph = readFile("exercise45_input.txt");
        String changeWord = paragraph.replaceAll("utilize", "use");
        BufferedWriter output = null;

        try {
            File file = new File("exercise45_output.txt");
            output = new BufferedWriter(new FileWriter(file));
            output.write(changeWord);
        } finally {
            if ( output != null ) {
                output.close();
            }
        }

    }
}
