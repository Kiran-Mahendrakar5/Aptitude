package com.xworkz.maxmin;

public class Infinity {
    
    public static void main(String[] args) {
        // Correcting the variable declaration
        int n = 10;
        
        // Attempting to divide by zero will throw ArithmeticException
        // Fix: Avoid division by zero
        // If you want to handle exceptions, surround this block with try-catch
        int result = n / 0;
        
        System.out.println(result);
    }
}
