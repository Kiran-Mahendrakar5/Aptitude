package com.xworkz.huckerrank.practice;

public class DeplicateWord {

	public static int deplicateWord(String target, String word) {
		String[] sp = target.split("");

		int count = 0;
		for (String fr : sp) {
			if (sp.equals(word)) {
				count++;
			}
		}
		return count;

	}
	public static void main(String[] args) {
		int result = deplicateWord("good morning all all", "all");
		System.out.println(result);
		
	}

}
