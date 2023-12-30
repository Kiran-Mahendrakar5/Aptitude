package com.xworkz.codeninja;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        // Use a stack to keep track of open brackets
        Stack<Character> stack = new Stack<>();

        // Iterate through each character in the string
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                // Push open brackets onto the stack
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                // Pop '(' from the stack if encountering ')'
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                // Pop '[' from the stack if encountering ']'
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                // Pop '{' from the stack if encountering '}'
                stack.pop();
            } else {
                return false; // Invalid character or mismatched brackets
            }
        }

        // The string is valid if the stack is empty
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParentheses parenthesesValidator = new ValidParentheses();

        // Example usage
        String str1 = "()";
        String str2 = "()[]{}";
        String str3 = "(]";
        String str4 = "([)]";
        String str5 = "{[]}";

        System.out.println("Is \"" + str1 + "\" valid? " + parenthesesValidator.isValid(str1));
        System.out.println("Is \"" + str2 + "\" valid? " + parenthesesValidator.isValid(str2));
        System.out.println("Is \"" + str3 + "\" valid? " + parenthesesValidator.isValid(str3));
        System.out.println("Is \"" + str4 + "\" valid? " + parenthesesValidator.isValid(str4));
        System.out.println("Is \"" + str5 + "\" valid? " + parenthesesValidator.isValid(str5));
    }
}

