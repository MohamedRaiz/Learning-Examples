package com.fdmgroup.bankexercise.customer;

import java.util.ArrayList;
import java.util.List;

import com.fdmgroup.bankexercise.account.BusinessChecking;
import com.fdmgroup.bankexercise.account.BusinessSavings;

public class Company extends Customer implements SameAmountToAll {

	List<BusinessSavings> businessSavingAcc = new ArrayList<BusinessSavings>();
	List<BusinessChecking> businessCheckingAcc = new ArrayList<BusinessChecking>();

	public Company(String name, String Address) {
		super();
		this.name = name;
		this.address = Address;

	}

	@Override
	public String toString() {
		return "[Name=" + getName() + ", Address= " + getAddress() + ", CustomerId= " + setId() + ", TaxId= "
				+ getTaxIdNumber() + "]";
	}

	public void openSavingsAccount() {
		BusinessSavings companySavingsAcc = new BusinessSavings();
		int accountNum = companySavingsAcc.accountNumber;
		System.out.println("The Savings Account (" + accountNum + ") is opened.");
		businessSavingAcc.add(companySavingsAcc);
	}

	public double addMoney(double amount, int accountIndex) {
		System.out.println(
				"Adding " + amount + " to Account Number: " + businessSavingAcc.get(accountIndex).accountNumber);
		return businessSavingAcc.get(accountIndex).deposit(amount);

	}

	public double takeOutMoneyS(double amount, int accountIndex) {
		System.out.println(
				"Withdrawing " + amount + " from Account Number: " + businessSavingAcc.get(accountIndex).accountNumber);
		return businessSavingAcc.get(accountIndex).withdraw(amount, 'N');
	}

	public double changeInterest(double newInterest, int accountIndex) {
		return businessSavingAcc.get(accountIndex).changeInterestRate(newInterest);

	}

	public void openCheckingAccount() {
		BusinessChecking companyCheckingAcc = new BusinessChecking();
		int accountNum = companyCheckingAcc.accountNumber;
		System.out.println("The Checking Account (" + accountNum + ") is opened.");
		int checkNumber = CheckNum();// companyCheckingAcc.nextCheck();
		System.out.println("Current Check Number is at: " + checkNumber);
		businessCheckingAcc.add(companyCheckingAcc);
	}

	public double addMoneyC(double amount, int accountIndex) {
		System.out.println(
				"Adding " + amount + " to Account Number: " + businessCheckingAcc.get(accountIndex).accountNumber);
		return businessCheckingAcc.get(accountIndex).deposit(amount);
	}

	public double takeOutMoneyC(double amount, int accountIndex) {
		System.out.println("Withdrawing " + amount + " from Account Number: "
				+ businessCheckingAcc.get(accountIndex).accountNumber);
		return businessCheckingAcc.get(accountIndex).withdraw(amount, 'Y');
	}

	public void getSavingsAccount() {
		for (BusinessSavings businessSaving : businessSavingAcc) {
			businessSaving.getDetails();
		}
	}

	public void getCheckingAccount() {
		for (BusinessChecking businessChecking : businessCheckingAcc) {
			businessChecking.getDetails();
		}
	}

	public void addSameAmountToAll(int amountToBeAdded) {
		System.out.println("Adding " + amountToBeAdded + " into all Business Checking Account: ");
		for (BusinessChecking businessChecking : businessCheckingAcc) {
			double x = businessChecking.deposit(amountToBeAdded);
			System.out.println("The balance for " + businessChecking.accountNumber + " is: " + x);
		}
		System.out.println();
		System.out.println("Adding " + amountToBeAdded + " into all Business Savings Account: ");
		for (BusinessSavings businessSaving : businessSavingAcc) {
			double x1 = businessSaving.deposit(amountToBeAdded);
			System.out.println("The balance for " + businessSaving.accountNumber + " is: " + x1);
		}

	}

}
