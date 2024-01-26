import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Runnable rb1=new Task("task1");
Runnable rb2=new Task("task2");
Runnable rb3=new Task("task3");
Runnable rb4=new Task("task4");
Runnable rb5=new Task("task5");

ExecutorService executor=Executors.newFixedThreadPool(3);
executor.execute(rb1);
executor.execute(rb2);
executor.execute(rb3);
executor.execute(rb4);
executor.execute(rb5);
executor.shutdown();
	}

}
