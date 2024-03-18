package com.xworkz.codes.list;



import java.util.HashSet;
import java.util.Set;

public class Setss {
    
    public static void main(String[] args) {
        
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(4);
        set.add(3);
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
