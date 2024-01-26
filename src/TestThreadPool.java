import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThreadPool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
ExecutorService executor=Executors.newFixedThreadPool(5);
for(int i=0;i<5;i++) {
	Runnable worker =new WorkerThread(null, ""+i);
	executor.execute(worker);
}
executor.shutdown();
while(!executor.isTerminated()) {}
   System.out.println("All finished");
	}

}
