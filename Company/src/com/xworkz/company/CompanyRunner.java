package com.xworkz.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CompanyRunner {

	public static void main(String[] args) {

		List<CompanyDto> companies = new ArrayList<>();
		companies.add(new CompanyDto("Oracle.", "Marathhalli", "IT", "North", 200));
		companies.add(new CompanyDto("Lumen.", "Sarjapura", "Finance", "South", 300));
		companies.add(new CompanyDto("Karishya.", "JpNagar", "Automobile", "EastEnd", 150));
		companies.add(new CompanyDto("TalentQuest", "Itpl", "Healthcare", "West", 600));

		System.out.println("========================Filter===========================");
		CompanyDto foundCompany = companies.stream().filter(company -> company.getLocation().equals("Sarjapura"))
				.findFirst().orElse(null);
		System.out.println("Found Company: " + foundCompany);

		System.out.println("========================Sorted===========================");
		companies.stream().sorted(Comparator.comparingInt(CompanyDto::getNumberOfEmployees))
				.forEach(System.out::println);

		System.out.println("========================Map===========================");
		List<String> companyNames = companies.stream().map(CompanyDto::getCompanyName).collect(Collectors.toList());
		System.out.println("Company Names: " + companyNames);

		System.out.println("========================Max===========================");
		int maxEmployees = companies.stream().mapToInt(CompanyDto::getNumberOfEmployees).max().orElse(0);

		System.out.println("Maximum Employees: " + maxEmployees);

		System.out.println("=========================Min================================");

		int minEmployees = companies.stream().mapToInt(CompanyDto::getNumberOfEmployees).min().orElse(0);

		System.out.println("Minimum Employees: " + minEmployees);

		System.out.println("========================findAny===========================");

		Optional<CompanyDto> companyOptional = companies.stream().filter(company -> company.getIndustry().equals("IT"))
				.findAny();
		companyOptional.ifPresent(company -> System.out.println("Found IT Company: " + company));

	}

}
