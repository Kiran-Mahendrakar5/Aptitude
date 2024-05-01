package com.xworkz.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExampleTwo {
	
	 public static void main(String[] args) {
	     
	        List<String> names = Arrays.asList("Kiran", "Mahendrakar", "Akishan");

	        
	        List<String> result = names.stream()
	                                   .sorted()
	                                   .collect(Collectors.toList());

	        System.out.println(result); 
	    }

}
//when we use sorted  to sort the elements