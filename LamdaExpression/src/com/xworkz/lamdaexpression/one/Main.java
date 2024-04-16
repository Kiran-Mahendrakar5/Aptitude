package com.xworkz.lamdaexpression.one;

public class Main {
	
	public static void main(String[] args) {
		
		MyInterface my =()->{
			System.out.println("this lambda expression");
		};
		
		my.myMethod();
	}

}
