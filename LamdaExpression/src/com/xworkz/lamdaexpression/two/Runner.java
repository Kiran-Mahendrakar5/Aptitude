package com.xworkz.lamdaexpression.two;

public class Runner {

	public static void main(String[] args) {

		Tiger ref = (name, email, age) -> {
			return 4.5;
		};

		String name = "Kiran";
		String email = "kiran@gmail.com";
		int age = 23;

		double result = ref.done(name, email, age);
		System.out.println(result);
		
		TigerClass tr = new TigerClass();
		double db = tr.TClass().done(name, email, age);
		System.out.println(db);
	}

}
