package com.fdmgroup.bankexercise.customer;

import java.util.ArrayList;
import java.util.List;
import com.fdmgroup.bankexercise.account.*;

public class Person extends Customer implements BalanceResettable {

	List<PersonalSavings> personalSavingAcc = new ArrayList<PersonalSavings>();
	List<PersonalChecking> personalCheckingAcc = new ArrayList<PersonalChecking>();

	@Override
	public String toString() {
		return "[Name=" + getName() + ", Address= " + getAddress() + ", CustomerId= " + setId() + ", TaxId= "
				+ getTaxIdNumber() + "]";
	}

	public Person(String name, String Address) {
		super();
		this.name = name;
		this.address = Address;

	}

	public void openSavingsAccount() {
		PersonalSavings personSavingsAcc = new PersonalSavings();
		personSavingsAcc.Linking();
		int accountNum = personSavingsAcc.accountNumber;
		System.out.println("The Savings Account (" + accountNum + ") is opened.");
		personalSavingAcc.add(personSavingsAcc);
	}

	public double addMoney(double amount, int accountIndex) {
		System.out.println(
				"Adding " + amount + " to Account Number: " + personalSavingAcc.get(accountIndex).accountNumber);
		return personalSavingAcc.get(accountIndex).deposit(amount);

	}

	public double takeOutMoneyS(double amount, int accountIndex) {
		System.out.println(
				"Withdrawing " + amount + " from Account Number: " + personalSavingAcc.get(accountIndex).accountNumber);
		return personalSavingAcc.get(accountIndex).withdraw(amount, 'N');
	}

	public double changeInterest(double newInterest, int accountIndex) {
		return personalSavingAcc.get(accountIndex).changeInterestRate(newInterest);

	}

	public void openCheckingAccount() {
		PersonalChecking personCheckingAcc = new PersonalChecking();
		int accountNum = personCheckingAcc.accountNumber;
		System.out.println("The Checking Account (" + accountNum + ") is opened.");
		// int checkNumber = personCheckingAcc.nextCheck();
		int checkNumber = CheckNum();
		System.out.println("Current Check Number is at: " + checkNumber);
		personalCheckingAcc.add(personCheckingAcc);
	}

	public double addMoneyC(double amount, int accountIndex) {
		System.out.println(
				"Adding " + amount + " to Account Number: " + personalCheckingAcc.get(accountIndex).accountNumber);
		return personalCheckingAcc.get(accountIndex).deposit(amount);
	}

	public double takeOutMoneyC(double amount, int accountIndex) {
		System.out.println("Withdrawing " + amount + " from Account Number: "
				+ personalCheckingAcc.get(accountIndex).accountNumber);
		return personalCheckingAcc.get(accountIndex).withdraw(amount, 'Y');
	}

	public void getSavingsAccount() {
		for (PersonalSavings personalSave : personalSavingAcc) {
			personalSave.Details();
		}
	}

	public void getCheckingAccount() {
		for (PersonalChecking personalChecking : personalCheckingAcc) {
			personalChecking.Details();
		}
	}

	public void resetBalance() {
		System.out.println("Resetting All Accounts..........");
		for (PersonalSavings personSaving : personalSavingAcc) {
			personSaving.Linking();

		}
	}

}
