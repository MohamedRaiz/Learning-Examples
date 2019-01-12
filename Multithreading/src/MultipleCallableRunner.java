import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleCallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(1);
		// On a future, we can use a get method. Future is a promise that there will be
		// a result. Once we call the get method on a future, this would wait for the
		// task to complete execution. only after completing task, next line would be
		// executed

		List<CallableTask> tasks = List.of(new CallableTask("in28Minutes"), new CallableTask("Ranga"),
				new CallableTask("Adam"));

		List<Future<String>> results = executorService.invokeAll(tasks);

		for (Future<String> future : results) {
			System.out.println(future.get());

		}

		executorService.shutdown();

	}

}
