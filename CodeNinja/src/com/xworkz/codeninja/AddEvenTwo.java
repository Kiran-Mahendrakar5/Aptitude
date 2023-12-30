package com.xworkz.codeninja;

import java.util.Scanner;

public class AddEvenTwo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int evenSum = sumOfEvenDigits(number);
        int oddSum = sumOfOddDigits(number);

        System.out.println("Sum of even digits: " + evenSum);
        System.out.println("Sum of odd digits: " + oddSum);

        scanner.close();
    }

    public static int sumOfEvenDigits(int number) {
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) { //==
                sum += digit;
            }
            number /= 10;
        }
        return sum;
    }

    public static int sumOfOddDigits(int number) {
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 != 0) {  //!=
                sum += digit;
            }
            number /= 10;
        }
        return sum;
    }
}

