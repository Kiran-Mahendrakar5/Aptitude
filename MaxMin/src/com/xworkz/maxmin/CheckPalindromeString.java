package com.xworkz.maxmin;

public class CheckPalindromeString {

    public static void main(String[] args) {
        CheckPalindromeString checker = new CheckPalindromeString();

        // Test the checkPalindromeString method
        System.out.println(checker.checkPalindromeString("radar")); // Should print true
        System.out.println(checker.checkPalindromeString("hello")); // Should print false
    }

    boolean checkPalindromeString(String input) {
        boolean result = true;
        int length = input.length();

        for (int i = 0; i < length/2; i++) {
            if (input.charAt(i) != input.charAt(length - i - 1)) {
                result = false;
                break;
            }
        }

        return result;
    }
}
