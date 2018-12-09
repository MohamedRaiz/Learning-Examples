package com.fdmgroup.services;

import java.util.ArrayList;
import java.util.List;

import com.fdmgroup.data.Book;

public class Basket {
	
	
	ArrayList<Book> books = new ArrayList<Book>();
	
	
	public List<Book> getBooksInBasket() {
		return books;

	}
	
	public void addBook(Book book) {
		books.add(book);
	}
	
	
}
