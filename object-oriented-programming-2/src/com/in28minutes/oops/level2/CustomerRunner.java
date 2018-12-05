package com.in28minutes.oops.level2;

public class CustomerRunner {

	public static void main(String[] args) {
		Address homeAddress = new Address("Lor Melayu", "Singapore", "416919");
		Customer customer = new Customer("Raiz", homeAddress);

		customer.setWorkAddress(new Address("Orchard", "Singapore", "234529")); // can do this way instead of
																				// instantiating workAddress also.
																				// another way
		System.out.println(customer);

	}

}
