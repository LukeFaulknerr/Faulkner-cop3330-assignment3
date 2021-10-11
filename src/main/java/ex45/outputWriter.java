/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Luke Faulkner
 */

package ex45;


import java.io.BufferedWriter;
import java.io.IOException;

public class outputWriter {
    public static void output(BufferedWriter bw, String s) throws IOException {
        bw.write(s + " ");
    }
}
