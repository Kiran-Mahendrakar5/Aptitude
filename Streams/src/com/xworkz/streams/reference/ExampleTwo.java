package com.xworkz.streams.reference;

import java.util.Arrays;
import java.util.List;

public class ExampleTwo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // Lambda expression to print each element
        names.forEach(name -> System.out.println(name));
        
        //using method ref
        names.forEach(System.out::println);
    }
}
