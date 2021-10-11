/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Luke Faulkner
 */

package ex46;

import java.util.*;

public class organizeArrayList {
    public static void organize(ArrayList<wordFreq> w){
        for (int i = 0; i < w.size() - 1; i++){
            for (int j = i +1; j < w.size(); j++){
                if (w.get(i).getFreq() < w.get(j).getFreq()){
                    Collections.swap(w, i, j);
                }
            }
        }
        printArrayList(w);
    }

    public static void printArrayList(ArrayList<wordFreq> w){
        for (wordFreq x : w){
            System.out.print(x.getName() +":");
            for (int i = 0; i < tabAmount(x.getName()); i++){
                System.out.print("\t");
            }
            for (int i = 0; i < x.getFreq(); i++)
                System.out.print("*");
            System.out.print("\n");
        }
    }

    public static int tabAmount(String s){
        return 3 - s.length()/4;
    }
}
