
public class TestThread4 {
    public static Object lock1=new Object();
    public static Object lock2=new Object();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ThreadDemo1 T1=new ThreadDemo1();
       ThreadDemo1 T2=new ThreadDemo1();
       T1.start();
       T2.start();
       
       
	}
	  private static class ThreadDemo1 extends Thread {
		  
	  }
}
