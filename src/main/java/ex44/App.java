/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Luke Faulkner
 */

package ex44;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException, ParseException {
        // Variables for product ID
        String searchProduct;
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("What is the name of the item? ");

        // Get user input
        searchProduct = input.nextLine();

        // Search for item
        findDesiredItem(searchProduct);
    }

    public static Boolean findDesiredItem(String desiredItem) throws IOException, ParseException {
        // Variables
        String productName = null, price = null, quantity = null;

        // Parsing tools
        Object obj = new JSONParser().parse(new FileReader("src/main/java/ex44/exercise44_input.json"));
        JSONObject productList = (JSONObject) obj;

        // Set iteration through list
        Iterator<Map.Entry> itr1;
        JSONArray ja = (JSONArray) productList.get("products");

        for (Object o : ja) {
            itr1 = ((Map) o).entrySet().iterator();
            while (itr1.hasNext()) {

                Map.Entry pair = itr1.next();
                String key = pair.getKey().toString();

                if (key.equals("quantity")) {
                    quantity = pair.getValue().toString();
                } else if (key.equals("price")) {
                    price = pair.getValue().toString();
                } else
                    productName = pair.getValue().toString();

                if (productName != null) {
                    if (productName.equals(desiredItem)) {
                        outputInfo.outputSearchedItem(productName, price, quantity);
                        return true;
                    }
                }
            }
        }
        // Reaching this statement means the desired item is not in the list. Try again.
        outputInfo.failedSearch();
        return false;
    }
}
