package com.xworkz.patterns;

public class oneTo25 {
	
	public static void main(String[] args) {
		int a=5;
		int b=2;
		
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=a;j++) {
				System.out.printf("%2d",b);
				b+=2;
			}
			System.out.println();
		}
	}

}
