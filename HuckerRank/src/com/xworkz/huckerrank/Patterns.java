package com.xworkz.huckerrank;



public class Patterns {
    public static void main(String[] args) {
        String message = "Good Morning";
        printDiamondPattern(message);
    }

    private static void printDiamondPattern(String message) {
        int length = message.length();
        int mid = length / 2;

        // Upper half
        for (int i = 0; i <= mid; i++) {
            for (int j = mid; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i * 2; k++) {
                System.out.print(message.charAt(Math.min(k, length - 1)));
            }
            System.out.println();
        }

        // Lower half
        for (int i = mid - 1; i >= 0; i--) {
            for (int j = mid; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i * 2; k++) {
                System.out.print(message.charAt(Math.min(k, length - 1)));
            }
            System.out.println();
        }
    }
}

