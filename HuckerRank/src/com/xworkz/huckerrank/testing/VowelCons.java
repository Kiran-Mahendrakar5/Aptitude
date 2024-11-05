package com.xworkz.huckerrank.testing;

public class VowelCons {

	public static void main(String[] args) {

		String name = "kiran";
		int vowel = 0;
		int cons = 0;

		name = name.toLowerCase();

		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				vowel++;
			}else if(ch>='a'&&ch<='z') {
				cons++;
			}

		}
		System.out.println("vowel"+vowel);
		System.out.println("consonent"+cons);
	}

}
