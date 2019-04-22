/**
 * 
 */
package ps.iv;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * @author e3025685
 *
 */
public class StreamAPITest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> no = new ArrayList<>();
		
		for(int i =1; i <= 3; i++)
		{
			no.add(i);
		}
		no.add(33);
		no.add(10);
		no.add(45);
		no.add(21);
//		String []
				
	Boolean boo = new Boolean("true");
	System.out.println(boo);
	
//	String [10]a = new String[]();
		
		
		int a, b;
		a = b = 10;
		
		System.out.println(a + b);
		
		System.out.println(no.stream().filter(i -> (i % 2 != 0)).mapToInt(i -> i).sum()); //reduce(0,(ans,i) -> ans+i));//collect(Collectors.toList()));
		no.stream().filter(i -> (i % 2 != 0)).sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
	}

	public class MyN
	{
		int i = 1;
		int j = 2;
		
		public class Nest
		{
			static final int i = 11;
			static final int j = 22;
		}
	}
}
