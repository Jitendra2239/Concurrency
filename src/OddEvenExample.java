
public class OddEvenExample {
	
	int contr = 1;  
	static int Num;  
	public void displayEvenNumber() {
		synchronized(this){
			while(contr<Num) {
				while(contr % 2 == 1) {
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println(contr + " "+Thread.currentThread().getName());  
				contr++;
				notify();
			}
		}
	}
public void displayOddNumber() {
		
	synchronized(this) {
		while(contr<Num) {
			while(contr % 2 == 0) {
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println(contr + " "+Thread.currentThread().getName());  
			contr++;
			notify();
		}
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Num=20;
		
		OddEvenExample oe=new OddEvenExample();
Thread th1=new Thread(new Runnable() {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		oe.displayEvenNumber();
	}
	
},"threadEven");
Thread th2=new Thread(new Runnable() {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		oe.displayOddNumber();
	}

},"threadOdd");
th1.start();
th2.start();
	}

}
