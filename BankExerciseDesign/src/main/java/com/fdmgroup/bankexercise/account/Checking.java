package com.fdmgroup.bankexercise.account;

public abstract class Checking extends Account {

	private int currentCheckNumber;

	public int nextCheck() {
		this.currentCheckNumber = currentCheckNumber + 1;
		return this.currentCheckNumber;
	}

}
