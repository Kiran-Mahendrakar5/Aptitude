package com.xworkz.maxmin;

public class Test {
	
	public static void main(String[] args) {
		int kiran=1;
		while(kiran<=15) {
			System.out.println(kiran%2==1?"M":"S");
			++kiran;
		}
	}

}
//Explanation:
//
//When kiran is 1, 3, 5, 7, 9, 11, 13, and 15 (odd numbers), it prints ***.
//When kiran is 2, 4, 6, 8, 10, 12, and 14 (even numbers), it prints +++++.