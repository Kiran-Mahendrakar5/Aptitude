package com.xworkz.oraclelamda.seven;

public class PersonDto {
	
	 private String name;
	    private int age;
	    private Sex gender;
	    private String emailAddress; // Add emailAddress field

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

	    public String getEmailAddress() { // Add getEmailAddress method
	        return emailAddress;
	    }

	    public void setEmailAddress(String emailAddress) { // Add setEmailAddress method
	        this.emailAddress = emailAddress;
	    }

	    public void printPerson() {
	        System.out.println(name + ", " + age + " years old, " + gender);
	    }
	

}
