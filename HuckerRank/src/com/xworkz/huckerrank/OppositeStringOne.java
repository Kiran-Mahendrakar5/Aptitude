package com.xworkz.huckerrank;

public class OppositeStringOne {

	public static void main(String[] args) {

		String name = "KiRaN";
		String news = "";

		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if(ch>='A'&&ch<'Z') {
				news+=(char)(ch +('a'-'A'));
			}else if(ch>='a'&&ch<'z') {
				news+=(char)(ch -('a'-'A'));
			}else {
				news+=ch;
			}

		}
		System.out.println(news);
		
	}

}
