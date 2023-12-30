package com.xworkz.maxmin;

import java.util.Scanner;

public class AddNumber {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number:-");

		int nextint = scanner.nextInt();

		int sum = addingNumber(nextint);
		
		System.out.println("Counted="+sum);
		
		scanner.close();
	}
	
	public static int addingNumber(int numbers) {
		int sum =0;
		while(numbers!=0) {
			sum+=numbers%10;
			numbers/=10;
		}
		return sum;
		
	}

}
