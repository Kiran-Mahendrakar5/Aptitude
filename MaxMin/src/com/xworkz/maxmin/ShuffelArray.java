package com.xworkz.maxmin;

import java.util.Arrays;
import java.util.Random;

public class ShuffelArray {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		

		Random rand = new Random();

		for (int i = 0; i < array.length; i++) {
			int randomswap = rand.nextInt(array.length);
		int ref = 	array[randomswap];
		array[randomswap]=array[i];
		array[i]=ref;
		}
		System.out.println("Swaped Array" +Arrays.toString(array));

	}
}
