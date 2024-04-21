package com.xworkz.oraclelamda.four;

public class PersonDto {
	
	 private String name;
     private int age;
     private Sex gender;

     public enum Sex {
         MALE, FEMALE
     }

     public PersonDto(String name, int age, Sex gender) {
         this.name = name;
         this.age = age;
         this.gender = gender;
     }

     public String getName() {
         return name;
     }

     public int getAge() {
         return age;
     }

     public Sex getGender() {
         return gender;
     }

     public void printPerson() {
         System.out.println(name + ", " + age + " years old, " + gender);
     }
 }


