package com.xworkz.huckerrank.rajajinagar;

public class RemoveDuplicateWords {

	public static void main(String[] args) {

		String sentence = "hai good morning hai";

		String result = "";
		String[] words = sentence.split(" ");
		boolean isDuplicate;
		
		

		for (int i = 0; i < words.length; i++) {
			isDuplicate = false;

			for (int j = 0; j < i; j++) {
				if (words[i].equals(words[j])) {
					isDuplicate = true;
					break;
				}
			}

			if (!isDuplicate) {
				result += words[i] + " ";
			}
		}

		System.out.println("Modified sentence: " + result.trim());
	}
}
