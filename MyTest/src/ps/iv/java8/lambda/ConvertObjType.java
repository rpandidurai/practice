/**
 * 
 */
package ps.iv.java8.lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * @author e3025685
 *
 */
public class ConvertObjType {

public static void main(String[] args) {
		
		List<B> bList = new ArrayList<B>();
		List<A> aList = new ArrayList<A>();
		
		for (int i = 0; i < 10; i++)
		{
			bList.add(new B("B-"+ i));
		}
		
		bList.forEach(t -> { if (t != null && t instanceof A) aList.add((A) t);});
		
		aList.forEach(t -> System.out.println(t instanceof A));
	}

}

class A
{
	private static String name;
	A()
	{
		
	}
	public A(String name) {
		this.name = name;
	}
	
	static String getName()
	{
		return name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getName();
	}
}

class B extends A
{
	private String name;
	public B(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}
}

class C extends A
{
	private String name;
	public C(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}
}