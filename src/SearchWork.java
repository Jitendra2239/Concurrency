import java.util.concurrent.RecursiveTask;

public class SearchWork  extends RecursiveTask<Integer>   {

	int arr[];  
	int s, e;  
	int searchEle;  
	
	public SearchWork(int[] arr, int s, int e, int searchEle) {
		super();
		this.arr = arr;
		this.s = s;
		this.e = e;
		this.searchEle = searchEle;
	}

	@Override
	protected Integer compute() {
		// TODO Auto-generated method stub
		return countFreq() ;
	}
	private Integer countFreq()  
	{  
	  int c = 0;  
	for (int j = s; j <= e; j++)   
	{  
	if (arr[j] == searchEle)   
	{  
	  
	    c = c + 1;  
	}  
	}  

	return c;  
	}  
}
