package com.xworkz.codeninja;

import java.util.Scanner;

public class TriangleAreaCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the base of the triangle
        System.out.print("Enter the base of the triangle: ");
        double base = scanner.nextDouble();

        // Prompt the user to enter the height of the triangle
        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();

        // Close the Scanner to avoid resource leak
        scanner.close();

        // Calculate the area of the triangle using the formula: area = 0.5 * base * height
        double area = 0.5 * base * height;

        // Display the result
        System.out.println("Area of the triangle: " + area);
    }
}

