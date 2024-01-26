import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class TestThread3 {

	public static <T> void main(String[] args) {
		// TODO Auto-generated method stub
		 int nThreads = Runtime.getRuntime().availableProcessors();
	      System.out.println(nThreads);
	      
	      int[] numbers = new int[1000]; 

	      for(int i = 0; i < numbers.length; i++) {
	         numbers[i] = i;
	      }

	      ForkJoinPool forkJoinPool = new ForkJoinPool(nThreads);
	      Long result = (Long) forkJoinPool.invoke(new Sum(0,numbers.length,numbers));
	      System.out.println(result);
	}
 static class Sum extends RecursiveTask{
	 int low;
     int high;
     int[] array;
     
	public Sum(int low, int high, int[] array) {
		super();
		this.low = low;
		this.high = high;
		this.array = array;
	}

	@Override
	protected Long compute() {
		// TODO Auto-generated method stub
		 if(high - low <= 10) {
	            long sum = 0;
	            
	            for(int i = low; i < high; ++i) 
	               sum += array[i];
	               return sum;
	         }
		 else {
			 int mid=low+(high-low)/2;
			 Sum left=new Sum(low,mid,array);
			 Sum right=new Sum(mid,low,array);
			 left.fork();
			 long rightresult=right.compute();
			 long leftresult=(long) left.join();
			 return leftresult+rightresult;
		 }
	
	}
	 
 }
}
