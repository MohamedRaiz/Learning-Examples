package com.In28minutes.firstjavaproject;

public class MultiplicationTable {

	void multiplePrinter() {
		multiplePrinter(5);

	}

	void multiplePrinter(int table) {
		multiplePrinter(table, 1, 10);
	}

	void multiplePrinter(int table, int from, int to) {
		for (int i = from; i <= to; i++) {
			System.out.printf("%d * %d = %d", table, i, table * i).println();
		}
	}

}
