package com.xworkz.huckerrank;

import java.util.LinkedHashSet;
import java.util.Set;

public class AvoidDuplicateLetter {

	public static String AvoidDuplicateLetters(String target) {

		Set<Character> set = new LinkedHashSet<Character>();
		String word = "";
		for (Character fr : target.toCharArray()) {
			if (set.add(fr)) {
				word += fr;
			}

		}
		return word;
	}

	public static void main(String[] args) {

		String result = AvoidDuplicateLetters("Good");
		System.out.println(result);
	}
}
