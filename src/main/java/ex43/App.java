/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Luke Faulkner
 */

package ex43;

import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Inputs
        String siteName, authorName;
        Boolean JS, CSS;
        siteName = getSiteName();
        authorName = getAuthorName();
        JS = askJS();
        CSS = askCSS();
        website newSite = new website(siteName, authorName, JS, CSS);

        // Make Files
        try {
            createFiles.createWebFiles(newSite);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static String getSiteName(){
        String siteName;
        Scanner input = new Scanner(System.in);
        System.out.print("Site name: ");
        siteName = input.nextLine();
        return siteName;
    }

    private static String getAuthorName(){
        String author;
        Scanner input = new Scanner(System.in);
        System.out.print("Author: ");
        author = input.nextLine();
        return author;
    }

    private static Boolean askJS(){
        String choice;
        boolean returnVal;
        Scanner input = new Scanner(System.in);
        System.out.print("Do you want a folder for JavaScript? ");
        choice = input.nextLine();
        returnVal = choice.equals("Y") || choice.equals("y");
        return returnVal;
    }

    private static Boolean askCSS(){
        String choice;
        boolean returnVal;
        Scanner input = new Scanner(System.in);
        System.out.print("Do you want a folder for CSS? ");
        choice = input.nextLine();
        returnVal = choice.equals("Y") || choice.equals("y");
        return returnVal;
    }
}