package com.xworkz.huckerrank.interview;

public class OnetoHunPrime {

    public static void main(String[] args) {
        System.out.println("Prime numbers from 1 to 100 are:");

        for (int num = 2; num <= 100; num++) {
            boolean isPrime = true; // Assume num is prime

            // Check for factors
            for (int i = 2; i <= num / 2; i++) { // Check up to num/2
                if (num % i == 0) {
                    isPrime = false; // num is not prime
                    break;
                }
            }

            // If isPrime is still true, num is prime
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}
