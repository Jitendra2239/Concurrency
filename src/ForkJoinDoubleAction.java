import java.util.concurrent.ForkJoinPool;

public class ForkJoinDoubleAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  ForkJoinPool forkJoinPool=new ForkJoinPool();
  int[] array = {1, 5, 10, 15, 20, 25, 50};
  DoubleNumber doubleNumberTask = new DoubleNumber(array, 0, array.length);
  forkJoinPool.invoke( doubleNumberTask );
  System.out.println(DoubleNumber.result);
	}

}
