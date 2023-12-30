package com.xworkz.codeninja;

public class ReverseInteger {
    public int reverse(int x) {
        int result = 0;

        while (x != 0) {
            // Extract the last digit
            int digit = x % 10;
            x /= 10;

            // Check for overflow before updating the result
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0; // Overflow
            }
            if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0; // Overflow
            }

            // Update the result by appending the current digit
            result = result * 10 + digit;
        }

        return result;
    }

    public static void main(String[] args) {
        ReverseInteger reverseIntegerSolver = new ReverseInteger();

        // Example usage
        int num1 = 123;
        int num2 = -123;
        int num3 = 120;

        System.out.println("Reverse of " + num1 + ": " + reverseIntegerSolver.reverse(num1));
        System.out.println("Reverse of " + num2 + ": " + reverseIntegerSolver.reverse(num2));
        System.out.println("Reverse of " + num3 + ": " + reverseIntegerSolver.reverse(num3));
    }
}

