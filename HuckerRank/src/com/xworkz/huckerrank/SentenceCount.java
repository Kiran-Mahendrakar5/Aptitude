package com.xworkz.huckerrank;

public class SentenceCount {

	// hai good morning good good ,good
	public static int sentenceCount(String target, String word) {
//String[] words=     //good.split(" ");
		String[] words = target.split(" ");

		int count = 0;
//for(String w:good)
		for (String w : words) { // for (int i = 0; i < words.length; i++) {
// good.equals(Good morning All)
			if (w.equals(word)) { // if (words[i].equals(word)) {
				count++;

			}
		}
		return count;

	}

	public static void main(String[] args) {

		int result = sentenceCount("hai good morning good good", "good");
		System.out.println(result);
	}
}
