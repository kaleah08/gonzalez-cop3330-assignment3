package ex44;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 kaleah gonzalez
 */

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;
import static java.lang.System.in;
import com.google.gson.Gson;



public class App {
    private static class Products {

        private String name;
        private float price;
        private int quantity;

        public Products(String name, Float price, Integer quantity){
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }
        public String toString() {
            String string =  name + price + quantity;

            return string;
        }
    }



    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(in);
        Gson gson = new Gson();
        //could not for the life of me figure out how to use gson
        //very difficult to understand
        //tried my best

        try(Reader reader = new FileReader("exercise44_input.json")){
            Products products = gson.fromJson(reader, Products.class);
            System.out.println(products);
        }







        }



    }




