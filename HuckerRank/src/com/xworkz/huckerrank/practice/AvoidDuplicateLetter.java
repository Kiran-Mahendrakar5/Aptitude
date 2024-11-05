package com.xworkz.huckerrank.practice;

import java.util.LinkedHashSet;
import java.util.Set;

public class AvoidDuplicateLetter {
	
	public static String avoidDuplicateLetter(String word) {
		
		Set<Character> set = new LinkedHashSet<Character>();
		
		String news = " ";
		for(Character fr:word.toCharArray()) {//convert string to chrater
			if(set.add(fr)) {
				news+=fr;
			}
		}
		
		return news;
		
		
	}
	public static void main(String[] args) {
	String word = 	avoidDuplicateLetter("Good morning all");
	System.out.println(word);
	}

}
