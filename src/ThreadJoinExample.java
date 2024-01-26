
public class ThreadJoinExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Runnable th1=new ThreadJoin();
       Thread th4=new Thread(th1);
       ThreadJoin th2=new ThreadJoin();
       Thread th5=new Thread(th2);
       ThreadJoin th3=new ThreadJoin();
       Thread th6=new Thread(th3);
         th4.start();
         try {
        	 System.out.println("The current thread name is: "+ Thread.currentThread().getName());  
			th4.join();
			System.out.println();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         th5.start();
         try {
        	 System.out.println("The current thread name is: "+ Thread.currentThread().getName());  
			th5.join();
			System.out.println();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         th6.start();
         try {
        	 System.out.println("The current thread name is: "+ Thread.currentThread().getName());  
			th6.join();
			System.out.println();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
