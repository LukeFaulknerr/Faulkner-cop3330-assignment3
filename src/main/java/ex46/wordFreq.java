/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Luke Faulkner
 */
package ex46;

public class wordFreq {
    private String name;
    private int freq;
    public wordFreq (String name, int freq){
        this.name = name;
        this.freq = freq;
    }

    public String getName() {
        return name;
    }

    public int getFreq() {
        return freq;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFreq(int freq) {
        this.freq = freq;
    }
}
