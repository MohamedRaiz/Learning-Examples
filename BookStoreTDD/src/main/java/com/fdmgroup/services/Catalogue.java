package com.fdmgroup.services;

import java.util.ArrayList;
import java.util.List;

import com.fdmgroup.data.Book;

public class Catalogue {

	ReadItemCommandObject readItem;
	WriteItemCommand writeItemCommand;
	ArrayList<Book> books = new ArrayList<Book>();

	public List<Book> getAllBooks() {
		return this.readItem.readAll();

	}

	public Catalogue(ReadItemCommandObject ReadItemCommandObject) {
		this.readItem = ReadItemCommandObject;
	}

	public Catalogue(WriteItemCommand WriteItem) {
		this.writeItemCommand = WriteItem;
	}

	public void addBooks(Book book) {
		this.writeItemCommand.insertItem(book);
	}

}
