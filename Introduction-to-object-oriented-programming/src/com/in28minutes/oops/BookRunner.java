package com.in28minutes.oops;

public class BookRunner {

	public static void main(String[] args) {

		Book artofComputerProgramming = new Book(100);
		Book effectiveJava = new Book(200);
		Book cleanCode = new Book(300);

		// artofComputerProgramming.setNoOfCopies(100);
		artofComputerProgramming.increaseCopies(70);
		artofComputerProgramming.decreaseCopies(50);
		System.out.println(artofComputerProgramming.getNoOfCopies());
		// effectiveJava.setNoOfCopies(50);
		effectiveJava.increaseCopies(50);
		effectiveJava.decreaseCopies(20);
		System.out.println(effectiveJava.getNoOfCopies());
		// cleanCode.setNoOfCopies(45);
		cleanCode.increaseCopies(5);
		cleanCode.decreaseCopies(20);
		System.out.println(cleanCode.getNoOfCopies());
	}
}
