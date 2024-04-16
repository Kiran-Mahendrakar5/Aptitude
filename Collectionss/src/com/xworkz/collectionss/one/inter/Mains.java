package com.xworkz.collectionss.one.inter;

public class Mains {
	public static void main(String[] args) {
		
		
//implementing tigerinterface as 3 paramter
		Tiger ref = (email, name, age) -> {
			//its takes 3 parameter and return double value

			return 3.0;
		};
		
		

		String email = "kiran@gmail.com"; //  passing kiran@gmail.com and kiran and 30 as arguments.
		String name = "kiran";
		int age = 30;
		
		 // Original code segment: Call done method directly using lambda expression
		double result = ref.done(email, name, age);//// implementaing Tigerinterface as three parameter
		System.out.println("Result: " + result);

		TigerClass tiger = new TigerClass();
//		tiger.tigerMethod().done(email, name, age);

		double tigerme = tiger.tigerMethod().done(email, name, age);
		System.out.println("Result tigerM: " + tigerme);

	}
}
