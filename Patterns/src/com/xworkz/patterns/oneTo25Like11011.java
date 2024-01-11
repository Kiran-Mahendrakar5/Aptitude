package com.xworkz.patterns;

public class oneTo25Like11011 {

    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i <= n; i++) {
            int a = i;
            int b = n - i + 1;

            for (int j = 1; j <= n; j++) {
                int value = (j % 2 == 1) ? a : b;
                System.out.printf("%2d", value);
                value += n;  // Increment the value for the next iteration
            }

            System.out.println();
        }
    }
}
