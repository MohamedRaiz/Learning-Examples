package com.in28minutes.ifstatements.examples;

public class SwitchExercisesRunner {

	public static void main(String[] args) {
		System.out.println(determineNameOfDay(3));
		System.out.println(isWeekday(0));
	}

	public static boolean isWeekday(int dayNumber) {
		switch (dayNumber) {
		case 0:
			return false;
		case 1:
			return true;
		case 2:
			return true;
		case 3:
			return true;
		case 4:
			return true;
		case 5:
			return true;
		case 6:
			return false;
		default:
			return false;

		}

	}

	public static String determineNameOfDay(int dayNumber) {
		switch (dayNumber) {
		case 0:
			return "Sunday";
		case 1:
			return "Monday";
		case 2:
			return "Tuesday";
		case 3:
			return "Wednesday";
		case 4:
			return "Thursday";
		case 5:
			return "Friday";
		case 6:
			return "Saturday";
		default:
			return "None";

		}
	}
}
