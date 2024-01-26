
public class AllNum {

	
	public  void getAllNumber() {
		synchronized(this) {
		for(int i=0;i<20;i++) {
			System.out.println("Thread Name:-"+Thread.currentThread().getName()+ i);
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			notify();
		}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AllNum obj=new AllNum();
Thread th1=new Thread(new Runnable() {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		obj.getAllNumber();
	}
	
},"threadEven");
Thread th2=new Thread(new Runnable() {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		obj.getAllNumber();
	}

},"threadOdd");
th1.start();
th2.start();
	}

}
