package com.in28minutes.oops.level2;

public class BookRunner {

	public static void main(String[] args) {
		Book book = new Book(123, "Object Oriented Programming", "Raiz");
		book.addReview(new Review(10, "Great Book", 5));// Add review needs an argument of review. and review needs 3
														// arguments for its constructor. therefore, new review gives a
														// type of review with 3 arguments inside. removes the need to
														// instantiate
		System.out.println(book);

	}

}
