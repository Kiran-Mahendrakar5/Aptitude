package com.xworkz.huckerrank.rajajinagar;

import java.util.Scanner;

public class Binary {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int num = scanner.nextInt();

        System.out.print("Binary representation: ");
        decimalToBinary(num);
        
        scanner.close();
    }

    // Method to convert decimal to binary without using inbuilt methods
    public static void decimalToBinary(int num) {
        if (num == 0) {
            System.out.print(0);
            return;
        }

        // Array to store binary digits
        int[] binary = new int[32];
        int index = 0;

        while (num > 0) {
            binary[index++] = num % 2;
            num = num / 2;
        }

        // Print binary array in reverse order
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(binary[i]);
        }
    }
}

