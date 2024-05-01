package com.xworkz.streams.reference;

import java.util.Arrays;
import java.util.List;

public class ExampleOne {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // Method reference to System.out.println
        names.forEach(System.out::println);
    }
}

