package com.xworkz.collectionssexp.dto;

import java.io.Serializable;
import java.util.List;

public class ResumeDto implements Serializable,Comparable<ResumeDto>{
	
	
	private String name;
	private String email;
	private List<String> branches;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<String> getBranches() {
		return branches;
	}

	public void setBranches(List<String> branches) {
		this.branches = branches;
	}

	@Override
	public String toString() {
		return "ResumeDto [name=" + name + ", email=" + email + ", branches=" + branches + "]";
	}

	public ResumeDto(String name, String email, List<String> branches) {
		super();
		this.name = name;
		this.email = email;
		this.branches = branches;
	}

	public ResumeDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(ResumeDto arg0) {
		
		return this.getEmail().compareTo(arg0.email);
		
	}
	
	
	
	

}
