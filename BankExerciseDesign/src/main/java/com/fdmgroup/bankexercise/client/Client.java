package com.fdmgroup.bankexercise.client;

import com.fdmgroup.bankexercise.customer.Company;
import com.fdmgroup.bankexercise.customer.Person;

public class Client {

	public static void main(String[] args) {
		System.out.println("\n");
		System.out.println("---------------------------------------------------------------");
		System.out.println("\tChecking Person Savings Account Below:  ");
		System.out.println("---------------------------------------------------------------");
		System.out.println("\n");
		Person person1 = new Person("John", "Lor Melayu");
		System.out.println(person1.toString());
		Person person2 = new Person("John", "Lor Melayu");
		System.out.println(person2.toString());
		person1.openSavingsAccount();
		person1.openSavingsAccount();
		double x = person1.addMoney(2000.0, 0);
		System.out.println("Balance Now is: " + x + "\n");
		double y = person1.takeOutMoneyS(200.0, 0);
		System.out.println("Balance Now is: " + y + "\n");
		person1.resetBalance();
		double x1 = person1.addMoney(2000.0, 0);
		System.out.println("Balance Now is: " + x1 + "\n");
		double interest = person1.changeInterest(3.0, 0);
		System.out.println("Current interest is set to: " + interest + " %");
		System.out.println();
		System.out.println("Summary of Accounts: ");
		person1.getSavingsAccount();

		System.out.println("\n");
		System.out.println("---------------------------------------------------------------");
		System.out.println("\tChecking Person Current Account Below:  ");
		System.out.println("---------------------------------------------------------------");
		System.out.println("\n");

		person1.openCheckingAccount();
		person1.openCheckingAccount();
		double xc = person1.addMoneyC(2000.0, 0);
		System.out.println("Balance Now is: " + xc + "\n");
		double yc = person1.takeOutMoneyC(20000.0, 0);
		System.out.println("Balance Now is: " + yc + "\n");

		System.out.println();
		System.out.println("Summary of Accounts: ");

		person1.getCheckingAccount();

		System.out.println("\n");
		System.out.println("---------------------------------------------------------------");
		System.out.println("\tChecking Company Saving Account Below:  ");
		System.out.println("---------------------------------------------------------------");
		System.out.println("\n");

		Company company1 = new Company("Rolls-Royce", "Seletar Rd");
		System.out.println(company1.toString());
		company1.openSavingsAccount();
		company1.openSavingsAccount();
		double c1 = company1.addMoney(5000.0, 1);
		System.out.println("Balance Now is: " + c1 + "\n");
		double c2 = company1.takeOutMoneyS(2300.0, 1);
		System.out.println("Balance Now is: " + c2 + "\n");
		double c3 = company1.addMoney(300.0, 0);
		System.out.println("Balance Now is: " + c3 + "\n");
		double interestC = company1.changeInterest(3.0, 0);
		System.out.println("Current interest is set to: " + interestC + " %");

		System.out.println("\n");
		System.out.println("---------------------------------------------------------------");
		System.out.println("\tChecking Company Current Account Below:  ");
		System.out.println("---------------------------------------------------------------");
		System.out.println("\n");

		company1.openCheckingAccount();
		company1.openCheckingAccount();
		double cc1 = company1.addMoneyC(2000.0, 1);
		System.out.println("Balance Now is: " + cc1 + "\n");
		double cc2 = company1.takeOutMoneyC(20000.0, 0);
		System.out.println("Balance Now is: " + cc2 + "\n");

		System.out.println("\n");
		System.out.println("---------------------------------------------------------------");
		System.out.println("\tMass Add to Company Accounts Below:  ");
		System.out.println("---------------------------------------------------------------");
		System.out.println("\n");

		company1.addSameAmountToAll(300);

		System.out.println();
		System.out.println("Summary of Accounts: ");

		company1.getSavingsAccount();
		company1.getCheckingAccount();
	}
}
