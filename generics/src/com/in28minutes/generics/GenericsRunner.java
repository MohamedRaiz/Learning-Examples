package com.in28minutes.generics;

import java.util.ArrayList;
import java.util.List;

import com.in28minutes.generics.MyCustomList;

public class GenericsRunner {

	static <X> X doubleValue(X value) { // Type is X, accepting the value of the same type, and returning the value of
										// // the same type.
		return value;
	}

	static <X extends List> void duplicateList(X list) {// this way, anything implementing list, i will be able to use
		list.addAll(list); // it. void is the return type. All the elements in the list would be duplicated
							// with the addAll step. this works for linkedlist, arraylist, etc.. any class
							// which extends list can use.
	}

	static double sumOfNumberList(List<? extends Number> numbers) {

		double sum = 0.0;
		for (Number number : numbers) {
			sum += number.doubleValue();

		}
		return sum;
	}
	// inside bracket means, accept any list that extends number class. the ? is
	// called a wildcard. any list of type extending number class is a valid list.
	// can be passed as a parameter

	static void addACoupleOfValues(List<? super Number> numbers) { // this is called a lowerbound wildcard with the use
																	// of super

		numbers.add(1);
		numbers.add(1.0);
		numbers.add(1.0f);
		numbers.add(1l);

	}

	public static void main(String[] args) {
		List emptyList = new ArrayList<Number>();
		addACoupleOfValues(emptyList);
		System.out.println(emptyList);

		System.out.println(sumOfNumberList(List.of(1, 2, 3, 4, 5)));
		System.out.println(sumOfNumberList(List.of(1.1, 2.2, 3.1, 4.1, 5.1)));
		System.out.println(sumOfNumberList(List.of(1l, 2l, 3l, 4l, 5l)));

		String value1 = doubleValue(new String());
		Integer number1 = doubleValue(Integer.valueOf(5));
		ArrayList list1 = doubleValue(new ArrayList());

		ArrayList<Integer> numbers = new ArrayList<Integer>(List.of(1, 2, 3));
		duplicateList(numbers);
		System.out.println(numbers);

		MyCustomList<String> list = new MyCustomList<String>();
		list.addElement("Element 1");
		list.addElement("Element 2");
		String value = list.get(0);

		System.out.println(value);

		MyCustomList<Integer> list2 = new MyCustomList<Integer>();
		list2.addElement(Integer.valueOf(5));
		list2.addElement(Integer.valueOf(7));
		Integer number = list2.get(0);

		System.out.println(number);
	}

}
