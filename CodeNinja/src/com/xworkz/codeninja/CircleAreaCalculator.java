package com.xworkz.codeninja;

import java.util.Scanner;

public class CircleAreaCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the radius of the circle
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Close the Scanner to avoid resource leak
        scanner.close();

        // Calculate the area of the circle using the formula: area = π * r^2
        double area = Math.PI * Math.pow(radius, 2);

        // Display the result
        System.out.println("Area of the circle: " + area);
    }
}

