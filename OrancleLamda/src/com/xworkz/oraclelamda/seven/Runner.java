package com.xworkz.oraclelamda.seven;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Runner {
	
    public static void main(String[] args) {
        // Creating a list of PersonDto objects
        List<PersonDto> roster = new ArrayList<>();
        roster.add(new PersonDto("John", 30, PersonDto.Sex.MALE));
        roster.add(new PersonDto("Alice", 25, PersonDto.Sex.FEMALE));
        roster.add(new PersonDto("Bob", 35, PersonDto.Sex.MALE));
        
        roster.get(0).setEmailAddress("john@example.com");
        roster.get(1).setEmailAddress("alice@example.com");
        roster.get(2).setEmailAddress("bob@example.com");

        // Approach 7: Process persons with lambda expressions

        // Method to print persons based on the predicate using Consumer interface
        processPersons(
                roster,
                p -> p.getGender() == PersonDto.Sex.FEMALE
                        && p.getAge() >= 18
                        && p.getAge() <= 25,
                p -> p.printPerson()
        );

        // Method to retrieve email addresses based on the predicate using Function and Consumer interfaces
        processPersonsWithFunction(
                roster,
                p -> p.getGender() == PersonDto.Sex.FEMALE
                        && p.getAge() >= 18
                        && p.getAge() <= 25,
                p -> p.getEmailAddress(),
                email -> System.out.println(email)
        );
    }

    // Method to process persons based on the predicate and perform an action using Consumer interface
    public static void processPersons(
            List<PersonDto> roster,
            Predicate<PersonDto> tester,
            Consumer<PersonDto> block) {
        for (PersonDto p : roster) {
            if (tester.test(p)) {
                block.accept(p);
            }
        }
    }

    // Method to process persons based on the predicate, retrieve data using Function interface, and perform an action using Consumer interface
    public static void processPersonsWithFunction(
          List<PersonDto> roster, Predicate<PersonDto> tester,Function<PersonDto, String> mapper,Consumer<String> block) {
        for (PersonDto p : roster) {
            if (tester.test(p)) {
                String data = mapper.apply(p);
                block.accept(data);
            }
        }
    }
}
