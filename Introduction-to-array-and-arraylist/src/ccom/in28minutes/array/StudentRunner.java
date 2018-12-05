package ccom.in28minutes.array;

import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {

		// inline refactor
		// highlight the variable you want to inline, and right click refactor inline,
		// then it would replace the values.
		// Eg below: marks array got replaced into the constructor
		// Student student = new Student("Rayy", new int[] { 99, 98, 90 });
		// Student student1 = new Student("Helli", new int[] { 99, 98, 90 });
		// Student student2 = new Student("ODminc", new int[] { 99, 98, 90 });

		// Another method of refactoring:

		// Variable number of arguments Method:
		Student student = new Student("Rayy", 99, 98, 90, 83);

		// Step06 - original
//		int[] marks = { 99, 98, 90 };
//		Student student = new Student("Rayy", marks);
//		Student student1 = new Student("Helli", marks);
//		Student student2 = new Student("ODminc", marks);
		int number = student.getNumberOfMarks();
		System.out.println("number of marks : " + number);

		int sum = student.getTotalSumOfMarks();
		System.out.println("Total sum of marks: " + sum);

		int maxMark = student.getMaximumMark();
		System.out.println("Maximum mark is : " + maxMark);

		int minMark = student.getMinimumMark();
		System.out.println("Minimum mark is : " + minMark);

		BigDecimal average = student.getAverageMarks();
		System.out.println(average);
		System.out.println(student.toString());

		student.addNewMark(35);
		System.out.println(student.toString());

		student.removeMarkAtIndex(2);
		System.out.println(student.toString());
	}
}
