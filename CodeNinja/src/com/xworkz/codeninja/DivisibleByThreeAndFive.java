package com.xworkz.codeninja;

import java.util.Scanner;

public class DivisibleByThreeAndFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();

        System.out.println("Numbers divisible by 3 and 5 from 1 to " + N + ":");
        for (int i = 1; i <= N; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " - Divisible by 3 and 5");
            } else if (i % 3 == 0) {
                System.out.println(i + " - Divisible by 3");
            } else if (i % 5 == 0) {
                System.out.println(i + " - Divisible by 5");
            }
        }

        scanner.close();
    }
}
