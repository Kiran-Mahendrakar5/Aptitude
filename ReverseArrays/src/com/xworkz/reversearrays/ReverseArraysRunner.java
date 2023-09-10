package com.xworkz.reversearrays;

public class ReverseArraysRunner {

	public static void main(String[] args) {

		String name = "this is sleeping time";

		String[] wr = name.split(" ");

		String reverseWord = "";

		for (int i = 0; i < wr.length; i++) {
			if (wr[i].equals("sleeping")) {
				char[] ref = wr[i].toCharArray();
				for (int j = ref.length - 1; j >= 0; j--) {
					System.out.println(ref[j] + " ");
					
					
					
					
//					reverseWord = reverseWord + ref[j];
//					System.out.println(reverseWord);
				}
//				wr[i] = reverseWord;

			}
		}
//		for (int i = 0; i < wr.length; i++) {
//			System.out.println(wr[i] + "");
//		}
	}

}
