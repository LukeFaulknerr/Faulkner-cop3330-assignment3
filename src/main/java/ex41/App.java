/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Luke Faulkner
 */

package ex41;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws FileNotFoundException {
        // File Reading Objects
        File nameInput = new File("src/main/java/ex41/exercise41_input.txt");
        Scanner nameScanner = new Scanner(nameInput);

        // Variables / Arrays
        ArrayList<String> nameList;
        nameList = createNameArray.createArrayList(nameInput, nameScanner);

        // Sort Current ArrayList
        Collections.sort(nameList);

        // Print to a new file
        createOutFileAndPrint.printArrayList(nameList);
    }
}
