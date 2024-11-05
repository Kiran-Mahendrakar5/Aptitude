package com.xworkz.huckerrank;

public class PhoneNum {

	public static void main(String[] args) {
		
	Long num = 9738831132l;
	
	int count =0;
	while(num!=0) {
		num=num/10;
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
