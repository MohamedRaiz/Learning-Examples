package com.fdmgroup.bankexercise.account;

public class PersonalSavings extends Savings {

	public int accountNumber;
	public double balanceAccount = 0.0;

	public void Linking() {

		this.accountNumber = this.id;
		this.balance = this.balanceAccount;

	}

	public void Details() {
		System.out.println();
		System.out.println("This Saving Account Id is: " + this.id);
		System.out.println("Account Balance: " + this.balance);
	}

}
