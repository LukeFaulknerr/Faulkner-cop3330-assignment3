/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Luke Faulkner
 */

package ex41;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class createNameArray {
    // Reads in data from a .txt file and returns an ArrayList<String> with
    // one name per index.
    public static ArrayList<String> createArrayList(File inputFile, Scanner nameReader){
        // Variables for holding File data
        String currentName;
        ArrayList<String> newNameList = new ArrayList<String>();

        // Scan until there is nothing else to scan
        while (nameReader.hasNextLine()){
            currentName = nameReader.nextLine();
            newNameList.add(currentName);
        }

        // Return final array
        return newNameList;
    }
}
