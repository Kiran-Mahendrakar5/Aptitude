package com.xworkz.huckerrank.rajajinagar;

public class NumberValidation {
	
	public static void main(String[] args) {
		
		long number = 9738831132l;
		int count = 0;
		while(number!=0) {
			number=number/10;
			count++;
		}
		if(count==10) {
			System.out.println("correct");
		}else {
			System.out.println("no");
		}
		
	}

}
