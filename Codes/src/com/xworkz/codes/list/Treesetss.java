package com.xworkz.codes.list;


import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Treesetss {
    
    public static void main(String[] args) {
        
        Set<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(2);
        set.add(4);
        set.add(3);
        
        set.forEach((ref) -> {
            System.out.println(ref);
        });
        
        int search = 6;
        if (set.contains(search)) {
            System.out.println(search);
        } else {
            System.out.println("no");
        }
        
        int remove = 3;
        set.remove(remove); // Removes the element from the set
        System.out.println(remove + " removed");
        
        // Now you can print the set after removing an element
        set.forEach((ref1) -> {
            System.out.println(ref1);
        });
    }
}

