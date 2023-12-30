package com.xworkz.maxmin;

import java.util.Scanner;

public class GetUserNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int userNumber = scanner.nextInt();

        System.out.println("You entered: " + userNumber);

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}

