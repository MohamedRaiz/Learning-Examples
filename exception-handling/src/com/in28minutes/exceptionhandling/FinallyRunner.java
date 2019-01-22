package com.in28minutes.exceptionhandling;

import java.util.Scanner;

public class FinallyRunner {

	public static void main(String[] args) {
		Scanner scanner = null;

		try {
			scanner = new Scanner(System.in);

			int[] numbers = { 12, 3, 4, 5 };
			int number = numbers[5];// this i an exception

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			System.out.println("Before Scanner Close");
			// This is to prevent memory leak if large amounts of data is being taken into
			// consideration. Therefore to ensure a scanner.close is always called
			// irregardless is via the finally block
			if (scanner != null) {
				scanner.close(); // this way, if there is sth in scanner, it will close. if the exception is at
									// the scanner, there is no need to close
			}

		}
		System.out.println("Just before closing out main");

	}

}
