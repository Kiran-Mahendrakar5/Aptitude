package com.xworkz.oraclelamda.approachtwo;

import java.util.ArrayList;
import java.util.List;

public class Runner {
	public static void main(String[] args) {
		// Creating a list of PersonDto objects
		List<PersonDto> list = new ArrayList<>();
		list.add(new PersonDto("John", 30, PersonDto.Sex.MALE)); // Providing gender
		list.add(new PersonDto("Alice", 25, PersonDto.Sex.FEMALE));
		list.add(new PersonDto("Bob", 35, PersonDto.Sex.MALE));

		// Calling the printPersonsWithinAgeRange method from PersonUtils
		printPersonsWithinAgeRange(list, 25, 35);
	}

	public static void printPersonsWithinAgeRange(List<PersonDto> roster, int low, int high) {
		for (PersonDto p : roster) {
			if (low <= p.getAge() && p.getAge() < high) {
				p.printPerson();
			}
		}
	}
}

//if you want to print members of a specified sex,
// this method is more generic than printPersonsOlderThan, 
//trying to create a separate method for each possible search

