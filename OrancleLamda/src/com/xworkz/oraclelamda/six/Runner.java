package com.xworkz.oraclelamda.six;

import java.util.ArrayList;
import java.util.List;

public class Runner {
	
	  public static void main(String[] args) {
	        // Creating a list of Person objects
	        List<PersonDto> roster = new ArrayList<>();
	        roster.add(new PersonDto("John", 30, PersonDto.Sex.MALE)); // Providing gender
	        roster.add(new PersonDto("Alice", 25, PersonDto.Sex.FEMALE));
	        roster.add(new PersonDto("Bob", 35, PersonDto.Sex.MALE));

	        // Calling the printPersonsWithPredicate method with a lambda expression
	        printPersonsWithPredicate(roster,
	            p -> p.getGender() == PersonDto.Sex.FEMALE
	                && p.getAge() >= 18
	                && p.getAge() <= 25
	        );
	    }

	    // Method to print persons based on the predicate
	    public static void printPersonsWithPredicate(List<PersonDto> roster, Predicate<PersonDto> tester) {
	        for (PersonDto p : roster) {
	            if (tester.test(p)) {
	                p.printPerson();
	            }
	        }

	    }
}
