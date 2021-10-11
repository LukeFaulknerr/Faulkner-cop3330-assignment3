/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Luke Faulkner
 */

package ex42;

import java.util.ArrayList;

public class divideArrayList {
    public static void divideArrayList(ArrayList<String> fullList){
        // Create ArrayLists for separate strings
        ArrayList<String> fNameList = new ArrayList<String>();
        ArrayList<String> lNameList = new ArrayList<String>();
        ArrayList<String> salaryList = new ArrayList<String>();

        // Create holder string array with each split string
        String[] split = new String[3];

        // Split each string
        for (int i = 0; i < fullList.size(); i++){
            split = fullList.get(i).split(",");
            lNameList.add(split[0]);
            fNameList.add(split[1]);
            salaryList.add(split[2]);
        }

        printNewArrays.printNewArrays(fNameList, lNameList, salaryList);

    }
    // Following functions are for testing purposes
    public static ArrayList<String> returnFNameList(ArrayList<String> fullList){
        ArrayList<String> fNameList = new ArrayList<String>();
        String[] split = new String[3];
        for (int i = 0; i < fullList.size(); i++){
            split = fullList.get(i).split(",");
            fNameList.add(split[1]);
        }
        return fNameList;
    }

    public static ArrayList<String> returnLNameList(ArrayList<String> fullList){
        ArrayList<String> lNameList = new ArrayList<String>();
        String[] split = new String[3];
        for (int i = 0; i < fullList.size(); i++){
            split = fullList.get(i).split(",");
            lNameList.add(split[0]);
        }
        return lNameList;
    }
    public static ArrayList<String> returnSalaryList(ArrayList<String> fullList){
        ArrayList<String> salaryList = new ArrayList<String>();
        String[] split = new String[3];
        for (int i = 0; i < fullList.size(); i++){
            split = fullList.get(i).split(",");
            salaryList.add(split[2]);
        }
        return salaryList;
    }
}
