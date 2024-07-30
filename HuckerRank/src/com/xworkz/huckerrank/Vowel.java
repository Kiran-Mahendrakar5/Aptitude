package com.xworkz.huckerrank;

public class Vowel {
	
	public static void main(String[] args) {
		
		System.out.println(stringContainVowel("TV"));
	}
	
	public static boolean stringContainVowel(String tv) {
		
		char[] alphabets = {'a','e','i','u','o'};
		for(int i=0;i<tv.length();i++) {
		char ch = 	tv.charAt(i);
		for(int j=0;j<alphabets.length;j++) {
			if(ch==alphabets[j]) {
				return true;
			}
		}
		}
		
		return false;
		
		
		
		
	}

}
