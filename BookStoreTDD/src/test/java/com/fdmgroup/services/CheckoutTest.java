package com.fdmgroup.services;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.fdmgroup.data.Book;

public class CheckoutTest {

	@Test
	public void test_CalculatePrice_ReturnsDoubleZeroPointZeroWhenPassedAnEmptyBasket() {
		// Arrange
		Basket basket = new Basket();
		Checkout checkout = new Checkout();
		// Act
		double price = checkout.calculatePrice(basket);
		// Assert
		assertEquals(0.0, price, 0.1);
	}

	// Test2
	@Test
	public void test_CalculatePrice_ReturnsPriceOfBookInBasket_WhenPassedBasketWithOneBook() {
		// Arrange
		Basket basket = new Basket();
		Checkout checkout = new Checkout();
		Book book = new Book();
		// Act
		book.setPrice(25.0);
		double bookPrice = book.getPrice();
		basket.addBook(book);
		double price = checkout.calculatePrice(basket);
		// Assert
		assertEquals(bookPrice, price, 0.1);
	}

	// Test3
	@Test
	public void test_CalculatePrice_ReturnsPriceOfBookInBasket_WhenPassedBasketWithTwoBook() {
		// Arrange
		Basket basket = new Basket();
		Checkout checkout = new Checkout();
		Book book = new Book();
		Book book2 = new Book();
		// Act
		book.setPrice(25.0);
		double bookPrice = book.getPrice();
		book2.setPrice(37.0);
		double bookPrice2 = book2.getPrice();
		basket.addBook(book);
		basket.addBook(book2);
		double totalPrice = bookPrice + bookPrice2;
		double price = checkout.calculatePrice(basket);
		// Assert
		assertEquals(totalPrice, price, 0.1);
	}

	// Test4
	@Test
	public void test_CalculatePrice_ReturnsPriceOfBookInBasket_WhenPassedBasketWithThreeBook() {
		// Arrange
		Basket basket = new Basket();
		Checkout checkout = new Checkout();
		Book book = new Book();
		Book book2 = new Book();
		Book book3 = new Book();
		// Act
		book.setPrice(25.99);
		double bookPrice = book.getPrice();
		book2.setPrice(25.99);
		double bookPrice2 = book2.getPrice();
		book3.setPrice(25.99);
		double bookPrice3 = book3.getPrice();
		basket.addBook(book);
		basket.addBook(book2);
		basket.addBook(book3);
		double totalPriceWithDiscount = (bookPrice + bookPrice2 + bookPrice3) * 0.99;
		double price = checkout.calculatePrice(basket);
		// Assert
		assertEquals(totalPriceWithDiscount, price, 0.0001);
	}

	// Test5
	@Test
	public void test_CalculatePrice_ReturnsPriceOfBookInBasket_WhenPassedBasketWithSevenBook() {
		// Arrange
		Basket basket = new Basket();
		Checkout checkout = new Checkout();
		Book book = new Book();
		Book book2 = new Book();
		Book book3 = new Book();
		Book book4 = new Book();
		Book book5 = new Book();
		Book book6 = new Book();
		Book book7 = new Book();
		// Act
		book.setPrice(25.99);
		double bookPrice = book.getPrice();
		book2.setPrice(25.99);
		double bookPrice2 = book2.getPrice();
		book3.setPrice(25.99);
		double bookPrice3 = book3.getPrice();
		book4.setPrice(25.99);
		double bookPrice4 = book4.getPrice();
		book5.setPrice(25.99);
		double bookPrice5 = book5.getPrice();
		book6.setPrice(25.99);
		double bookPrice6 = book6.getPrice();
		book7.setPrice(25.99);
		double bookPrice7 = book7.getPrice();
		basket.addBook(book);
		basket.addBook(book2);
		basket.addBook(book3);
		basket.addBook(book4);
		basket.addBook(book5);
		basket.addBook(book6);
		basket.addBook(book7);
		double totalPriceWithDiscount = (bookPrice + bookPrice2 + bookPrice3 + bookPrice4 + bookPrice5 + bookPrice6
				+ bookPrice7) * 0.98;
		double price = checkout.calculatePrice(basket);
		// Assert
		assertEquals(totalPriceWithDiscount, price, 0.0001);
	}

