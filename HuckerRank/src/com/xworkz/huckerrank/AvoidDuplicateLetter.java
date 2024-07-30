package com.xworkz.huckerrank;

import java.util.LinkedHashSet;
import java.util.Set;

public class AvoidDuplicateLetter {

	public static String avoidDuplicateLetter(String target) {

		Set<Character> set = new LinkedHashSet<Character>();

		String word = "";
		for (char fr : target.toCharArray()) {
			if (set.add(fr)) {
				word += fr;
			}

		}
		return word;

	}

	public static void main(String[] args) {

		String result = avoidDuplicateLetter("good morning");
		System.out.println(result);
	}
}
