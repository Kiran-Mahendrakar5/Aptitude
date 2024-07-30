package com.xworkz.huckerrank;

import java.time.LocalDate;
import java.time.LocalTime;

public class SubString {

public static String subString(String word,int start,int end) {
	
	String count = "";
	
	for(int i=start;i<end;i++) {
		count+=word.charAt(i);
	}
	return count;
	
	
	
}
public static void main(String[] args) {
	
	
	String result =	subString("kiranmahedrakar", 0, 5);
	LocalDate date = LocalDate.of(2024, 7, 30);
	LocalTime time = LocalTime.now();
	
	System.out.println("result = "+result+"Date = "+date+"Time = "+time);

	}
}
