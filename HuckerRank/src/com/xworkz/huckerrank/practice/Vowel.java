package com.xworkz.huckerrank.practice;

import java.util.HashSet;
import java.util.Set;

public class Vowel {
	
	public static void main(String[] args) {
		
		System.out.println(StringContainVowel("KIRAN"));
	}
	public static int StringContainVowel(String tv) {
		int count =0;
		Set<Character> set = new HashSet<Character>();
		set.add('A');
		set.add('E');
		set.add('I');
		set.add('O');
		set.add('U');
		set.add('a');
		set.add('e');
		set.add('i');
		set.add('o');
		set.add('u');
		
		for(int i=0;i<tv.length();i++) {
			char ch = tv.charAt(i);
			if(set.contains(ch)) {
				count++;
			}
			
		}
		return count;
	}

}
