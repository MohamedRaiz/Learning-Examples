package collections;

import java.util.HashMap;
import java.util.Map;

public class MapRunner {

	public static void main(String[] args) {
		String str = "This is an awesome occasion. This has never happened before";

		Map<Character, Integer> occurances = new HashMap<Character, Integer>();

		char[] chars = str.toCharArray(); // this would return all the elements in the char array.
		for (char c : chars) {
			Integer integer = occurances.get(c);
			if (integer == null) {
				occurances.put(c, 1);
			} else {
				occurances.put(c, integer + 1);
			}

		}
		System.out.println(occurances);

		Map<String, Integer> stringOccurances = new HashMap<String, Integer>();
		String[] words = str.split(" ");

		for (String string : words) {
			Integer integer = stringOccurances.get(string);
			if (integer == null) {
				stringOccurances.put(string, 1);
			} else {
				stringOccurances.put(string, integer + 1);
			}

		}
		System.out.println(stringOccurances);
	}

}
