package com.fdmgroup.CurrencyConverter.client;

import java.util.Map;
import java.util.Scanner;

import com.fdmgroup.CurrencyConverter.Controller.XmlDownloader;
import com.fdmgroup.CurrencyConverter.model.Currency;
import com.fdmgroup.CurrencyConverter.model.CurrencyCalculatorController;
import com.fdmgroup.CurrencyConverter.model.Parsing;

public class CurrencyConverterClient {

	public static void main(String[] args) {
		Parsing parsing = new Parsing();
		Map<String, Currency> currencies = parsing.ParsingXmlFile();
		Scanner scanner = new Scanner(System.in);
		System.out.println("----------------------------------------------------------------");
		System.out.println("\tWelcome to the Currency Converter!!");
		System.out.println("----------------------------------------------------------------");
		System.out.println("Currency Available below: ");
		System.out.println(currencies.values());
		System.out.println("1. To another currency");
		System.out.println("2. Convert to Euros");
		int convertChoice = scanner.nextInt();
		scanner.nextLine();
		XmlDownloader xmlDownloader = new XmlDownloader();
		xmlDownloader.savingXmlFile();

		CurrencyCalculatorController controller = new CurrencyCalculatorController();

		switch (convertChoice) {
		case 1:
			System.out.println("Choose a Currency of your choice: ");
			String eurToOthersChoice = scanner.nextLine().toUpperCase();
			System.out.println("How much do you want to change?");
			double eurToOthersAmount = scanner.nextDouble();

			// System.out.println(currencies.get(choice) * amount);
			double x = controller.currencyCalculatorMultiplication(currencies, eurToOthersChoice, eurToOthersAmount);
			System.out.println(x);
			break;
		case 2:
			System.out.println("Choose a Currency of your choice: ");
			String otherToEurChoice = scanner.nextLine().toUpperCase();
			System.out.println("How much do you want to change?");
			double otherToEurAmount = scanner.nextDouble();

			// System.out.println(currencies.get(choice) * amount);
			double y = controller.currencyCalculatorDivision(currencies, otherToEurChoice, otherToEurAmount);
			System.out.println(y);
			break;
		}

	}

}
