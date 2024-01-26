import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {

	
		// TODO Auto-generated method stub
		  public static void main(String[] args) {

		        // 1. Find the sum of all elements in a List using streams.
			  List<Integer>list=new ArrayList<Integer>();
			  list.add(1);
			  list.add(2);
			  list.add(4);
			  list.add(4);
			//double sum=  list.stream().mapToInt(Integer::intValue).average().getAsDouble();
//System.out.println(sum);
		        // 2. Given a List of integers, write a program to find the maximum element using streams.
			   //   list.stream().max(Comparator.reverseOrder()).get();

		        // 3. Given a List of strings, write a program to count the number of strings that start with a specific character using streams.
			   //   List<String> fruits = Arrays.asList("apple", "banana", "cherry", "coconut", "apple");
			   //  long count= fruits.stream().filter(s->s.startsWith("b")).count();
		        // 4. Convert a List of strings to uppercase using streams.
                  //     fruits.stream().map(s->s.toUpperCase());
		        // 5. Given a List of integers, write a program to filter out the even numbers using streams.
		        //    Count the number of elements in a list that satisfy a specific condition using streams.
                 //   list.stream().filter(x->x% 2==0).count();
		        // 6. Write a program to find the average of a List of floating-point numbers using streams.
                //    List<Double> numsFloat = Arrays.asList(1.3, 2.4, 3.1, 4.2, 5.4);
                  //  double avg =numsFloat.stream().mapToDouble(Double::doubleValue).average().getAsDouble();
		        // 7. Given a List of strings, write a program to concatenate all the strings using streams.
                 // long s=  fruits.stream().collect(Collectors.counting());
                //  System.out.println(s);
		        // 8. Write a program to remove duplicate elements from a List using streams.
                 //   list.stream().distinct().forEach(System.out::println);
		        // 9. Given a List of objects, write a program to sort the objects based on a specific attribute using streams.
                  List<Person> people = Arrays.asList(
                          new Person("Alice", 21),
                          new Person("Anna", 29),
                          new Person("Bob", 30),
                          new Person("Barbie", 56),
                          new Person("Charlie", 20));
                 // people.stream().sorted(Comparator.comparing(Person::getAge)).collect(Collectors.toList()).forEach(System.out::println);
		  
		        // 10. Write a program to check if all elements in a List satisfy a given condition using streams.
                //   boolean fs= list.stream().anyMatch(x->x>=2);
		        //Extra practice questions

		        // 11. Given a List of integers, write a program to find the difference between the maximum and minimum elements using streams.
               // long num1=   list.stream().max(Comparator.naturalOrder()).get();
               // long num2=   list.stream().min(Comparator.naturalOrder()).get();
		        // 12. Write a program to check if a List of strings contains at least one uppercase word using streams.
                   //   fruits.stream().filter(x->x.startsWith("A"));
		        // 13. Given a List of integers, write a program to filter out the prime numbers using streams.
                      
		        // 14. Write a program to check if a List of strings contains any duplicates using streams.

		        // 15. Given a List of strings, write a program to count the total number of characters in all strings using streams.
                      //Find the second smallest element in a list of integers using stream
//		 int res=  list.stream().distinct().skip(2).findFirst().get();
//		System.out.println(res);
//		  List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
//	        List<Integer> list2 = Arrays.asList(4, 5, 6, 7, 8);
//	        List<Integer> intersection =   list1.stream().filter(list2::contains).collect(Collectors.toList());
//	        intersection.forEach(System.out::println);
                  //1. Given a sentence, find and print the frequency of each word.
//                  String sentence = "Java is a programming language. Java is versatile.";
//                  Map<Object, Long> wordFreqMap =   Arrays.stream(sentence.split(" ")).collect(Collectors.groupingBy(String::toLowerCase,Collectors.counting()));
//          
//
//
//                System.out.println(wordFreqMap);
                //3. Given a list of names, group them by their first letter, and then count the number of names in each group.
//
//                String[] names = {"Alice", "Bob", "Charlie", "Amy", "Bill", "Anna"};
//                Map<Character,Long> namesMap =       Arrays.stream(names).collect(Collectors.groupingBy(s->s.charAt(0),Collectors.counting()));
//                System.out.println(namesMap);
		
                  // 4. Find and print duplicate numbers in an array if it contains multiple duplicates?

//                  int[] arr = {2,4,2,3,1,5, 5,78,3,1,5};
//
//		  Arrays.stream(arr).boxed()
//		  .collect(Collectors.groupingBy(e->e,Collectors.counting()))
//		  .entrySet().stream()
//		  .filter(entry->entry.getValue()>1)
//		  .map(Map.Entry::getKey)
//		  .forEach(System.out::println);
//	       // 5. How are duplicates removed from a given array in Java?
//		  //
//		          int[] arr2 = {2,4,2,3,1,78};
	//          Arrays.stream(arr).distinct();
                  
                  //6. Given a list of words, filter and print the palindromes

                  List<String> strings = List.of("level", "hello", "radar", "world", "deed");
                  strings.stream()
                 .filter(str -> str.equals(new StringBuilder(str).reverse().toString())).collect(Collectors.toList());
		

                  // 7. How do you merge two sorted arrays into a single sorted array?
//                  int[] array1 = {1, 3,32, 5, 7};
//                  int[] array2 = {2, 4, 6,62, 8};
//		  
//		  IntStream.concat(Arrays.stream(array1), Arrays.stream(array2)).sorted().toArray();
                  
                  //8. Given two lists of strings, concatenate them and remove duplicates.

//                  List<String> list1 = List.of("apple", "banana", "orange");
//                  List<String> list2 = List.of("banana", "kiwi", "grape");
//                  Stream.concat(list1.stream(), list2.stream()).distinct().collect(Collectors.toList());
//                  List<Student> students = List.of(
//                          new Student("Alice", 85),
//                          new Student("Bob", 60),
//                          new Student("Charlie", 75),
//                          new Student("David", 90)
//                  );
//                  Map<String, List<Student>> studentMap =   students.stream().collect(Collectors.groupingBy(s->s.marks>=70?"pass":"fail"));
//                  System.out.println(studentMap);
                  //10. Given a list of strings, sort them according to increasing order of their length.

//                  List<String> fruits = Arrays.asList("Mango","pear" ,"Apple", "Banana", "Pineapple", "Kiwi");
//                  fruits.stream().sorted(Comparator.comparing(String::length));
                  //12.Partition a list of numbers into two groups: even and odd, using a custom predicate.
//                  List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//                  Map<Boolean, List<Integer>> partitionedNumbers =     numbers1.stream().collect(Collectors.partitioningBy(x->x% 2==0));
//                  System.out.println(partitionedNumbers);
//                  //13. Find the squares of the first three even numbers in a list.
//                  List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//                  numbers.stream().filter(n -> n % 2 == 0).map(x->x*x).limit(3).collect(Collectors.toList());
                  
                  // 14. Flatten a list of lists

//                  List<List<Integer>> listOfLists = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4), Arrays.asList(5, 6));
//		
//                  List<Integer> flattenedList = listOfLists.stream()
//                          .flatMap(List::stream)
//                          .collect(Collectors.toList());
//
//                  System.out.println(flattenedList);
                  
                  /*
                  Sort List of Objects

                  Custom Sorting Criteria

                  Multiple Sorting Criteria

                  Case-Insensitive Sorting

                  Reverse Order Sorting
                    */
                  //1. Sort the strings based on their length in ascending order
                  List<String> fruits = Arrays.asList("apple", "cherry", "banana", "pineapple", "kiwi", "elderberry");
                  Collections.sort(fruits, Comparator.comparing(String::length));
                  // 2.Sort the list of integers in descending order and print the result

                  List<Integer> nums = Arrays.asList(3,2,90,34,21,12);
                 nums.sort(Comparator.reverseOrder());
                 // 3.Sort the list of employees based on their age in ascending order and print the result

                 List<Employee> employees = Arrays.asList(new Employee( "Varsha", 28, 3000),
                         new Employee( "Harsha", 21, 4000),
                         new Employee( "Tony", 21, 1000),
                         new Employee( "Ramesh", 30, 5000));
                 employees.stream().sorted(Comparator.comparingInt(Employee::getAge));
                 
                 
                 // 4.Sort the list of employees based on their age in ascending order. If the ages are the same, compare by salary. Print the result.
                 
                 employees.stream().sorted(Comparator.comparingInt(Employee::getAge).thenComparing(Employee::getSalary));
                 //7. Sort a list of dates in ascending order using the comparing() method with a lambda expression.
//                 List<LocalDate> dates = Arrays.asList(
//                         LocalDate.of(2023, 5, 10),
//                         LocalDate.of(2023, 3, 15),
//                         LocalDate.of(2023, 7, 1)
//                 );
//
//                 dates.sort(Comparator.comparing(date -> date)); 
            IntStream count=     IntStream.iterate(0, x->x+1).limit(5);
            System.out.println(  count.sum());
          
            
            Random random = new Random(); 
           Stream .generate(random::nextInt).limit(4)
        
            // Print the IntStream 
            // using forEach() method. 
            .forEach(System.out::println); 
		  }

	
		

}