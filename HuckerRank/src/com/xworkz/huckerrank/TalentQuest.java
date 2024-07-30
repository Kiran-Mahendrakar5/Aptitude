package com.xworkz.huckerrank;

import java.util.Scanner;

public class TalentQuest {

	  public static boolean validate(String num) {
	        if (num.matches("\\d{10}")) {
	            System.out.println("correct");
	            return true;
	        } else {
	            System.out.println("wrong");
	            return false;
	        }
	    }

	    public static void main(String[] args) {
	        Long num = 9738831132L;
	        String numb = Long.toString(num);
	        boolean isValid = validate(numb);
	        // If you want to print the validation result, you can do so here.
	        System.out.println("Validation result: " + isValid);
	    }

}
