/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Luke Faulkner
 */

package ex43;

public class website {
    final private String siteName;
    final private String author;
    final private Boolean JS;
    final private Boolean CSS;

    public website(String siteName, String author, Boolean JS, Boolean CSS){
        this.siteName = siteName;
        this.author = author;
        this.JS = JS;
        this.CSS = CSS;
    }
    // Simple Getter Functions
    public String getSiteName(){
        return siteName;
    }

    public String getAuthor(){
        return author;
    }

    public Boolean getJS(){
        return JS;
    }

    public Boolean getCSS(){
        return CSS;
    }

}
