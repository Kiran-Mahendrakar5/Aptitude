	package com.xworkz.oraclelamda.nine;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.oraclelamda.eight.PersonDto;

public class Runner {

	public static void main(String[] args) {
		// Creating a list of Person objects
		List<PersonDto> roster = new ArrayList<>();
		roster.add(new PersonDto("John", 30, PersonDto.Sex.MALE));
		roster.add(new PersonDto("Alice", 25, PersonDto.Sex.FEMALE));
		roster.add(new PersonDto("Bob", 35, PersonDto.Sex.MALE));

		roster.get(0).setEmailAddress("john@example.com");
		roster.get(1).setEmailAddress("alice@example.com");
		roster.get(2).setEmailAddress("bob@example.com");

		// Approach 9: Use aggregate operations with lambda expressions

		// Print the email addresses of male members aged between 18 and 25
		roster.stream().filter(p -> p.getGender() == PersonDto.Sex.FEMALE && p.getAge() >= 18 && p.getAge() <= 25)
				.map(p -> p.getEmailAddress()).forEach(email -> System.out.println(email));
	}
}
