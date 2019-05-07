/**
 * 
 */
package ps.iv.java8.interfce;

/**
 * @author e3025685
 *
 */
public class Implements implements A, B, C {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Implements";
	}
	
	public strictfp double multiply (double a, double b)
	{
		return a * b * 10d;
	}
	
	public double multiply1 (double a, double b)
	{
		return a * b * 10d;
	}
	
	public static void main(String[] args) {
		Implements c = new Implements();
		A a = new Implements();
		System.out.println(c.getName());
		System.out.println(a.getName());
		System.out.println(c.multiply(10.3335675675672312312312d, 30.66645645654523542345345d));
		System.out.println(c.multiply1(10.3335675675672312312312d, 30.66645645654523542345345d));
	}
}
