package com.xworkz.streams.reference;

import java.util.ArrayList;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        
        Example refExample = new Example();
        names.forEach(refExample::printElement);
    }

    public void printElement(String element) {
        System.out.println(element);
    }
}

