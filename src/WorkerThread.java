import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.locks.ReentrantLock;

public class WorkerThread implements Runnable{
	   private String message;  
	   ReentrantLock lock;
	    public WorkerThread(ReentrantLock lock,String s){  
	        this.message=s; 
	        this.lock=lock;
	    } 
	@Override
	public void run() {
	boolean execution=false;
	while(!execution) {
		boolean result=lock.tryLock();
		if(result) {
			try {
			Date dateObj=new Date();
			SimpleDateFormat sdf=new SimpleDateFormat("hh:mm:ss");
			System.out.println("Task:"+message+"outer lock is acquired at"+sdf.format(dateObj));
	
			Thread.sleep(1500);
			lock.lock();
	          try  
              {  
                  dateObj = new Date();  
                  sdf = new SimpleDateFormat("hh:mm:ss");  
                  System.out.println("Task : "+ message+ " inner lock is acquired at "+ sdf.format(dateObj));  
//use getHoldCount() method to get lock hold count of inner lock  
System.out.println("The lock hold count of inner lock: "+ lock.getHoldCount());  
                    
                  // use sleep() method of the thread class  
                  Thread.sleep(1500);  
              }  
                
              // catch block for handling inner lock exceptions  
              catch(InterruptedException e)  
              {  
                  e.printStackTrace();  
              }  
	          finally{
	        	  System.out.println("The inner lock is released by task : " + message);    
	        lock.unlock();
	          }
	          // use getHoldCount() method to get lock hold count of inner lock  
              System.out.println("The lock hold count of inner lock: " + lock.getHoldCount());  
              System.out.println("The work of the " + message + " task is done");  
              // set result to true  
              result = true; 
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			  finally  
              {  
                  //Outer lock release  
                  System.out.println("The outer lock is released by task" + message);  
                  lock.unlock();  
                  System.out.println("The lock hold count of outer lock: " + lock.getHoldCount());  
              }  
		}
	    else  
        {  
            //print that tasks waiting for lock  
            System.out.println("Task " + message +" is waiting for the lock");  
            try  
            {  
                // use sleep method to suspend execution   
                Thread.sleep(1000);  
            }  
            catch(InterruptedException e)  
            {  
                e.printStackTrace();  
            }  
        }  
	}
	    }  
	    private void processmessage() {  
	        try {  Thread.sleep(2000);  } catch (InterruptedException e) { e.printStackTrace(); }  
	}

}
