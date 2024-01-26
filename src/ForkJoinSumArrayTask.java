import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class ForkJoinSumArrayTask extends RecursiveTask<Integer>{
	private  List<Integer> numbers ;
	 
	
	public ForkJoinSumArrayTask(List<Integer> numbers) {
	
		this.numbers = numbers;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  ForkJoinPool forkJoinPool=new ForkJoinPool();
  List<Integer> numbers = List.of(1, 3, 5, 7, 9);
  int output = forkJoinPool.invoke(new ForkJoinSumArrayTask(numbers));

  System.out.println(output);
	}

	@Override
	protected Integer compute() {
		// TODO Auto-generated method stub
		if(numbers.size()<=2) {
		int res=numbers.stream().mapToInt(e->e).sum();
	
		return res;
		}
		else {
			int mid=numbers.size()/2;
			List<Integer>list1=numbers.subList(0, mid);
			List<Integer>list2=numbers.subList(mid, numbers.size());
		    ForkJoinSumArrayTask left=	new ForkJoinSumArrayTask(list1);
		    ForkJoinSumArrayTask right=new ForkJoinSumArrayTask(list2);
		    left.fork();
		    right.fork();
		    return left.join()+right.join();
		}
	
	}

}
