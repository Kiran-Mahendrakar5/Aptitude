package com.xworkz.codeninja;

public class FibonacciSeries {
    public static void generateFibonacci(int n) {
        int a = 0, b = 1;

        System.out.print("Fibonacci Series up to " + n + ": ");
        while (a <= n) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
    }

    public static void main(String[] args) {
        int limit = 60;
        generateFibonacci(limit);
    }
}

