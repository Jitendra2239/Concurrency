import java.text.SimpleDateFormat;
import java.util.Date;

public class Task implements Runnable{
  String taskName;
  public Task(String taskName) {
	  this.taskName=taskName;
  }
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			for(int i=0;i<5;i++) {
				if (i==0) {
					Date dt=new Date();
					SimpleDateFormat sdf=new SimpleDateFormat("HH:MM:SS");
					System.out.println("Initialization time for the task name: "+ taskName + " = " + sdf.format(dt));  
				}
				else {
					Date dt = new Date();  
					SimpleDateFormat sdf = new SimpleDateFormat("hh : mm : ss");  
					  
					// prints the execution time for every task  
					System.out.println("Time of execution for the task name: " + taskName + " = " +sdf.format(dt)); 
				}
				System.out.println(taskName + " is complete.");  
			}
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
