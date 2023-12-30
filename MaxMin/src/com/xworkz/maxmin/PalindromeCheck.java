	package com.xworkz.maxmin;
	
	import java.util.Scanner;
	
	public class PalindromeCheck {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	
	        System.out.println("Enter a string to check for palindrome:");
	        String str = scanner.nextLine();
	
	        if (isPalindrome(str)) {
	            System.out.println(str + " is a palindrome.");
	        } else {
	            System.out.println(str + " is not a palindrome.");
	        }
	
	        scanner.close();
	    }
	
	    public static boolean isPalindrome(String str) {
	        // Remove spaces and convert to lowercase for case-insensitive comparison
	        str = str.replaceAll("\\s", "").toLowerCase();
	
	        int length = str.length();
	        for (int i = 0; i < length / 2; i++) {
	            if (str.charAt(i) != str.charAt(length - i - 1)) {
	                return false;
	            }
	        }
	        return true;
	    }
	}
