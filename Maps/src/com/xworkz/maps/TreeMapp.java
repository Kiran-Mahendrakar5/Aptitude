package com.xworkz.maps;

import java.util.*;

public class TreeMapp {
    public static void main(String[] args) {
        // Creating a TreeMap
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // Adding key-value pairs
        treeMap.put("key1", 1);
        treeMap.put("key2", 2);
        treeMap.put("key3", 3);

        // Iterating over the entries
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Additional methods
        // containsKey
        System.out.println("Contains key 'key2': " + treeMap.containsKey("key2"));

        // containsValue
        System.out.println("Contains value 3: " + treeMap.containsValue(3));

        // size
        System.out.println("Size of the map: " + treeMap.size());

        // isEmpty
        System.out.println("Is the map empty? " + treeMap.isEmpty());

        // keySet
        Set<String> keySet = treeMap.keySet();
        System.out.println("Key set: " + keySet);

        // values
        Collection<Integer> values = treeMap.values();
        System.out.println("Values: " + values);

        // remove
        treeMap.remove("key1");
        System.out.println("After removing 'key1': " + treeMap);

        // clear
        treeMap.clear();
        System.out.println("After clearing the map: " + treeMap);
    }
}

