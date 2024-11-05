package com.xworkz.huckerrank;

import java.util.LinkedHashSet;
import java.util.Set;

public class AvoidDuplicate {

	public static String AvoidDuplicate(String target) {

		String[] slp = target.split(" ");

		Set<String> set = new LinkedHashSet<String>();
	
		for (String fr : slp) {
			set.add(fr);
		}
		return String.join(" ", set);

	}

	public static void main(String[] args) {

		String ref = AvoidDuplicate("good morning all all");
		System.out.println(ref);
	}

}
