
public class part2 extends Thread{
	 public synchronized void run()
	    {
	        int n, b, rev = 0;
	        int N = 1000;
	       
	        System.out.println("Palindrome numbers from 10 to 1000 : ");
	       
	        for (int i = 10; i <= N; i++) {
	            n = i;
	            while (n > 0) {
	 
	                // Find reverse of n
	                b = n % 10;
	                rev = rev * 10 + b;
	                n = n / 10;
	            }
	 
	            // If n and rev are same, n is palindrome number
	            if (rev == i) {
	                System.out.print(i + " ");
	            }
	            rev = 0;
	        }
	    }
}
