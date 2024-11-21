package com.xworkz.updatemyself.String;

import java.util.HashSet;

public class DuplicateRetrive {

	public static void main(String[] args) {

		String name = "kiranmahendrakar";
		duplicateRetrive(name);
	}

	public static void duplicateRetrive(String name) {
		HashSet<Character> set = new HashSet<Character>();
		HashSet<Character> duplicate = new HashSet<Character>();

		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i); // Get character at index i

			// If the character is already in the set, it's a duplicate
			if (!set.add(ch)) {
				duplicate.add(ch); // Add to duplicate set
			}
		}
		System.out.println(duplicate);

	}

}
