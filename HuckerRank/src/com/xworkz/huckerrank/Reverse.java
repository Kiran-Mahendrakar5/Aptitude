package com.xworkz.huckerrank;

public class Reverse {

	public static void main(String[] args) {
		
		String name = "Kiran";
		String news = "";
		for(int i=name.length()-1;i>=0;i--) {
			news+=name.charAt(i);
		}
		System.out.println(news);

	}
}
