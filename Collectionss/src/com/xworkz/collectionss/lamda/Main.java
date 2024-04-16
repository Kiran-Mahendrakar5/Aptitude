package com.xworkz.collectionss.lamda;

public class Main {

	public static void main(String[] args) {
		Lion ref = (name, age) -> {//lamda converts the code segments into an arguments 
			return "kiran";
		};

		String name = "kiran";
		int age = 25;

		String result = ref.done(name, age);//we can quickly give behouir to method as parameter by utilizing function interface 
		System.out.println(result);

		LionClass cl = new LionClass();
		String res = cl.lionMeth().done(name, age);
		System.out.println(res);
	}

}
