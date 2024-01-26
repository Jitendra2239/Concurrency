import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.stream.IntStream;

public class CounterUsingMutex {

	private Semaphore mutex;
	private int count;
	
	public CounterUsingMutex() {
	
		this.mutex =    mutex = new Semaphore(1);
		this.count =0;
	}
public void incrment() throws InterruptedException {
	System.out.println("try lock");
	mutex.acquire();
	count++;
	mutex.release();
}
public int get() {
	return count;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int count = 5;
		    ExecutorService executorService
		     = Executors.newFixedThreadPool(count);
		    CounterUsingMutex counter = new CounterUsingMutex();
		    IntStream.range(0, count)
		      .forEach(user -> executorService.execute(() -> {
		          try {
		              counter.incrment();
		          } catch (InterruptedException e) {
		              e.printStackTrace();
		          }
		      }));
		    executorService.shutdown();
		  System.out.println(  counter.get());
	}

}
