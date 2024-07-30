package com.xworkz.huckerrank;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Practice {

	public static String wordCount(String target) {

		String[] sp = target.split(" ");
		
		Set<String> set = new LinkedHashSet<>();
		
		for(String fr:sp) {
			set.add(fr);
		}
		
		
		return String.join(" ", set);

	}
	public static void main(String[] args) {
		
	String result =	wordCount("Hai Good Morning all all");
	System.out.println(result);
	}

}
