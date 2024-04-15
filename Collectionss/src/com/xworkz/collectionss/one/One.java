package com.xworkz.collectionss.one;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class One {

	public static void main(String[] args) {
		Runnable ref1 = () -> System.out.println("Zero parameter lambda");
		
		
		Consumer<String> ref2 = (p) -> System.out.println("One parameter: " + p);
		
		
		BiConsumer<String, Integer> ref3 = (p1, p2) -> System.out
				.println("second parameters: " + p1 + ", " + p2);
		
		

		
		ref1.run();
		ref2.accept("Test");
		ref3.accept("Test1", 5);
	}

}
