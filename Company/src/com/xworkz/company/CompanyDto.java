package com.xworkz.company;

public class CompanyDto {
	
	private String companyName;
	private String location;
	private String industry;
	private String area;
	private int numberOfEmployees;
	public CompanyDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CompanyDto(String companyName, String location, String industry, String area, int numberOfEmployees) {
		super();
		this.companyName = companyName;
		this.location = location;
		this.industry = industry;
		this.area = area;
		this.numberOfEmployees = numberOfEmployees;
	}
	@Override
	public String toString() {
		return "CompanyDto [companyName=" + companyName + ", location=" + location + ", industry=" + industry
				+ ", area=" + area + ", numberOfEmployees=" + numberOfEmployees + "]";
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getIndustry() {
		return industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}
	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}
	
	
	
	
	

}
