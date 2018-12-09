package com.fdmgroup.services;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.List;

import org.junit.Test;

import com.fdmgroup.data.Book;

public class CatalogueTest {

	@Test
	public void test_GetAllBooks_ReturnsEmptyBookList_IfNoBooksAreInTheCatalogue() {

		// Arrange
		ReadItemCommandObject mockReadItemCommandObject = mock(ReadItemCommandObject.class);
		Catalogue catalogue = new Catalogue(mockReadItemCommandObject);
		// Action
		List<Book> booksInCatalog = catalogue.getAllBooks();
		// Assert
		assertEquals(0, booksInCatalog.size());
	}

	// Test2
	@Test
	public void test_GetAllBooks_CallsReadAllMethodOfReadItemCommand_WhenCalled() {

		// Arrange

		ReadItemCommandObject mockReadItemCommandObject = mock(ReadItemCommandObject.class);
		Catalogue catalogue = new Catalogue(mockReadItemCommandObject);
		// Action
		catalogue.getAllBooks();
		// Assert
		verify(mockReadItemCommandObject, times(1)).readAll();

	}

	// Test3
	@Test
	public void test_GetAllBooks_ReturnsListOfBooksItReceivesFromReadAllMethodOfReadItemCommand_WhenCalled() {

		// Arrange

		ReadItemCommandObject mockReadItemCommandObject = mock(ReadItemCommandObject.class);
		Catalogue catalogue = new Catalogue(mockReadItemCommandObject);
		List<Book> mockListOfBook = mock(List.class);
		when(mockReadItemCommandObject.readAll()).thenReturn(mockListOfBook);

		// Action
		List<Book> bookList = catalogue.getAllBooks();
		// Assert
		assertEquals(bookList, mockListOfBook);
	}

	// Test4
	@Test
	public void test_AddBook_CallsInsertItemMethodOfWriteItemCommand_WhenCalled() {
		// Arrange
		Book book = new Book();
		WriteItemCommand writeItem = mock(WriteItemCommand.class);
		Catalogue catalogue = new Catalogue(writeItem);
		// Action
		catalogue.addBooks(book);
		// Assert
		verify(writeItem, times(1)).insertItem(book);

	}

	// Test5
	@Test
	public void test_AddBook_ShouldPassBookToInsertItemMethodOfWriteInCommand() {
		// Arrange

		WriteItemCommand writeItem = mock(WriteItemCommand.class);
		Catalogue catalogue = new Catalogue(writeItem);
		Book mockBook = mock(Book.class);
		// Action
		catalogue.addBooks(mockBook);
		catalogue.addBooks(mockBook);
		// Assert
		verify(writeItem, times(2)).insertItem(mockBook);
	}

}
