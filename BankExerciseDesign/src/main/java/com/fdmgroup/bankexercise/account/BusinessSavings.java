package com.fdmgroup.bankexercise.account;

public class BusinessSavings extends Savings {

	public int accountNumber = this.id;

	public void getDetails() {

		System.out.println();
		System.out.println("This Saving Account Id is: " + this.id);
		System.out.println("Account Balance: " + this.balance);
	}
}
