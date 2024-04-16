package com.xworkz.collectionss.lamda;

import java.util.ArrayList;
import java.util.List;

public class CollectionLamda {
	
	
	public static void main(String[] args) {
        // Example 1: Using lambda with forEach to iterate over a list
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        
        fruits.forEach((ref)->{System.out.println(ref);});
        
        Runnable runnable = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread running...");
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
        
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);

        // Sorting the list using lambda expression
        numbers.sort((a, b) -> a.compareTo(b));

        // Printing the sorted list
        System.out.println(numbers);
	}

}
