import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParallelStream1 {
	private static List<String> getData()  
    {  
  
        List<String> l1 = new ArrayList<>();  
  
        // for 'a' value is 97  
        // for 'b' value is 98 and so on  
        int alphabets = 97;    
        while (alphabets <= 106)   
        {  
            char ch = (char)alphabets;  
            l1.add(String.valueOf(ch));  
            alphabets = alphabets + 1;  
        }  
  
        return l1;  
  
    }  
	public static void main(String[] args) {
		
		
	    long count = Stream.iterate(0,n->n+1).limit(1000).parallel().unordered().count();

    }

    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        return !IntStream.rangeClosed(2, number / 2).anyMatch(i -> number % i == 0);
    }


}
