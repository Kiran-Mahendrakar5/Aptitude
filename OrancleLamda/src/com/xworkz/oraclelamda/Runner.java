package com.xworkz.oraclelamda;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        // Create a list of Person objects (roster)
        List<PersonDto> list = new ArrayList<>();
        list.add(new PersonDto("John", 30, PersonDto.Sex.MALE));
        list.add(new PersonDto("Alice", 25, PersonDto.Sex.FEMALE));
        list.add(new PersonDto("Bob", 35, PersonDto.Sex.MALE));
        list.add(new PersonDto("Emma", 22, PersonDto.Sex.FEMALE));

        // Call the printPersonsOlderThan method with the roster list and age
        printPersonsOlderThan(list, 25);
    }

    public static void printPersonsOlderThan(List<PersonDto> roster, int age) {
        for (PersonDto p : roster) {
            if (p.getAge() >= age) {
                p.printPerson();
            }
        }
    }
}
//Create Methods That Search for Members That Match One Characteristic
// each method searches for members that match one characteristic, such as gender or age


