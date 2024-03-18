package com.xworkz.codes;

import java.util.Scanner;

public class Polindro {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter Word");
        
        String polindron = scanner.nextLine();
        
        if (isPalindrome(polindron)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }

    private static boolean isPalindrome(String polindron) {
        String clean = polindron.replaceAll("\\s", "").toLowerCase();
        int length = clean.length();
        for (int i = 0; i < length / 2; i++) {
            if (clean.charAt(i) != clean.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
