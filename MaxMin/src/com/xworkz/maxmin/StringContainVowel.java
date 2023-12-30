package com.xworkz.maxmin;

public class StringContainVowel {
	
	public static void main(String[] args) {
		
		System.out.println(StringContainVowel("Hello"));
		System.out.println(StringContainVowel("TV"));
		
	}

	public static boolean StringContainVowel(String input) {
		
		
		return input.toLowerCase().matches(".*[a e i o u].*") ;
	}

}



