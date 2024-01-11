package com.xworkz.patterns;

public class KPattern {

    public static void main(String[] args) {
        int n = 5; // Adjust the value of 'n' for the desired size of the pattern

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == 1 || j == n || (i == n / 2 + 1 && j <= n / 2 + 1) || (i <= n / 2 && j == n / 2 + 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

