package com.xworkz.streamexcute;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MethodRef {
	
//	  public static void main(String[] args) {
//	    	 List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
//
//	        // Using lambda expression
//	        Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
//
//	        System.out.println(names); // Output: [Alice, Bob, Charlie]
//	    }
	
	
//	 public static void main(String[] args) {
//	        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
//
//	        // Method reference to System.out.println
//	        names.forEach(System.out::println);
//	    }
//	}
	
//	   public static void main(String[] args) {
//	    	 List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
//
//	        // Using method reference
//	        Collections.sort(names, String::compareTo);
//
//	        System.out.println(names); // Output: [Alice, Bob, Charlie]
//	    }
//	}
	
	public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // Lambda expression to print each element
        names.forEach(name -> System.out.println(name));
        
        //using method ref
        names.forEach(System.out::println);
    }
}


