package com.fdmgroup.services;

public class Checkout {
	private double total = 0.0;
	private int size;

	double calculatePrice(Basket basket) {
		this.size = basket.getBooksInBasket().size();
		for (int i = 0; i < basket.getBooksInBasket().size(); i++) {
			this.total += basket.getBooksInBasket().get(i).getPrice();
		}
		if (size == 0) {
			return 0.0;
		} else if (size >= 1 && size < 3) {
			return this.total;
		} else if (size >= 3 && size < 7) {
			return (this.total * 0.99);
		} else if (size >= 7 && size < 10) {
			return (this.total * 0.98);
		} else {
			System.out.println(this.total * 0.87);
			return (this.total * 0.87);

		}
	}

}
