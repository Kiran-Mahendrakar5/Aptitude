package com.xworkz.huckerrank;

public class StringBuilders {
	public static void main(String[] args) {
		// Create a StringBuilder instance with an initial string
		StringBuilder sb = new StringBuilder("Hello");
		
        // Append text to the StringBuilder
        sb.append(" World");
        System.out.println("After append: " + sb.toString());

        // Insert text at a specific position
        sb.insert(6, "Beautiful ");
        System.out.println("After insert: " + sb.toString());

        // Delete a portion of the text
        sb.delete(6, 16);
        System.out.println("After delete: " + sb.toString());

        // Reverse the string
        sb.reverse();
        System.out.println("After reverse: " + sb.toString());
		
		
	}
}
