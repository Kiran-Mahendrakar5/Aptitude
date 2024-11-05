package com.xworkz.huckerrank.present;

public class ReveerseString {
	
	
	public static void main(String[] args) {
		
		String name = "Kiran";
		String reverse = "";
		
		for(int i=name.length()-1;i>=0;i--){
			reverse+=name.charAt(i);
		}
		System.out.println(reverse);
			
		}

}
