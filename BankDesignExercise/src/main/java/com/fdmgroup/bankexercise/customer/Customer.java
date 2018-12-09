package com.fdmgroup.bankexercise.customer;

abstract class Customer {

	protected int id = 2000000;
	protected String name;
	protected String address;
	protected int taxIdNumber;

	public int getId() {
		return id;
	}

	public void setId() {
		this.id += 7;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getTaxIdNumber() {
		return taxIdNumber;
	}

	public void setTaxIdNumber(int taxIdNumber) {
		this.taxIdNumber = taxIdNumber;
	}

}
