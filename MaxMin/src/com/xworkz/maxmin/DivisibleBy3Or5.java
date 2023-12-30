package com.xworkz.maxmin;

import java.util.Scanner;

public class DivisibleBy3Or5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (N): ");
        int n = scanner.nextInt();

        System.out.println("Numbers from 1 to " + n + " divisible by 3 or 5:");
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.print(i + " ");
            }
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}

