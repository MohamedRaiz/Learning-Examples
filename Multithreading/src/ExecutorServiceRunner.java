import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task extends Thread {
	private int number;

// creating a thread that can accept a constructor

	public Task(int number) {
		this.number = number;
	}

	@Override
	public void run() { // Signature
		System.out.println("\nTask " + number + "started");
		for (int i = number * 100; i <= number * 100 + 99; i++) {
			System.out.print(i + " ");
			Thread.yield();

		}
		System.out.println("\n Task" + number + " Done");

	}
}

public class ExecutorServiceRunner {

	public static void main(String[] args) {
		// ExecutorService executorService = Executors.newSingleThreadExecutor();// this
		// would only execute 1 thread at a
		// time

		ExecutorService executorService = Executors.newFixedThreadPool(2);
		executorService.execute(new Task(1));
		// executorService.execute(new Thread(new Task2())); // creating a new thread
		// for task2

		// now we are trying to make multiple threads. as the fixedThreadPool only
		// allows 2 at a time, the other 2 has to wait
		executorService.execute(new Task(2));
		executorService.execute(new Task(3));
		executorService.execute(new Task(4));

//		// Task 3
//		System.out.println("\nIn Main Metjod: Task 3 kick off");
//		for (int i = 301; i <= 399; i++) {
//			System.out.print(i + " ");
//
//		}
//		System.out.println("\n Task3 Done");

		executorService.shutdown(); // use this to kill the program/code, else it will be still running
	}

}
