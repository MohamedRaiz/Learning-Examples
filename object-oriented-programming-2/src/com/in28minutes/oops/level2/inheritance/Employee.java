package com.in28minutes.oops.level2.inheritance;

import java.math.BigDecimal;

public class Employee extends Person {
	// states
	private String title;
	private String employerName;
	private char emplyeeGrade;
	private BigDecimal salary;

	public Employee(String name, String title) {
		// super(); // as soon as you call the constructor, a super method constructor
		// call would
		// happen implicitly. If i explicitly call it, its fine. if not, java compiler
		// would automatically comes in.
		super(name); // we are doing. would call super class constructor with name. when you look at
						// person, no default constructor but a constructor with name.
		this.title = title;
		System.out.println("Employee Constructor");
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getEmployerName() {
		return employerName;
	}

	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}

	public char getEmplyeeGrade() {
		return emplyeeGrade;
	}

	public void setEmplyeeGrade(char emplyeeGrade) {
		this.emplyeeGrade = emplyeeGrade;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "#" + title + "#" + employerName + "#" + emplyeeGrade;// by adding the super.toString,
																						// it will take in the toString
																						// from the person class and add
																						// it to this one as well
	}
}
