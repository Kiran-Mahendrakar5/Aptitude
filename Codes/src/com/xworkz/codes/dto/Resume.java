package com.xworkz.codes.dto;

public class Resume implements Comparable<Resume> {
	
	private String email;
	private String name;

	public Resume() {
		super();
		// TODO Auto-generated constructor stub
	}
		public Resume(String email, String name) {
			super();
			this.email = email;
			this.name = name;
		}

		@Override
		public String toString() {
			return "Resume [email=" + email + ", name=" + name + "]";
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		


	@Override
	public int compareTo(Resume o) {
		
		return this.email.compareTo(o.email);
	}
	
	

}
