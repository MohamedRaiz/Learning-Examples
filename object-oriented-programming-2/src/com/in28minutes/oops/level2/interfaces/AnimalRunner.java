package com.in28minutes.oops.level2.interfaces;

public class AnimalRunner {

	public static void main(String[] args) {

		Animal[] animals = { new Cat(), new Dog() };
		for (Animal animal : animals) {
			animal.bark();
		}

	}
}

abstract class Animal {
	abstract void bark();

}

class Dog extends Animal {

	@Override
	public void bark() {
		System.out.println("Bow Bow");
	}
}

class Cat extends Animal {

	@Override
	public void bark() {
		System.out.println("Meow Meow");
	}
}
