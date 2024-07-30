package com.xworkz.huckerrank;

public class PhoneNum {

	public static void main(String[] args) {
		
		Long number = 9738831132L;
		
		int count = 0;
		while(number>0) {
			number=number/10;
			count++;
		}
		System.out.println(count);
		if(count==10) {
			System.out.println("correct");
		}else {
			System.out.println("wrong");
		}
		
		

	}

}
