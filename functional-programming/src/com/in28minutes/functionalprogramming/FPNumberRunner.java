package com.in28minutes.functionalprogramming;

import java.util.List;

public class FPNumberRunner {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(4, 6, 8, 13, 3, 15);
		// numbers.stream().forEach(element -> System.out.println(element));

		// FP way
		int sum = fpSum(numbers); // the reduce function works to
																						// reduce the list of elements
																						// to 1 element. it takes in 2
																						// parameters, 1st is the
																						// starting value, 2nd is a pair
																						// of values(Thus, need an
																						// additional parenthesis
																						// around. So it starts with 0,4
																						// and adds them so you get 4.
																						// then it tkaes 4,6 which gives
																						// 10. then add 10,6.. so on and
																						// so forth

		// int sum = normalSum(numbers);

		// lets say we want to sum the odd numbers only.
		int sumOdd = numbers.stream().filter(element -> element % 2 == 1).reduce(0,
				(number1, number2) -> number1 + number2);
		System.out.println(sumOdd);

	}

	private static Integer fpSum(List<Integer> numbers) {
		return numbers.stream().reduce(0, (number1, number2) -> number1 + number2);
	}

	private static int normalSum(List<Integer> numbers) {
		int sum = 0;
		for (Integer integer : numbers) {
			sum += integer;
		}
		return sum;
	}

}
