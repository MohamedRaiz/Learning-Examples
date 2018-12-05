package com.in28minutes.oops.level2;

public class Customer {

	// states
	private String name;
	private Address homeAddress;// customer object contains an address. this is object composition. cuz contains
	// an instance of the address object.
	private Address workAddress;

	// creation of constructor
	public Customer(String name, Address homeAddress) {
		this.name = name;
		this.homeAddress = homeAddress;
	}

	// Operations

	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	public Address getWorkAddress() {
		return workAddress;
	}

	public void setWorkAddress(Address workAddress) {
		this.workAddress = workAddress;
	}

	@Override
	public String toString() {
		return String.format("Name is : %s, Home Address is [%s], Work Address is [%s]", name, homeAddress,
				workAddress);
	}

}
