package com.in28minutes.oops.level2;

public class RecipeWithMicrowave extends AbstractRecipe {

	@Override
	void getReady() {
		System.out.println("Get the raw materials");
		System.out.println("Switch on the microwave");

	}

	@Override
	void doTheDish() {
		System.out.println("Get things ready");
		System.out.println("Put into microwave");
	}

	@Override
	void cleanup() {
		System.out.println("Clean up everything");
		System.out.println("Switch off the microwave");
	}

}
