package com.fdmgroup.bankexercise.account;

public class BusinessChecking extends Checking {

	public int accountNumber = this.id;

	public void getDetails() {

		System.out.println();
		System.out.println("This Checking Account Id is: " + this.id);
		System.out.println("Account Balance: " + this.balance);
	}

}
