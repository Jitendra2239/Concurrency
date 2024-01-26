import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TestThread {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	Counter counter = new Counter();
	  for(int i = 0; i < 1000 ; i++) {	
	new Thread(()-> {

		
				// TODO Auto-generated method stub
				counter.increment();
			}
			 
		 ).start();
	  }
		   Thread.sleep(6000);
		      System.out.println("Final number (should be 1000): " + counter.value());
	}
	   static class ItemQueue {
		   private Object[] items = null;
		      private int current = 0;
		      private int placeIndex = 0;
		      private int removeIndex = 0;

		     Lock lock;
		  Condition isEmpty;
		      Condition isFull;
		      public ItemQueue(int capacity) {
		    	  this.items=new Object[capacity];
		    	  lock = new ReentrantLock();
		          isEmpty = lock.newCondition();
		          isFull = lock.newCondition();
		      }
		      public void add(Object item) throws InterruptedException {
	       lock.lock();
	       while(current>=items.length){
	    	   isFull.await();
	       }
	       items[placeIndex] = item;
	         placeIndex = (placeIndex + 1) % items.length;
	         ++current;
	         isEmpty.signal();
	         lock.unlock();
		      }
		      public Object remove() throws InterruptedException {
		    	  Object item = null;
		    	  lock.lock();
		    	while(current<=0) {
		    		isEmpty.await();
		    	}
		    	  item = items[removeIndex];
		          removeIndex = (removeIndex + 1) % items.length;
		          --current;
		          isFull.notify();
		          lock.unlock();
				return item;
		    	  
		      }
		      public boolean isEmpty() {
		          return (items.length == 0);
		       }
	   }
	   static class Producer extends Thread {
		      private final ItemQueue queue;
		      
		      public Producer(ItemQueue queue) {
		         this.queue = queue;
		      }

		      @Override
		      public void run() {
		         String[] numbers =
		            {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};

		         try {
		      
		            for(String number: numbers) {
		               System.out.println("[Producer]: " + number);
		            }
		            queue.add(null);
		         } catch (InterruptedException ex) {
		            ex.printStackTrace();
		         } 
		      }
		   }

		   static class Consumer extends Thread {
		      private final ItemQueue queue;
		      
		      public Consumer(ItemQueue queue) {
		         this.queue = queue;
		      }

		      @Override
		      public void run() {
		         
		         try {
		            
		            do {
		               Object number = queue.remove();
		               System.out.println("[Consumer]: " + number);

		               if(number == null) {
		                  return;
		               }
		            } while(!queue.isEmpty());
		         } catch (InterruptedException ex) {
		            ex.printStackTrace();
		         }
		      }
		   }
static	class Counter {
			      private AtomicInteger c=new AtomicInteger(0);

			      public void increment() {
			         c.getAndIncrement();
			      }

			      public int value() {
			         return c.get();
			      }
			   }
}
