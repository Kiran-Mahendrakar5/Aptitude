package com.xworkz.maxmin;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime {

	public static void main(String[] args) {
		// Define the date and time pattern
		String pattern = "MM-dd-yyyy HH:mm:ss";

		// Get the current date and time
		LocalDateTime currentDateTime = LocalDateTime.now();

		// Format the date and time using the specified pattern
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
		String formattedDateTime = currentDateTime.format(formatter);

		// Print the formatted date and time
		System.out.println("Current Date and Time: " + formattedDateTime);
	}
}


