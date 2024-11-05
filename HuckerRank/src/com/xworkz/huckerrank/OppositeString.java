package com.xworkz.huckerrank;

public class OppositeString {

	public static void main(String[] args) {

		String name = "Kiran";
		String news = "";

		for(int i=name.length()-1;i>=0;i--) {
			char ch = name.charAt(i);
			if(Character.isUpperCase(ch)) {
				news+=Character.toLowerCase(ch);
			}else {
				news+=Character.toUpperCase(ch);
			}
		}
		System.out.println(news);
		

	}
}
