import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class GFG<O> {

	 private final ReadWriteLock readWriteLock=new ReentrantReadWriteLock();
	 private final Lock writeLock=readWriteLock.writeLock();
	 private final Lock readLock=readWriteLock.readLock();
	 private final List<O> list = new ArrayList<>(); 
		public void setElement(O o) {
			writeLock.lock();
			
			list.add(o);
			 System.out.println( 
		                "Element by thread "
		                + Thread.currentThread().getName() 
		                + " is added"); 
			 writeLock.unlock();
		}
		public O getElement(int i) {
			readLock.lock();
			
			try {
			 System.out.println( 
		                "Element by thread "
		                + Thread.currentThread().getName() 
		                + " is added"); 
			 return list.get(i);
			}
			finally{
			 readLock.unlock();
			}
		}
	public static void main(String[] args) {   
		// TODO Auto-generated method stub
		   GFG<String> gfg = new GFG<>(); 
		   
	        gfg.setElement("Hi"); 
	        gfg.setElement("Hey"); 
	        gfg.setElement("Hello"); 
	  
	        System.out.println("Printing the last element : "
	                           + gfg.getElement(2)); 
	}

}
