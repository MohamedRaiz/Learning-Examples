package com.in28minutes.primitive.datatypes;

public class MyCharRunner {

	public static void main(String[] args) {
		MyChar myChar = new MyChar('a');
		System.out.println(myChar.isVowel());
		System.out.println(myChar.isNumber());
		System.out.println(myChar.isAlphebat());
		System.out.println(myChar.isConsonant());
		MyChar.printLowerCaseAlphabets();
		MyChar.printUpperCaseAlphabets();

	}

}
