package com.xworkz.reversearrays;

public class ReverseStringRunner {
	
	public static void main(String[] args) {
		
		String name ="kiran";
		int ref = name.length();
		String reverse ="";
		for(int i=ref-1;i>=0;i--) {
			reverse=reverse	+name.charAt(i);
			System.out.println(reverse);
			
		}
				
	}

}
