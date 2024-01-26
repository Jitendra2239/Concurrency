import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;

public class CompletableFutureExample1 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		CompletableFuture<String> completableFuture
		  = CompletableFuture.supplyAsync(() -> "Hello");
//
//		CompletableFuture<String> future = completableFuture
//		  .thenApply(s -> s + " World");
//		System.out.println(future.get());
		String name = "jitendra";
//CompletableFuture<String>future=CompletableFuture.supplyAsync(()->{
//	if(name==null)
//		throw new RuntimeException("Compilation error");
//	return "Hello"+name;
//}).handle((s,t)->s!=null?s:"Hello Stranger");

		completableFuture.completeExceptionally(
				  new RuntimeException("Calculation failed!"));	
	//	System.out.println(completableFuture.get());
		ForkJoinPool coommonpool=ForkJoinPool.commonPool();
	
}
}
