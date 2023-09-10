package com.xworkz.reverseword;

public class ReverseWord {
	public static void main(String[] args) {
		
		String word ="kiran mahendrakar";
		String reverse=ReverseWord.getWord(word);
		System.out.println(reverse);

	}

	public static String getWord(String word) {

		StringBuilder builder = new StringBuilder();

		String words[] = word.split(" ");

		for (int j = words.length - 1; j >= 0; j--) {

			builder.append(words[j]);
			if (j > 0) {
				builder.append(" ");

			}
		}
		return builder.toString();
	
	
	}

}
