/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Luke Faulkner
 */

package ex45;

import java.io.*;

public class App {
    public static void main(String[] args) throws IOException {
        // Create File reading tools
        File inputFile = new File("src/main/java/ex45/exercise45_input.txt");
        String[] line;
        BufferedReader inputScanner = new BufferedReader(new FileReader(inputFile));

        // Create File writing tools
        BufferedWriter outputBW = new BufferedWriter(new FileWriter("src/main/java/ex45/exercise45_output.txt"));

        // Parse through the text
        String search;
        while ((search = inputScanner.readLine()) != null){
            line = search.split(" ");       // Divide each line into an array of Strings to check through
            for (String s : line){
                switch (s) {
                    case "utilize":
                        //outputBW.append("use ");
                        outputWriter.output(outputBW, "use");
                        break;
                    case "\"utilize\"":
                        outputWriter.output(outputBW, "\"use\"");
                        break;
                    case "utilize.":
                        outputWriter.output(outputBW, "use.");
                        break;
                    default:
                        //outputBW.append(s + " ");
                        outputWriter.output(outputBW, s);
                        break;
                }
            }
            outputBW.append("\n");
        }

        // Close Writer
        outputBW.close();
    }
}
