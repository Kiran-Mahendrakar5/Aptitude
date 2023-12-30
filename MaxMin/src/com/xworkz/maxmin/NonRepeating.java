package com.xworkz.maxmin;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NonRepeating {

	public static void main(String[] args) {
		// Create a Scanner object for input
		Scanner scanner = new Scanner(System.in);

		// Prompt the user to enter the array elements
		System.out.print("Enter the array elements (comma-separated): ");
		String input = scanner.nextLine();

		// Split the input into an array of strings
		String[] elements = input.split(",");

		// Convert the array of strings to an array of integers
		int[] array = Arrays.stream(elements).mapToInt(Integer::parseInt).toArray();

		// Find non-repeating elements
		int[] nonRepeatingElements = findNonRepeatingElements(array);

		// Print the non-repeating elements
		System.out.print("Non-repeating elements: ");
		for (int element : nonRepeatingElements) {
			System.out.print(element + " ");
		}

		// Close the Scanner
		scanner.close();
	}

	private static int[] findNonRepeatingElements(int[] array) {
		Map<Integer, Integer> frequencyMap = new HashMap<>();

		// Count the frequency of each element and store in the map
		for (int element : array) {
			frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
		}

		// Filter non-repeating elements
		return frequencyMap.entrySet().stream().filter(entry -> entry.getValue() == 1).mapToInt(Map.Entry::getKey)
				.toArray();
	}
}
