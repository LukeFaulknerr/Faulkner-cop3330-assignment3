/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Luke Faulkner
 */

package ex44;

import org.json.simple.parser.ParseException;
import java.io.IOException;
import java.util.Scanner;

public class outputInfo {
    public static void outputSearchedItem(String name, String price, String quantity){
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }

    public static void failedSearch() throws IOException, ParseException {
        // Sorry statement
        System.out.println("Sorry, that product was not found in our inventory.");

        // Variables
        String searchProduct;
        Scanner input = new Scanner(System.in);

        // Get user input
        System.out.print("What is the name of the item? ");
        searchProduct = input.nextLine();
        App.findDesiredItem(searchProduct);
    }
}
