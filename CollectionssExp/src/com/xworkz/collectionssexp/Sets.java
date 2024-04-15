package com.xworkz.collectionssexp;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Sets {
    public static void main(String[] args) {
        // Creating a HashSet
        Set<String> set = new HashSet<>();

        // Adding elements to the set
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Date");
        set.add("Apple");
        set.add(null);
        // Adding a duplicate element

        // Printing the set
        System.out.println("Set: " + set);

      
        // Checking if the set contains a specific element
        System.out.println("Contains 'Banana': " + set.contains("Banana"));

        // Getting the size of the set
        System.out.println("Size of set: " + set.size());

        // Removing an element from the set
        set.remove("Cherry");
        System.out.println("Set after removing 'Cherry': " + set);

        // Clearing the set
        set.clear();
        System.out.println("Set after clearing: " + set);

        // Checking if the set is empty
        System.out.println("Is set empty? " + set.isEmpty());
    }
}

