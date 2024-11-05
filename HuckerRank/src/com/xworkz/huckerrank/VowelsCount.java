package com.xworkz.huckerrank;

import java.util.HashMap;
import java.util.Map;

public class VowelsCount {

    public static void occ(String str) {
        Map<Character, Integer> map = new HashMap<>();

        // Initialize the map with vowels
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        for (char vowel : vowels) {
            map.put(vowel, 0);
        }


        for (char ch : str.toCharArray()) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            }
        }

        // Print the count of each vowel
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        String sentence = "Kiran";
        occ(sentence);
    }
}
