package ex42;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 kaleah gonzalez
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class App {
    private static class Data {
        private String firstName;
        private String lastName;
        private String salary;

        public Data(String firstName, String lastName, String salary) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.salary = salary;
        }

        public String firstName() {
            return firstName;
        }

        public String lastName() {
            return lastName;
        }

        public String salary() {
            return salary;
        }

        public String toString() {
            String string = String.format("%15s %15s %15s\n", lastName, firstName, salary);

            return string;
        }

    }

    public static void main(String[] args) throws Exception {
        // read File exercise42_input.txt
        //parse the CSV file
        List people = readFile();

        // print results formatted as a table
        print(people);
    }

    public static List readFile() throws FileNotFoundException, IOException {
        List data = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("exercise42_input.txt"));
        String line;

        while ((line = br.readLine()) != null) {
            String[] fields = line.split(",");
            String lastName = fields[0];
            String firstName = fields[1];
            String salary = fields[2];
            Data people = new Data(firstName, lastName, salary);
            data.add(people);
        }
        br.close();

        return data;
    }

    public static void print(List people) {
        System.out.format("%15s %15s %15s\n", "Last", "First", "Salary");
        System.out.print("-------------------------------------------------- \n");

        for (Object data : people) {
            System.out.print(data);
        }

    }
}




