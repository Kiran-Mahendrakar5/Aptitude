package com.xworkz.lamdaexpression.three;

public class Runner {

	public static void main(String[] args) {

		MyInterface ref = (age) -> {
			System.out.println("Lamda expression");
		};

		ref.MyPara(45);

	}

}
