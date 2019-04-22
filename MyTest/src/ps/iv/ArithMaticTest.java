/**
 * 
 */
package ps.iv;

/**
 * @author e3025685
 *
 */
public class ArithMaticTest {

	
	public long add(long a, short b)
	{
		return a+b;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		ArithMaticTest t = new ArithMaticTest();
		
		System.out.println(t.add(11, (short) 45));
		System.out.println(t.add(255, (short) 355));
		System.out.println(t.add(1000000000, (short)2000000000));
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Short.MAX_VALUE);

	}

}
