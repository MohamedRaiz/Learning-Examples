package com.fdmgroup.bankexercise.account;

public abstract class Account {

	protected int id = (int) (Math.random() * 100 + 1000);
	protected double balance = 0.0;

	public double deposit(double Amount) {
		return balance += Amount;
	}

	public double withdraw(double Amount, char check) {
		if (check == 'N') {
			if (balance - Amount < 0) {
				System.out.println("Not Possible");
				return balance;
			} else {
				return balance -= Amount;
			}
		} else {
			return balance -= Amount;
		}
	}
}
