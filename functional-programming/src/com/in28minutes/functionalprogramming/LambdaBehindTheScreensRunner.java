package com.in28minutes.functionalprogramming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class EvenNumberPredicate implements Predicate<Integer> {

	@Override
	public boolean test(Integer number) {
		return number % 2 == 0;
	}
}

class SystemOutConsumer implements Consumer<Integer> {

	@Override
	public void accept(Integer number) {
		System.out.println(number);
	}

}

class NumberSquareMapper implements Function<Integer, Integer> {

	@Override
	public Integer apply(Integer number) {
		// TODO Auto-generated method stub
		return number * number;
	}
}

public class LambdaBehindTheScreensRunner {

	public static void main(String[] args) {
		List.of(23, 43, 34, 45, 36, 38).stream().filter(e -> e % 2 == 0).map(e -> e * e)
				.forEach(e -> System.out.println(e));

		List.of(23, 43, 34, 45, 36, 38).stream().filter(new EvenNumberPredicate()).map(new NumberSquareMapper())
				.forEach(new SystemOutConsumer());

	}

}
