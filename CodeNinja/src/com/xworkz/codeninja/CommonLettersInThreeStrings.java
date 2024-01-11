package com.xworkz.codeninja;

import java.util.HashSet;
import java.util.Set;

public class CommonLettersInThreeStrings {
    public static void main(String[] args) {
        String str1 = "kiran";
        String str2 = "kishan";
        String str3 = "krishna";

        Set<Character> commonLetters = findCommonLetters(str1, str2, str3);

        System.out.println("Common letters in the three strings: " + commonLetters);
    }

    public static Set<Character> findCommonLetters(String str1, String str2, String str3) {
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();
        Set<Character> set3 = new HashSet<>();

        // Add characters from each string to respective sets
        for (char c : str1.toCharArray()) {
            set1.add(c);
        }
        for (char c : str2.toCharArray()) {
            set2.add(c);
        }
        for (char c : str3.toCharArray()) {
            set3.add(c);
        }

        // Find common letters by taking the intersection of sets
        set1.retainAll(set2);
        set1.retainAll(set3);

        return set1;
    }
}
