package com.xworkz.huckerrank;

import java.util.HashSet;
import java.util.Set;

public class Vowels {
	
	public static void main(String[] args) {
		System.out.println(stringContainVowel("Kiran")); 
	}

	public static int stringContainVowel(String tv) {
		int count = 0;
		Set<Character> vowels = new HashSet<>();
		vowels.add('a');
		vowels.add('e');
		vowels.add('i');
		vowels.add('o');
		vowels.add('u');
		vowels.add('A');
		vowels.add('E');
		vowels.add('I');
		vowels.add('O');
		vowels.add('U');
		
		for (int i = 0; i < tv.length(); i++) {
			char ch = tv.charAt(i);
			if (vowels.contains(ch)) {
				count++;
			}
		}
		return count;
	}
}
