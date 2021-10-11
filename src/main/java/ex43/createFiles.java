/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Luke Faulkner
 */

package ex43;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class createFiles {
    public static void createWebFiles(website x) throws IOException {
        // Create website directory
        String filename = "src/main/java/ex43/" + x.getSiteName();
        File rootFile = new File(filename);
        if (rootFile.mkdirs())
            System.out.println("Created .website/" + x.getSiteName());

        // Create HTML File
        filename = filename + "/index.html";
        File newHTML = new File (filename);
        if (newHTML.createNewFile())
            System.out.println("Created .website/" + x.getSiteName() + "/index.html");

        // Fill in new HTML File
        String HTMLContents = ("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "  <head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <meta name =\"author\" content=" + x.getAuthor() + ">\n" +
                "    <meta name = \"source\" content= \"https://www.freecodecamp.org/news/basic-html5-template-boilerplate-code-example/\">\n" +
                "    <title>" + x.getSiteName() + "</title>\n" +
                "    <link rel=\"stylesheet\" href=\"style.css\">\n" +
                "  </head>\n" +
                "  <body>\n" +
                "\t<script src=\"index.js\"></script>\n" +
                "  </body>\n" +
                "</html>");


        // Print HTML data to a new file
        FileWriter fw = new FileWriter(filename, true);
        fw.write(HTMLContents);
        fw.close();

        // Create JavaScript Folder
        if (x.getJS()){
            filename = "src/main/java/ex43/" + x.getSiteName() + "/JavaScript";
            File jsFile = new File(filename);
            if (jsFile.mkdirs())
                System.out.println("Created .website/" + x.getSiteName() + "/js/");
        }

        // Create CSS Folder
        if (x.getCSS()){
            filename = "src/main/java/ex43/" + x.getSiteName() + "/CSS";
            File cssFile = new File(filename);
            if (cssFile.mkdirs())
                System.out.println("Created .website/" + x.getSiteName() + "/css/");
        }
    }
}
