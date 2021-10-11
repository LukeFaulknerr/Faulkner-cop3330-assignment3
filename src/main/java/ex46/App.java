/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Luke Faulkner
 */

package ex46;

import java.io.*;
import java.util.ArrayList;

public class App {
        public static void main(String[] args) throws IOException {
                // Select input file
                File inputFile = new File("src/main/java/ex46/exercise46_input.txt");

                // Get arraylist from file
                ArrayList<wordFreq> freq;
                freq = createArrayList.extractData(inputFile);

                // Organize and print
                organizeArrayList.organize(freq);
        }
}
