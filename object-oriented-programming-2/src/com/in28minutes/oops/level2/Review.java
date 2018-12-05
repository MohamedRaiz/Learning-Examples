package com.in28minutes.oops.level2;

public class Review {

	// states
	private int id;
	private String description;
	private int rating;

	// creation of constructor
	public Review(int id, String description, int rating) {
		this.id = id;
		this.description = description;
		this.rating = rating;
	}

	@Override
	public String toString() {
		return id + " " + description + " " + rating;

	}
}
