import java.util.concurrent.RecursiveAction;

public class DoubleNumber  extends RecursiveAction{

	final int PROCESS_THRESHOLD=2;
	int []array;
	int s;
	int e;
	static int result;
	
	public DoubleNumber(int[] array, int s, int e) {
		super();
		this.array = array;
		this.s = s;
		this.e = e;
	}

	@Override
	protected void compute() {
		// TODO Auto-generated method stub
		if(e-s<=PROCESS_THRESHOLD) {
			for(int i=s;i<e;i++) {
				result+=array[i]*2;
			}
		}
		else {
			int mid=(s+e)/2;
			DoubleNumber	leftArray=new DoubleNumber(array,s,mid);
			DoubleNumber    rightArray=new DoubleNumber(array,mid,e);
			leftArray.fork();
			rightArray.fork();
			leftArray.join();
			rightArray.join();
		}
	}

}
