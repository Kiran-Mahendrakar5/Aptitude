package com.xworkz.oraclelamda.eight;

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


        // Approach 8: Use generics more extensively

        // Method to process elements based on the predicate, retrieve data using Function interface, and perform an action using Consumer interface
        processElements(
                roster,
                p -> p.getGender() == PersonDto.Sex.FEMALE
                        && p.getAge() >= 18
                        && p.getAge() <= 25,
                p -> p.getEmailAddress(),
                email -> System.out.println(email)
        );
    }

    // Generic method to process elements based on the predicate, retrieve data using Function interface, and perform an action using Consumer interface
    public static <X, Y> void processElements(
            Iterable<X> source,
            Predicate<X> tester,
            Function<X, Y> mapper,
            Consumer<Y> block) {
        for (X p : source) {
            if (tester.test(p)) {
                Y data = mapper.apply(p);
                block.accept(data);
            }
        }
    }
}
