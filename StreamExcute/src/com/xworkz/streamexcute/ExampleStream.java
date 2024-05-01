package com.xworkz.streamexcute;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ExampleStream {
	
	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 5);
		// arrays is class ext obj having asList(),return List<Integar>

		List<Integer> doubledNumbers = numbers.stream().map(n -> n * 2).collect(Collectors.toList());
		// stream is interface having map()
		// collect=repackaging elements to some data structures and applying some
		// additional logic, concatenating them
		// Collectors is class having toList()

		System.out.println(doubledNumbers);
		System.out.println("=========================Map===============================");
//	}
//}
//Stream map() method is used to return a new stream of objects
//when to use map= when you have to retrieve or alter the elements 

		List<Integer> number = Arrays.asList(2, 3, 4, 5, 3);

		Set<Integer> square = number.stream().map(x -> x * x).collect(Collectors.toSet());
		// set //toSet

		System.out.println(square); // Output: [16, 25, 4, 9]

		System.out.println("=========================Map1in set===============================");

		List<String> names = Arrays.asList("Kiran", "Mahendrakar", "Deepu");
		// arrays is class ext obj having asList(),return List<String>

		List<String> result = names.stream().filter(s -> s.startsWith("D")).collect(Collectors.toList());

		// stream is interface having filter()
		// collect=repackaging elements to some data structures and applying some
		// additional logic, concatenating them
		// Collectors is class having toList()

		System.out.println(result);

		System.out.println("=========================filter===============================");

		List<String> srt = Arrays.asList("Kiran", "Mahendrakar", "Akishan");

		List<String> results = srt.stream().sorted().collect(Collectors.toList());

		System.out.println(results);

		System.out.println("=========================sorted===============================");

		List<Integer> fore = Arrays.asList(2, 3, 4, 5);

		fore.stream().map(x -> x * x).forEach(y -> System.out.println(y));

		System.out.println("=========================foreach===============================");

		List<Integer> redu = Arrays.asList(2, 3, 4, 5);

		int even = redu.stream().filter(x -> x % 2 == 0).reduce(0, (ans, i) -> ans + i);

		System.out.println(even);

		System.out.println("=========================reduce===============================");
	}

}
