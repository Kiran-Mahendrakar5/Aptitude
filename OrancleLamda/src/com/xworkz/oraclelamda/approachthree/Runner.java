package com.xworkz.oraclelamda.approachthree;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		// Creating a list of PersonDto objects
		List<PersonDto> roster = new ArrayList<>();
		roster.add(new PersonDto("John", 30, PersonDto.Sex.MALE)); // Providing gender
		roster.add(new PersonDto("Alice", 25, PersonDto.Sex.FEMALE));
		roster.add(new PersonDto("Bob", 35, PersonDto.Sex.MALE));

		// Calling the printPersons method with a CheckPerson implementation
		printPersons(roster, new CheckPerson() {
			@Override
			public boolean test(PersonDto p) {
				return p.getGender() == PersonDto.Sex.FEMALE && p.getAge() >= 18 && p.getAge() <= 25;
			}
		});
	}

	// Method to print persons based on the check criteria
	public static void printPersons(List<PersonDto> roster, CheckPerson tester) {
	        for (PersonDto p : roster) {
	            if (tester.test(p)) {
	                p.printPerson();
	            }
	        }

	}
}
