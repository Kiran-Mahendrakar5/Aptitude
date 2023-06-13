package com.xworkz.reversearray;

public class Strings {
	public static void main(String[] args) {

		String name = "Kiran";
		char[] ch = name.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			System.out.print(ch[i]);
		}

		System.out.println();
		String name1 = "kishan";
		char[] nme = name1.toCharArray();
		for (int i = nme.length - 1; i >= 0; i--) {
			System.out.print(nme[i]);
		}

		System.out.println();
		char[] ch1 = name.toCharArray();
		System.out.println(ch1.length);

		System.out.println();
		char[] ch2 = name1.toCharArray();
		System.out.print(ch2.length);

		System.out.println();

		String namee = "kiran is a playboy";
		System.out.println(namee);
		System.out.println(namee.split(" ").length);

		String name2 = "kishan";
		int count = 0;
		char[] vowel = name2.toCharArray();
		for (int i = 0; i < vowel.length; i++) {
			if (vowel[i] == 'a' || vowel[i] == 'e' || vowel[i] == 'i' || vowel[i] == 'o' || vowel[i] == 'u') {
				count++;
			}

		}
		System.out.println("vowels are : " + count);

		String name3 = "kishan";
		int counts = 0;
		char[] consonant = name2.toCharArray();
		for (int i = 0; i < consonant.length; i++) {
			if (vowel[i] == 'a' || vowel[i] == 'e' || vowel[i] == 'i' || vowel[i] == 'o' || vowel[i] == 'u') {

			} else {
				counts++;
			}

		}
		System.out.println("consonant are : " + counts);

	}

}
