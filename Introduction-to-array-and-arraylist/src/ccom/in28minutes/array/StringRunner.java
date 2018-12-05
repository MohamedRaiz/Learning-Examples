package ccom.in28minutes.array;

public class StringRunner {

	public static void main(String[] args) {

		String[] daysOfWeek = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		// Finding the one with the longest character.

		String dayWithMostCharacters = "";
		for (String day : daysOfWeek) {
			if (day.length() > dayWithMostCharacters.length()) {
				dayWithMostCharacters = day;
			}
		}
		System.out.println("Day with Most number of characters: " + dayWithMostCharacters);

		// print days of week in reverse

		for (int i = daysOfWeek.length - 1; i >= 0; i--) {

			System.out.println(daysOfWeek[i]);
		}

	}
}
