/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Luke Faulkner
 */

package ex46;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class createArrayList {
    public static ArrayList<wordFreq> extractData(File f) throws IOException {
        // Parsing Tools
        ArrayList<wordFreq> freq = new ArrayList<>();
        BufferedReader inputScanner = new BufferedReader(new FileReader(f));
        String[] line;

        // Begin parsing
        String current;
        boolean flag;
        while ((current = inputScanner.readLine()) != null) {
            line = current.split(" ");
            for (String s : line){
                if (freq.isEmpty()){
                    wordFreq w = new wordFreq(s, 1);
                    freq.add(w);
                }
                else {
                    flag = false;
                    for (wordFreq wf : freq){
                        if (s.equals(wf.getName())){
                            flag = true;
                            wf.setFreq(wf.getFreq() + 1);
                        }
                    }
                    if (!flag){
                        wordFreq w = new wordFreq(s, 1);
                        freq.add(w);
                    }
                }
            }
        }

        return freq;
    }
}
