package com.xworkz.huckerrank.morning;

public class DigitContainInString {
	
	public static void main(String[] args) {
		
		String name= "12345";
		boolean isDigit = true;
		
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)<'0'||name.charAt(i)>'9') {
				isDigit=false;
				break;
			}
		}
		if(isDigit) {
			System.out.println("true");
		}
		
	}

}
