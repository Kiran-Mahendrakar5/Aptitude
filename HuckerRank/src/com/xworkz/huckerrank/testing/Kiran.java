package com.xworkz.huckerrank.testing;

import java.util.Scanner;

public class Kiran {

public static void main(String[] args) {
	
	for(int num=20;num<=100;num++) {
		
		boolean isPrime=true;
		
		for(int i=2;i<num/2;i++) {
			if(num%i==0) {
				isPrime=false;
				break;
			}
		}
		if(isPrime) {
			System.out.println("true");
		}
		
		
	}
	
	
	
		
	
}

}
