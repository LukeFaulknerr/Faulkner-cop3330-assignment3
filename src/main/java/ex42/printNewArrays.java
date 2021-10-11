/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Luke Faulkner
 */

package ex42;

import java.util.ArrayList;

public class printNewArrays {
    public static void printNewArrays(ArrayList<String> fNameList, ArrayList<String> lNameList, ArrayList<String> salaryList){

        // Print Table Header
        System.out.println("Last\t\t\tFirst\t\t\tSalary");
        System.out.println("--------------------------------------");

        // Print each table member
        for (int i = 0; i < fNameList.size(); i++){
            //System.out.println(lNameList.get(i) + "\t\t\t" + fNameList.get(i) + "\t\t\t" + salaryList.get(i));
            System.out.print(lNameList.get(i));
            for (int j = 0; j < tabAmount(lNameList.get(i)); j++){
                System.out.print("\t");
            }
            System.out.print(fNameList.get(i));
            for (int j = 0; j < tabAmount(fNameList.get(i)); j++){
                System.out.print("\t");
            }
            System.out.println(salaryList.get(i));
        }
    }

    // Finds number of tabs needed to be printed to straighten out the column
    public static int tabAmount(String ex){
        int amount = 4 - ex.length()/4;
        return amount;
    }
}
