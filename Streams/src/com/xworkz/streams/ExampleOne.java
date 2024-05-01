package com.xworkz.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExampleOne {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Kiran", "Mahendrakar", "Deepu");
		// arrays is class ext obj having asList(),return List<String>

		List<String> result = names.stream().filter(s -> s.startsWith("D")).collect(Collectors.toList());

		// stream is interface having filter()
		// collect=repackaging elements to some data structures and applying some
		// additional logic, concatenating them
		// Collectors is class having toList()

		System.out.println(result);
	}

}

//Stream map() method is used to return a new stream of objects
//when to use filter to filter arguments
