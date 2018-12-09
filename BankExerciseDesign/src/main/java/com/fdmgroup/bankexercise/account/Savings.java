package com.fdmgroup.bankexercise.account;

abstract class Savings extends Account implements InterestRateChangeable {

	private double interestRate = 0.0;

	public double changeInterestRate(double newInterest) {
		return this.interestRate = newInterest;
	};

}
