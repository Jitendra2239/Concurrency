
public class part1 extends Thread {
	 public synchronized void run()
	    {
	        int i = 0;
	        int num = 0;
	        String primeNumbers = "";
	       
	        for (i = 1; i <= 100; i++) {
	            int counter = 0;
	            for (num = i; num >= 1; num--) {
	               
	                // condition to check if the number is prime
	                if (i % num == 0) {
	                   
	                    // increment counter
	                    counter = counter + 1;
	                }
	            }
	           
	            if (counter == 2) {
	                primeNumbers = primeNumbers + i + " ";
	            }
	        }
	       
	        System.out.println("\nPrime numbers from 0 to 100 : \n"
	            + primeNumbers);
	       
	        System.out.println();
	    }
}
