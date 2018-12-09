package com.in28minutes.primitive.datatypes;

public class MyChar {
	private char letter;

	MyChar(char letter) {
		this.letter = letter;
	}

	public boolean isVowel() {

		if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
			return true;
		} else {
			return false;
		}
	}

	public boolean isNumber() {
		if (letter >= 48 && letter <= 57) { // 48 is equivalent to 0 in character, and 57 is 9.
			return true;
		} else {
			return false;
		}

	}

	public boolean isAlphebat() {
		if (letter >= 97 && letter <= 122) { // 97 is equivalent to a in character, and 122 is z.
			return true;
		} else if (letter >= 65 && letter <= 90) {
			return true;
		} else {
			return false;
		}

	}

	public boolean isConsonant() {
		if (isAlphebat() && !isVowel()) {
			return true;
		} else {
			return false;
		}
	}

	public static void printLowerCaseAlphabets() {

		for (char letter = 'a'; letter <= 'z'; letter++) {
			System.out.println(letter);
		}
	}

	public static void printUpperCaseAlphabets() {
		for (char letter = 'A'; letter <= 'Z'; letter++) {
			System.out.println(letter);
		}
	}
}
