package com.fdmgroup.bankexercise.customer;

abstract class Customer {

	protected static int id = 1999993;
	protected String name;
	protected String address;
	protected int taxIdNumber = (int) (Math.random() * 100 + 1000);;
	protected static int Cnum;

	public int CheckNum() {
		return Customer.Cnum += 1;
	}

	public int getId() {
		return id;
	}

	public int setId() {
		return Customer.id += 7;

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
