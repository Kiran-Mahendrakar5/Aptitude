package com.xworkz.huckerrank;

import java.time.LocalDate;
import java.time.LocalTime;

public class SubString {

public static String subString(String word,int start,int end) {
	
	String words = "";
	for(int i=start;i<end;i++) {
		words+=word.charAt(i);
	}
	return words;
	
	
	
}
public static void main(String[] args) {
	
	
	String result =	subString("kiranmahedrakar", 0, 5);
//	LocalDate date = LocalDate.of(2024, 7, 30);
//	LocalTime time = LocalTime.now();
	
	System.out.println(result);
//	System.out.println("result = "+result+"Date = "+date+"Time = "+time);

	}
}