	// Test6
	@Test
	public void test_CalculatePrice_ReturnsPriceOfBookInBasket_WhenPassedBasketWithTenBook() {
		// Arrange
		Basket basket = new Basket();
		Checkout checkout = new Checkout();
		Book book = new Book();
		Book book2 = new Book();
		Book book3 = new Book();
		Book book4 = new Book();
		Book book5 = new Book();
		Book book6 = new Book();
		Book book7 = new Book();
		Book book8 = new Book();
		Book book9 = new Book();
		Book book10 = new Book();
		// Act
		book.setPrice(25.99);
		double bookPrice = book.getPrice();
		book2.setPrice(25.99);
		double bookPrice2 = book2.getPrice();
		book3.setPrice(25.99);
		double bookPrice3 = book3.getPrice();
		book4.setPrice(25.99);
		double bookPrice4 = book4.getPrice();
		book5.setPrice(25.99);
		double bookPrice5 = book5.getPrice();
		book6.setPrice(25.99);
		double bookPrice6 = book6.getPrice();
		book7.setPrice(25.99);
		double bookPrice7 = book7.getPrice();
		book8.setPrice(25.99);
		double bookPrice8 = book8.getPrice();
		book9.setPrice(25.99);
		double bookPrice9 = book9.getPrice();
		book10.setPrice(25.99);
		double bookPrice10 = book10.getPrice();
		basket.addBook(book);
		basket.addBook(book2);
		basket.addBook(book3);
		basket.addBook(book4);
		basket.addBook(book5);
		basket.addBook(book6);
		basket.addBook(book7);
		basket.addBook(book8);
		basket.addBook(book9);
		basket.addBook(book10);
		double totalPriceWithDiscount = (bookPrice + bookPrice2 + bookPrice3 + bookPrice4 + bookPrice5 + bookPrice6
				+ bookPrice7 + bookPrice8 + bookPrice9 + bookPrice10) * 0.87;
		double price = checkout.calculatePrice(basket);
		// Assert
		assertEquals(totalPriceWithDiscount, price, 0.0001);
	}

	// Bonus QS
	@Test
	public void test_CalculatePrice_ReturnsPriceOfBookInBasket_WhenPassedBasketWithMultipleBook() {
		// Arrange
		Basket basket = new Basket();
		Checkout checkout = new Checkout();
		Book book = new Book();
		Book book2 = new Book();
		Book book3 = new Book();
		Book book4 = new Book();
		Book book5 = new Book();
		Book book6 = new Book();
		Book book7 = new Book();
		Book book8 = new Book();
		Book book9 = new Book();
		Book book10 = new Book();
		// Act
		book.setPrice(25.99);
		double bookPrice = book.getPrice();
		book2.setPrice(25.99);
		double bookPrice2 = book2.getPrice();
		book3.setPrice(25.99);
		double bookPrice3 = book3.getPrice();
		book4.setPrice(25.99);
		double bookPrice4 = book4.getPrice();
		book5.setPrice(25.99);
		double bookPrice5 = book5.getPrice();
		book6.setPrice(25.99);
		double bookPrice6 = book6.getPrice();
		book7.setPrice(25.99);
		double bookPrice7 = book7.getPrice();
		book8.setPrice(25.99);
		double bookPrice8 = book8.getPrice();
		book9.setPrice(25.99);
		double bookPrice9 = book9.getPrice();
		book10.setPrice(25.99);
		double bookPrice10 = book10.getPrice();
		basket.addBook(book);
		basket.addBook(book2);
		basket.addBook(book3);
		basket.addBook(book4);
		basket.addBook(book5);
		basket.addBook(book6);
		basket.addBook(book7);
		basket.addBook(book8);
		basket.addBook(book9);
		basket.addBook(book10);
		double totalPriceWithDiscount = (bookPrice + bookPrice2 + bookPrice3 + bookPrice4 + bookPrice5 + bookPrice6
				+ bookPrice7 + bookPrice8 + bookPrice9 + bookPrice10) * 0.87;
		double price = checkout.calculatePrice(basket);
		// Assert
		assertEquals(totalPriceWithDiscount, price, 0.0001);
	}
}
