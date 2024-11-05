package com.xworkz.huckerrank.interview;

public class StringcontainDigit {
    public static void main(String[] args) {
        String str = "12345";
        boolean isDigitOnly = true;
        
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) < '0' || str.charAt(i) > '9') {
                isDigitOnly = false;
                break;
            }
        }
        
        if (isDigitOnly) {
            System.out.println("The string contains only digits.");
        } else {
            System.out.println("The string contains non-digit characters.");
        }
    }
}
