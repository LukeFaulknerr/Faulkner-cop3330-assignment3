/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Luke Faulkner
 */

package ex41;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;

public class createOutFileAndPrint {
    // Prints an array of names to an output file given the array of names
    public static void printArrayList(ArrayList<String> sortedNameList){
        // Try-Catch block to reassure outFile can be made
        try {
            // Create output file to print to
            BufferedWriter outFile = new BufferedWriter(new FileWriter("src/main/java/ex41/exercise41_output.txt"));

            // Print number of names and a dividing line
            outFile.write("Total of " + sortedNameList.size() + " names\n----------------------\n");

            // Print organized names
            for (int i = 0; i < sortedNameList.size(); i++){
                outFile.write(sortedNameList.get(i) + "\n");
            }

            outFile.close();

        } catch (Exception ex){
            return;
        }
        return;
    }
}
