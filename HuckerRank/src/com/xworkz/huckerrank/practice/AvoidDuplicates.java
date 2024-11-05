package com.xworkz.huckerrank.practice;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class AvoidDuplicates {

	public static String avoidDuplicates(String word) {

		String[] sp = word.split(" ");

		Set<String> set = new LinkedHashSet();
		for (String fr : sp) {
			set.add(fr);
		}

		return String.join(" ", set);

	}

	public static void main(String[] args) {
		String result = avoidDuplicates("Good morning all all");
		System.out.println(result);

	}

}
