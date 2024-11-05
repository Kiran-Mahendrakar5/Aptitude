package com.xworkz.huckerrank;

public class PrimaNumber {

    public static void main(String[] args) {
        int num = 29; // Hardcoded value for demonstration. Change as needed.
        
        if (isPrime(num)) {
            System.out.println("Correct");
        } else {
            System.out.println("Wrong");
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false; // 0 and 1 are not prime numbers
        if (num == 2) return true;  // 2 is the only even prime number
        if (num % 2 == 0) return false; // Exclude even numbers

        // Check for factors from 3 to num/2 (exclusive) with step of 2
        for (int i = 3; i <= num / 2; i += 2) {
            if (num % i == 0) {
                return false; 
            }
        }
        return true;  
    }
}
