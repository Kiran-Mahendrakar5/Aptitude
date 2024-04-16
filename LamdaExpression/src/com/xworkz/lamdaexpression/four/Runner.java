package com.xworkz.lamdaexpression.four;

public class Runner {

	public static void main(String[] args) {

		Lion ln = (colour, food, age) -> {
			return "kiran";
		};
		String colour = "yellow";
		String food = "grass";
		int age = 23;

		String ref = ln.animal(colour, food, age);
		System.out.println(ref);

		LionClass lc = new LionClass();
		String refe = lc.lClass().animal(colour, food, age);
		System.out.println(refe);

	}

}
