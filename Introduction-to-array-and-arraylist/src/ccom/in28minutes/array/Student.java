package ccom.in28minutes.array;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class Student {

	private String name;
	private ArrayList<Integer> marks = new ArrayList<Integer>();

	// Variable number of arguments method(using ...). this method must be the last
	// argument
	public Student(String name, int... marks) {
		this.name = name;
		for (int mark : marks) {
			this.marks.add(mark);
		}

	}

	// Original method:
//	public Student(String name, int[] marks) {
//		this.name = name;
//		this.marks = marks;
//	}

	public int getNumberOfMarks() {
		int number = marks.size();
		return number;
	}

	public int getTotalSumOfMarks() {

		int sum = 0;
		for (int mark : marks)
			sum += mark;

		return sum;
	}

	public int getMaximumMark() {

		// When using arraylist, we can use collection as it is part of it. collection
		// has alot of utility method. one is max.
		return Collections.max(marks);

		// This method below is commented because now we are using arraylist.
		// int max = Integer.MIN_VALUE;
		// for (int mark : marks) {
		// if (mark > max) {
		// max = mark;
		// }

		// }
		// return max;

	}

	public int getMinimumMark() {

		// When using arraylist, we can use collection as it is part of it. collection
		// has alot of utility method. one is min.
		return Collections.min(marks);

		// This method below is commented because now we are using arraylist.
		// int min = Integer.MAX_VALUE;
		// for (int mark : marks) {
		// if (min > mark) {
		// min = mark;
		// }
		// }
		// return min;
	}

	public BigDecimal getAverageMarks() {
		int sum = getTotalSumOfMarks();
		int divider = getNumberOfMarks();

		return new BigDecimal(sum).divide(new BigDecimal(divider), 3, RoundingMode.UP);// need specify precision(3) and
																						// rounding mode.
	}

	@Override
	public String toString() {
		return name + marks;

	}

	public void addNewMark(int i) {
		marks.add(i);

	}

	public void removeMarkAtIndex(int i) {
		marks.remove(i);

	}

}
