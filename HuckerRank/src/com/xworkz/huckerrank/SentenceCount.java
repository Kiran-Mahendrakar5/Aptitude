package com.xworkz.huckerrank;

import java.util.LinkedHashMap;
import java.util.Map;

public class SentenceCount {

    public static void occurrence(String input) {
        // Split the input string into words
        String[] words = input.split(" ");

        // Using LinkedHashMap to maintain the insertion order of words
        Map<String, Integer> wordCountMap = new LinkedHashMap<>();

        // Count occurrences of each word
        for (String word : words) {
            if (wordCountMap.containsKey(word)) {
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                wordCountMap.put(word, 1);
            }
        }

        // Print the occurrences
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        String input = "hai good morning morning good good";
        occurrence(input);
    }
}
