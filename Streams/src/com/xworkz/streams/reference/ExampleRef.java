package com.xworkz.streams.reference;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ExampleRef {
    public static void main(String[] args) {
    	 List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // Using method reference
        Collections.sort(names, String::compareTo);

        System.out.println(names); // Output: [Alice, Bob, Charlie]
    }
}

