package com.in28minutes.oops;

public class Book {

	private int noOfCopies;

	Book(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}

	void setNoOfCopies(int noOfCopies) {
		this.noOfCopies = noOfCopies;
		// System.out.println(this.noOfCopies);
	}

	int getNoOfCopies() {
		return this.noOfCopies;
	}

	void increaseCopies(int increase) {
		setNoOfCopies(this.noOfCopies + increase);
	}

	void decreaseCopies(int decrease) {
		setNoOfCopies(this.noOfCopies - decrease);
	}

}
