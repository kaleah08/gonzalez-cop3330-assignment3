package ex43;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 kaleah gonzalez
 */

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.in;

public class App {
    public static void main (String[] args) throws IOException {
        //Scanner import
        Scanner input  = new Scanner(in);
        //get name variable from user input
        System.out.print("Site name: ");
        String name = input.nextLine();

        //get author variable from user input
        System.out.print("Author: ");
        String author = input.nextLine();

        //get javaScript if statement from user input
        System.out.print("Do you want a folder for Javascript? ");
        String javaScript = input.nextLine();

        //get CSS if statement from user input
        System.out.print("Do you want a folder for CCS? ");
        String CSS = input.nextLine();

        //calling function that creates the folders and files
        creatingFiles(name, javaScript, CSS);
    }

    public static void creatingFiles(String name, String javaScript, String CSS) throws IOException {
        // create string file name
        String regularFile = "./website/" + name;
        // create new File
        File file = new File(regularFile);
        //creating new directory for file
        file.mkdirs();

        if (file.createNewFile()) {
            System.out.println("Created" + regularFile);
        } else {
            System.out.println("Created" + regularFile);
        }

        //create string file name
        String html = "./website/" + name + "/index.html";

        // create new file in the same directory
        File htmlFile = new File(html);

        if (htmlFile.createNewFile()) {
            System.out.println("Created" + html);
        } else {
            System.out.println("Created" + html);
        }

        // if statement for Javascript folder
        if( javaScript.equals("y") ){
            //create String variable of folder name
            String js = "./website/" + name +"/js/";
            File jsFile = new File(js);
            //linking directories
            jsFile.mkdir();

            if (jsFile.createNewFile()) {
                System.out.println("Created " + js);

            }else {
                System.out.println("Created " + js);
            }
        }

        //if statement for CSS folder
        if(CSS.equals("y")){
            //create String variable name of folder name
            String css = "./website/" + name +"/css/";
            File cssFile = new File(css);
            //linking directories
            cssFile.mkdir();

            if (cssFile.createNewFile()) {
                System.out.println("Created " + css);
            } else {
                System.out.println("Created " + css);
            }
        }

    }

}
