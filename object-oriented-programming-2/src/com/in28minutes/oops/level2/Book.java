package com.in28minutes.oops.level2;

import java.util.ArrayList;

public class Book {

	// States
	private int id;
	private String name;
	private String author;
	private ArrayList<Review> reviews = new ArrayList<>();

	// Creation of Constructor
	public Book(int id, String name, String author) {
		this.id = id;
		this.name = name;
		this.author = author;
	}

	// Operations
	@Override
	public String toString() {
		return String.format("Book id is: [%d], Book name is: [%s], Book author is: [%s], Reviews are : %s", this.id,
				this.name, this.author, this.reviews);
	}

	public void addReview(Review review) {
		this.reviews.add(review);
	}

}
