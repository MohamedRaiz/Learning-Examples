package com.fdmgroup.services;

import com.fdmgroup.data.Book;

public interface WriteItemCommand {

	void insertItem(Book book);

}
