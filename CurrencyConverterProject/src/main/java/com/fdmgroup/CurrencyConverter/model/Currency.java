package com.fdmgroup.CurrencyConverter.model;

public class Currency {

	@Override
	public String toString() {
		return "[name=" + name + ", rate=" + rate + "]";
	}

	private String name;
	private double rate;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(Double rate) {
		this.rate = rate;
	}

}
