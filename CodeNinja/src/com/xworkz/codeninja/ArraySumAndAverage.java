package com.xworkz.codeninja;

public class ArraySumAndAverage {
    public static void main(String[] args) {
        // Array with predefined elements
        int[] numbers = {10, 20, 30, 40, 50};

        // Calculate the sum and average of the array
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        double average = (double) sum / numbers.length;

        // Display the results
        System.out.println("Sum of the array: " + sum);
        System.out.println("Average of the array: " + average);
    }
}
