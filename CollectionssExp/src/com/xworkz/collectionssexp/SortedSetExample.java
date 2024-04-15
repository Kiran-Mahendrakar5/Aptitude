package com.xworkz.collectionssexp;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {
    public static void main(String[] args) {
        // Creating a TreeSet (SortedSet)
        SortedSet<String> sortedSet = new TreeSet<>();

        // Adding elements to the sorted set
        sortedSet.add("Banana");
        sortedSet.add("Apple");
        sortedSet.add("Cherry");
        sortedSet.add("Date");
        sortedSet.add("Banana"); // Ignored, as it's a duplicate

        // Printing the sorted set
        System.out.println("SortedSet: " + sortedSet);

        // Accessing elements in sorted order
        System.out.println("Accessing elements in sorted order:");
        for (String element : sortedSet) {
            System.out.println(element);
        }

        // Checking if the sorted set contains a specific element
        System.out.println("Contains 'Apple': " + sortedSet.contains("Apple"));

        // Getting the first and last elements
        System.out.println("First element: " + sortedSet.first());
        System.out.println("Last element: " + sortedSet.last());

        // Removing an element from the sorted set
        sortedSet.remove("Cherry");
        System.out.println("SortedSet after removing 'Cherry': " + sortedSet);

        // Clearing the sorted set
        sortedSet.clear();
        System.out.println("SortedSet after clearing: " + sortedSet);

        // Checking if the sorted set is empty
        System.out.println("Is SortedSet empty? " + sortedSet.isEmpty());
    }
}
