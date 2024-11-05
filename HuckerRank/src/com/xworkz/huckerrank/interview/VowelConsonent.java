package com.xworkz.huckerrank.interview;

public class VowelConsonent {

	public static void main(String[] args) {

		String name = "kiran";
		int vowel = 0;
		int consonent = 0;

		name = name.toLowerCase();
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if(ch=='a'||ch=='i'||ch=='e'||ch=='o'||ch=='u') {
				vowel++;
			}else if(ch>='a'&&ch<'z') {
				consonent++;
			}
			
		}
		System.out.println("vowel"+vowel);
		System.out.println(consonent);

	}

}
