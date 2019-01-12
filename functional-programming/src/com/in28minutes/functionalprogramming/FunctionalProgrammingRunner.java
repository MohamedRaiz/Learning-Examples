package com.in28minutes.functionalprogramming;

import java.util.List;

public class FunctionalProgrammingRunner {

	public static void main(String[] args) {
		List<String> list = List.of("Apple", "Bat", "Cat", "Dog");

		printFPWithFiltering(list);

	}

	private static void printBasic(List<String> list) {
		for (String list1 : list) {
			System.out.println(list1);
		}
	}

	private static void printFP(List<String> list) {
		list.stream().forEach(element -> System.out.println(element)); // what this means is, for each element in this
																		// stream
																		// list, do a sysout on elements. so instead of
																		// looping in printBasic method, we are
																		// converting the list into a stream. -> is the
																		// lambda expression

	}

	private static void printBasicWithFiltering(List<String> list) {
		for (String list1 : list) {
			if (list1.endsWith("at")) {
				System.out.println(list1);
			}
		}
	}

	private static void printFPWithFiltering(List<String> list) {
		list.stream().filter(element -> element.endsWith("at"))// the use of filter, is the logic. if it is true, it
																// will send to forEach. else it just ignores

				.forEach(element -> System.out.println(element));

	}

}
