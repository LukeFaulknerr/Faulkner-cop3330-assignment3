/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Luke Faulkner
 */

package ex42;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws FileNotFoundException {
        // File Reading Objects
        File nameInput = new File("src/main/java/ex42/exercise42_input.txt");
        Scanner nameScanner = new Scanner(nameInput);

        // ArrayLists for holding data
        ArrayList<String> fullList = new ArrayList<String>();

        // Create fullList using ex41 createNameArray Function
        fullList = ex41.createNameArray.createArrayList(nameInput, nameScanner);

        // Call wrapper function to separate data into three lists
        divideArrayList.divideArrayList(fullList);
    }
}
