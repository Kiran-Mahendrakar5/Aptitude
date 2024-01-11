package com.xworkz.codeninja;

import java.util.HashMap;
import java.util.Map;

public class Isomorphic {
    public boolean isIsomorphic(String s, String t) {
        if (s == null || t == null || s.length() != t.length()) {
            return false;
        }

//        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            char b = t.charAt(i);

            // Check if 'a' is already mapped
//            if (map.containsKey(a)) {
//                // If the mapping is incorrect, return false
//                if (map.get(a) != b) {
//                    return false;
//                }
//            } else {
//                // Check if 'b' is already used as a mapping
//                if (map.containsValue(b)) {
//                    return false;
//                }
//                // Add the mapping of 'a' to 'b'
//                map.put(a, b);
//            }
        }

        return true;
    }

    public static void main(String[] args) {
        Isomorphic isomorphic = new Isomorphic();

        // Example usage
        System.out.println(isomorphic.isIsomorphic("egg", "add"));  // true  /gg and /dd
        System.out.println(isomorphic.isIsomorphic("floao", "bwra"));  // false
        System.out.println(isomorphic.isIsomorphic("paper", "title"));  // true  /PP and ?tt
    }
}

