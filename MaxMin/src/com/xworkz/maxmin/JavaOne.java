package com.xworkz.maxmin;

public class JavaOne {
    
    public static void main(String[] args) {
        JavaOne fibonacciCalculator = new JavaOne(); // Instantiate JavaOne, not RemoveElementsArray
        
        // Example: Calculate Fibonacci value for n = 5
        int result = fibonacciCalculator.fibonacci(5);
        
        System.out.println("Fibonacci value for n=5: " + result);
    }
    
    public int fibonacci(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
