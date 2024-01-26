import java.util.concurrent.atomic.LongAdder;

public class ThreadExample implements Runnable{
int x=4;

public static void main(String[] args) throws InterruptedException {
	ThreadExample obj=new ThreadExample();

 Thread t1=new Thread(obj);
 Thread t2=new Thread(obj);
t1.start();
t2.start();
t1.join();
t2.join();
System.out.println(obj.x); 
//LongAdder add=new LongAdder();
	


	}
	@Override
	public   void run() {
		// TODO Auto-generated method stub
		 x=x+1;
		 System.out.println(Thread.currentThread().getName());
	}
}
