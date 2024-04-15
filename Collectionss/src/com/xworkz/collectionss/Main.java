package com.xworkz.collectionss;

public class Main {
	
	public static void main(String[] args) {
		
		MathOperation ref = (int a, int b) -> a + b;
		
		System.out.println("10 + 5 = " + ref.operate(10, 5));
	
	}

}
