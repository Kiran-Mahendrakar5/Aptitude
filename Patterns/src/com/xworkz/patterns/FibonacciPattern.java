package com.xworkz.patterns;
 

public class FibonacciPattern {

    public static void main(String[] args) {
        int n = 10;  // Adjust the value of 'n' for the desired number of terms in the pattern
        int a = 0, b = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a + " ");
                int nextTerm = a + b;
                a = b;
                b = nextTerm;
            }
            System.out.println();
        }
    }
}

