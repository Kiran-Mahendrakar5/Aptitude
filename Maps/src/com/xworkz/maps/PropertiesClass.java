package com.xworkz.maps;

import java.util.Properties;

public class PropertiesClass {
    public static void main(String[] args) {
        // Creating a Properties object
        Properties properties = new Properties();

        // Adding key-value pairs
        properties.setProperty("name", "John");
        properties.setProperty("age", "30");
        properties.setProperty("city", "New York");

        // Accessing properties
        String name = properties.getProperty("name");
        String age = properties.getProperty("age");
        String city = properties.getProperty("city");

        // Displaying properties
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);

        // Getting a non-existent property
        String gender = properties.getProperty("gender", "Male");
        System.out.println("Gender: " + gender);
    }
}
