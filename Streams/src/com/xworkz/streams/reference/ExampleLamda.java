package com.xworkz.streams.reference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ExampleLamda {
    public static void main(String[] args) {
    	 List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // Using lambda expression
        Collections.sort(names, (s1, s2) -> s1.compareTo(s2));

        System.out.println(names); // Output: [Alice, Bob, Charlie]
    }
}
