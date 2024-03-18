package com.xworkz.codes;

public class MethodOverloading {
	
	public static void main(String[] args) {
		
		demo(11);
		demo("kiran");
	}
		
		public static void demo(int no) {
			System.out.println(no);
		
	}
		
		public static void demo(String name) {
			System.out.println(name);
		}

}
