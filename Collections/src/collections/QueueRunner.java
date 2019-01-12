package collections;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class StringLengthComparator implements Comparator<String> {

	@Override
	public int compare(String value1, String value2) {

		return Integer.compare(value2.length(), value1.length());
	}

}

//With the comparator class, we are able to customize the way the queue is processed.

public class QueueRunner {

	public static void main(String[] args) {

		Queue<String> queue = new PriorityQueue<String>(new StringLengthComparator());
		queue.addAll(List.of("Zebra", "Monkey", "Cat"));

		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());

		// Therefore, this is processed accoridng to their natural order which is
		// alphabetical as of now.
	}
}
