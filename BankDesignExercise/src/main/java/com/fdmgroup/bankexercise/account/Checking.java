package com.fdmgroup.bankexercise.account;

abstract class Checking extends Account {

	private int currentCheckNumber;

	public int nextCheck() {

		return currentCheckNumber += 1;
	}

}
