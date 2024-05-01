package com.xworkz.streams;

import java.util.stream.Stream;

public class ExampleFive {
	public static void main(String[] args) {
		
		Stream.Builder<String> builder = Stream.builder();
//Stream by generating elements individually and adding them to the Builder
//		stream builder is interface we have 3 () ,1)accept 2)add 3)build
		
		builder.add("Geeks");
		builder.add("for");
		builder.add("Geeks");

	
		Stream<String> stream = builder.build();

		
		stream.forEach(System.out::println);
	}
}

//When to use StreamBuilder and FutureBuilder?
//StreamBuilder is used for displaying data that is continuously updating,
//while FutureBuilder is used for displaying data that is retrieved once
