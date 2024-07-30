package com.xworkz.huckerrank;

import java.util.LinkedHashSet;
import java.util.Set;

public class AvoidDuplicate {

	public static String avoidDuplicate(String target) {

		String[] sp = target.split(" ");
		
		Set<String> set = new LinkedHashSet<String>();
		
		for(String fr:sp) {
			set.add(fr);
		}
		return String.join(" ", set);
		
		
		
	
	}
	public static void main(String[] args) {
		
	String result =	avoidDuplicate("good morning all all");
	System.out.println(result);
	}

}
