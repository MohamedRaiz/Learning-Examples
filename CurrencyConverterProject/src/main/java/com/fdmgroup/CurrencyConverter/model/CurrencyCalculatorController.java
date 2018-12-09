package com.fdmgroup.CurrencyConverter.model;

import java.util.InputMismatchException;
import java.util.Map;

public class CurrencyCalculatorController {

	public double currencyCalculatorMultiplication(Map<String, Currency> currencies, String choice, double amount) {
		double calculated = 0;

		try {
			if (currencies.get(choice) == null) {
				System.out.println("This currency does not exist");
			}

			else {
				calculated = currencies.get(choice).getRate() * amount;
			}

		} catch (InputMismatchException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		return calculated;
	}

	public double currencyCalculatorDivision(Map<String, Currency> currencies, String choice, double amount) {
		double calculated = 0;

		try {
			if (currencies.get(choice) == null) {
				System.out.println("This currency does not exist");
			}

			else {
				calculated = amount / currencies.get(choice).getRate();
			}

		} catch (InputMismatchException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		return calculated;
	}

}
