import java.util.concurrent.ForkJoinPool;

public class ForkJoinExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 50, 32, 61, 50, 49, 50, 16, 71, 50, 94, 10, 90, 12, 50, 78, 98, 88, 99 };  
		  
		// the element that is to   
		// be searched in the arr  
		int searchEle = 50;  
		  
		// assinging values to the   
		// starting and ending indices  
		int s = 0;  
		int e = arr.length - 1;  
		SearchWork sw = new SearchWork(arr, s, e, searchEle);  
		ForkJoinPool comm=ForkJoinPool.commonPool();
		int freq=comm.invoke(sw);
		System.out.println(freq);
	}

}
