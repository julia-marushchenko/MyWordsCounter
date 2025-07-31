// Java program to count number of words in the text

package com.strings;

// Main class
public class Main {

    // Main method to run java program
    public static void main(String[] args) {

        // Text to count words
        String text = "Dairy products are foods made from milk, including items like cheese, yogurt, butter, " +
                "and milk itself.";

        // Number of words in the text
        int number = text.split("\\s").length;

        // Printing number to console
        System.out.println("Number of words in the text are " + number);
    }
}