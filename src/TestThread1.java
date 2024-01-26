import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestThread1 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		ExecutorService executor=Executors.newSingleThreadExecutor();
		Future<Long> futrue=executor.submit(new FactrorialService(10));
		long fact=futrue.get();
		System.out.println(fact);
		Thread t=new Thread();
		
		executor.shutdown();
	}
static class FactrorialService implements Callable<Long>{
	private int number;

	public FactrorialService(int number) {
		super();
		this.number = number;
	}

	@Override
	public Long call() throws Exception {
		// TODO Auto-generated method stub
		return fact();
	}
	public Long fact() throws InterruptedException {
         long result = 1; 
         
         while (number != 0) { 
            result = number * result; 
            number--; 
            Thread.sleep(100); 
         }
         return result;
	}
}
}
