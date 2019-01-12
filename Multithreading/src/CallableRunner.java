import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableTask implements Callable<String> {// previously we implement runnable interface. However, if we want to
												// return value, we need callable interface

	private String name;

	public CallableTask(String name) {
		this.name = name;
	}

	@Override
	public String call() throws Exception {
		Thread.sleep(1000); // the reason why we make it wait is when executing threads, normally involves
							// alot of processing. Thus, process everything then return values
		return "Hello " + name;
	}
}

public class CallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(1);
		// On a future, we can use a get method. Future is a promise that there will be
		// a result. Once we call the get method on a future, this would wait for the
		// task to complete execution. only after completing task, next line would be
		// executed
		Future<String> welcomeFuture = executorService.submit(new CallableTask("in28Minutes")); // submit method can be
																								// used to execute a
																								// callable thing.
																								// Something returns a
																								// value, use submit
																								// else use execute
		System.out.println("\n New Callable executed");
		String welcomeMessage = welcomeFuture.get();
		System.out.println(welcomeMessage);

		System.out.println("\n Main completed");
	}

}
