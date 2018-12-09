package com.in28minutes.loops;

import java.util.Scanner;

public class MyNumberRunner {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		MyNumber number = new MyNumber();
		System.out.println("Enter a number: ");
		int chosen = scanner.nextInt();
		boolean isPrime = number.isPrime(chosen);
		System.out.println("IsPrime is " + isPrime);

		int sumUp = number.sumUptN();
		System.out.println("SumUpToN: " + sumUp);

		int sum = number.sumofDivisorsNumbers();
		System.out.println("SumDivisors: " + sum);

		number.printNumberTriangle();
	}
}
