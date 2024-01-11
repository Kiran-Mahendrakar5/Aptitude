package com.xworkz.codeninja;

public class Example {

    public static void main(String[] args) {
        Example fibonacci = new Example();

        int result = fibonacci.fibonacci(5);
        System.out.println(result);
    }

    // Corrected method name to fibonacci
    public int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
