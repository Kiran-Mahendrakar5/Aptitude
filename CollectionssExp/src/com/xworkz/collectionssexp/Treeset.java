package com.xworkz.collectionssexp;

import java.util.TreeSet;

public class Treeset {
    public static void main(String[] args) {
        // Creating a TreeSet
        TreeSet<String> treeSet = new TreeSet<>();

        // Adding elements to the TreeSet
        treeSet.add("Banana");
        treeSet.add("Apple");
        treeSet.add("Cherry");
        treeSet.add("Date");
        treeSet.add("Banana"); // Ignored, as it's a duplicate

        // Printing the TreeSet
        System.out.println("TreeSet: " + treeSet);

        // Accessing elements in sorted order
        System.out.println("Accessing elements in sorted order:");
        for (String element : treeSet) {
            System.out.println(element);
        }

        // Checking if the TreeSet contains a specific element
        System.out.println("Contains 'Apple': " + treeSet.contains("Apple"));

        // Getting the first and last elements
        System.out.println("First element: " + treeSet.first());
        System.out.println("Last element: " + treeSet.last());

        // Removing an element from the TreeSet
        treeSet.remove("Cherry");
        System.out.println("TreeSet after removing 'Cherry': " + treeSet);

        // Clearing the TreeSet
        treeSet.clear();
        System.out.println("TreeSet after clearing: " + treeSet);

        // Checking if the TreeSet is empty
        System.out.println("Is TreeSet empty? " + treeSet.isEmpty());
    }
}

