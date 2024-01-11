package com.xworkz.codeninja;

import java.util.HashSet;

public class RemoveDuplicatesFromString {
    public String removeDuplicates(String str) {
        char[] charArray = str.toCharArray();
        HashSet<Character> hs = new HashSet<>();
        int zero = 0;

        for (char c : charArray) {
            if (hs.add(c)) {
                charArray[zero++] = c;
            }
        }

        return new String(charArray, 0, zero);
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromString remover = new RemoveDuplicatesFromString();

        // Example usage
        String inputString = "hello world";
        String result = remover.removeDuplicates(inputString);

        System.out.println("String after removing duplicates: " + result);
    }
}

