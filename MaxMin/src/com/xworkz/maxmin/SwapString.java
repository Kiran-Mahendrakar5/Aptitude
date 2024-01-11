package com.xworkz.maxmin;

public class SwapString {
    public static void main(String[] args) {
        // Two strings to be swapped
        String str1 = "Hello";
        String str2 = "World";

        System.out.println("Before swapping:");
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // Swapping strings using a temporary variable
        String temp = str1;
        str1 = str2;
        str2 = temp;

        System.out.println("\nAfter swapping:");
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
    }
}
