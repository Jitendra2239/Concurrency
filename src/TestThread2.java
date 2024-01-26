class Chat {
	boolean flag=false;
	public synchronized void Question(String msg) {
		if(flag) {
			try {
			wait();	
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println(msg);
		flag=true;
		notify();
	}
  public synchronized void Answer(String msg) {
	  if(!flag) {
		  try{
			 wait(); 
		  }
		  catch(InterruptedException e) {
			 e.printStackTrace(); 
		  }
	  }
	    System.out.println(msg);
	      flag = false;
	      notify();  
  }
}
class T1 implements Runnable{
	Chat m;
	String[] s1= {"Hi", "How are you ?", "I am also doing fine!" };
	T1(Chat m1){
		this.m=m1;
		new Thread(this,"thread1").start();
	}
	public void run() {
		for(int i=0;i<s1.length;i++) {
			m.Question(s1[i]);
		}
	}
}
class T2 implements Runnable{
	Chat m;
	 String[] s2 = { "Hi", "I am good, what about you?", "Great!" };
	T2(Chat m1){
		this.m=m1;
		new Thread(this,"thread2").start();
	}
	public void run() {
		for(int i=0;i<s2.length;i++) {
			m.Answer(s2[i]);
		}
	}
}
public class TestThread2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Chat m=new Chat();
      new T1(m);
      new T2(m);
	}

}
