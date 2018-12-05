package com.in28minutes.oops.level2;

public class Address {
	// states
	private String line1;
	private String city;
	private String zip;

	// creation of constructor

	public Address(String line1, String city, String zip) {
		super();
		this.line1 = line1;
		this.city = city;
		this.zip = zip;
	}

	@Override
	public String toString() {
		return line1 + ", " + city + ", " + zip;
	}

}
