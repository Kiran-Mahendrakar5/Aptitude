package com.xworkz.codes.list;

import java.util.LinkedList;
import java.util.List;

public class Linkedlistts {
    
    public static void main(String[] args) {
        
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(3);
        list.add(3);
        
        list.forEach((ref) -> {
            System.out.println(ref);
        });
        
        int search = 6;
        if (list.contains(search)) {
            System.out.println(search);
        } else {
            System.out.println("no");
        }
        
        int remove = 3;
        list.remove((Integer) remove); // Removes the element from the list
        System.out.println(remove + " removed");
        
        // Now you can print the list after removing an element
        list.forEach((ref1) -> {
            System.out.println(ref1);
        });
    }
}

