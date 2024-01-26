import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

public class LockExample {
	  static final int MAX_VAL = 2;  
	    // main() method start  
	    public static void main(String[] args)  
	    {  
	    	AtomicInteger num;
	    	Semaphore s;
	    	
	        // create instance of the ReentrantLock  
	         ReentrantLock lock = new ReentrantLock();  
	         // create thread pool by using ExecutorService class  
	         ExecutorService pool = Executors.newFixedThreadPool(MAX_VAL);  
	         Runnable wt1 = new WorkerThread(lock, "Job1");  
	         Runnable wt2 = new WorkerThread(lock, "Job2");  
	         Runnable wt3 = new WorkerThread(lock, "Job3");  
	         Runnable wt4 = new WorkerThread(lock, "Job4");  
	         // execute jobs by using execute() method of ExecutorService  
	         pool.execute(wt1);  
	         pool.execute(wt2);  
	         pool.execute(wt3);  
	         pool.execute(wt4);  
	         // shutdown pool  
	         pool.shutdown();  
	    }  
}
