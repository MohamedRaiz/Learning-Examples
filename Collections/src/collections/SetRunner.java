package collections;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetRunner {

	public static void main(String[] args) {
		List<Character> characters = List.of('A', 'Z', 'X', 'B', 'Y', 'L', 'A', 'B');

		// Unique - Sets
		// Tree - Sorted order
		// HashSet
		// LinkedHashSet - Insertion Order

		Set<Character> treeSet = new TreeSet<Character>(characters);
		System.out.println(treeSet);

		Set<Character> linkHashSet = new LinkedHashSet<Character>(characters);
		System.out.println(linkHashSet);

	}

}
