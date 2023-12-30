package com.xworkz.maxmin;

public class RemoveSpace {

    public static void main(String[] args) {
        String input = "Hello World! This is an example.";

        String result = removeWhiteSpacesAndExclamation(input);

        System.out.println("Original String: " + input);
        System.out.println("Modified String: " + result);
    }

    public static String removeWhiteSpacesAndExclamation(String input) {
        // Use regular expression to replace all white spaces and exclamation marks with an empty string
        return input.replaceAll("[\\s!]", "");
    }
}
