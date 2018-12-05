package com.in28minutes.oops.level2.inheritance;

public class StudentWithoutInheritance {// inheritance helps us to reuse the code in the person class and create a new
						// class called students which only has the new things that it would want to
						// contain. so we would want to extend the person class and create a student
						// class and have a few additional attributes and methods that work

	private String name;
	private String email;
	private String phoneNumber;
//above states are present in person therefore alot of duplications. below 2 are the ones addition to Student
	private String college;
	private int year;

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

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

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
