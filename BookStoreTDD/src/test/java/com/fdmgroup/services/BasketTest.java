package com.fdmgroup.services;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.fdmgroup.data.Book;

public class BasketTest {

	@Test
	public void test_GetBooksInBasket_ReturnsEmptyBookList_IfNoBooksHaveBeenAdded() {
		//Arrange
		Basket basket = new Basket();
		
		//Act
		List<Book> booksInBasket = basket.getBooksInBasket();
		//Assert
		assertEquals(0, booksInBasket.size());
		
		
	}
	//Second Test
	@Test
	public void test_GetBooksInBasket_ReturnsArrayOfLengthOne_AfterAddBookMethodisCalledWithOneBook() {
		
		//Arrange
		Basket basket = new Basket();
		Book book = new Book();
		//Act
		basket.addBook(book);
		//Assert
		List<Book> booksInBasket = basket.getBooksInBasket();
		assertEquals(1, booksInBasket.size());
	}
	
	//Test3
	@Test
	public void test_GetBooksInBasket_ReturnsArrayOfLengthOne_AfterAddBookMethodisCalledWithTwoBook() {
		
		//Arrange
		Basket basket = new Basket();
		Book book = new Book();
		Book book2 = new Book();
		//Act
		basket.addBook(book);
		basket.addBook(book2);
		//Assert
		List<Book> booksInBasket = basket.getBooksInBasket();
		assertEquals(2, booksInBasket.size());
	}
	
	
}


