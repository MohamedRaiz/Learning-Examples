package com.in28minutes.loops;

public class MyNumber {

	private int prime;
	private int sum = 0;

	public boolean isPrime(int chosen) {

		this.prime = chosen;
		for (int i = 2; i < this.prime; i++) {
			if (this.prime % i == 0) {
				this.sum += i;
			}
		}
		if (this.sum == 0) {
			return true;
		} else {
			return false;
		}

	}

	public int sumUptN() {

		int sumUp = 0;

		for (int i = 1; i <= this.prime; i++) {

			sumUp += i;
		}
		return sumUp;
	}

	public int sumofDivisorsNumbers() {
		return this.sum;
	}

	public void printNumberTriangle() {

		for (int i = 1; i <= this.prime; i++) {
			System.out.println("\n");
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " "); // without the ln in println, print on the same line
			}
		}
	}

}
