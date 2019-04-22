/**
 * 
 */
package ps.iv.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author e3025685
 *
 */
public class StreamsTest {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		OptionalDouble od = Stream.of(2d, 5d, 6d).mapToDouble(Double::doubleValue).max();
		
		System.out.println(od);
		
		Stream<String> stream = Stream.of("  java 8 ", "leveluplunch.com",
	            "examples", "exercises");

	    String joined = stream.map(String::trim).collect(Collectors.joining("-"));

	    System.out.println(joined);
	    
	    Stream<Integer> sInt = Stream.of(9, 2, 3, 5, 6);
	    sInt = sInt.map(i -> i +0).sorted();
	   System.out.println(sInt.findAny());
	   
	   List<Integer> it = Arrays.asList(2, 45, 6, 7, 32, 98, 56, 33, 87);
	   
//	   it.stream().filter((i -> i % 2 == 0)
		
	}
}
