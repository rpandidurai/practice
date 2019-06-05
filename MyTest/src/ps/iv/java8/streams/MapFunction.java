package ps.iv.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MapFunction {

	public static void main(String[] args) {
		
		List<String> stringList = Arrays.asList("Pandi", "Shantha", "Iyal");
		List<String> stringList2 = Arrays.asList("Pandi1", "Shantha2", "Iyal3");
		
		List<List<String>> ls = new ArrayList<>();
		
		ls.add(stringList);
		ls.add(stringList2);
		
		stringList.stream().map(String::toLowerCase).forEach(System.out::println);
		
		ls.stream().flatMap(p -> p.stream()).forEach(System.out::print);
		
		stringList.stream().filter(s -> {return true;}).forEach(System.out::println);
		
		
		//String.join
		String[] sarr = {"Jan", "Feb", "Mar"};
		String s = "";
		
		new HashSet<>(stringList);
		new HashMap<>();
		
		System.out.println(String.join(", ", stringList));
		
		char c = 'A';
		System.out.println("Char is : " +  (int) c);
		System.out.println("35 ptim factor : "+primeFactors(1092));
	}

	public static Set<Integer> primeFactors(long number) 
	{ 
		Set<Integer> primefactors = new HashSet<Integer>(); 
		long copyOfInput = number; 
		for (int i = 2; i <= copyOfInput; i++) 
		{ 
			if (copyOfInput % i == 0) 
			{ 
				primefactors.add(i); // prime factor 
				copyOfInput /= i; 
				i--; 
				
			} 			
		}
		return primefactors; 
	}

}
