/**
 * 
 */
package ps.iv;

/**
 * @author e3025685
 *
 */
public class exception {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println(testException());

	}

	public static String testException()
	{
		try
		{
			int i = 45 / 0;
			return "TRY";
		}
		catch (ArithmeticException e) {
			System.out.println("Caught ARITHMETICEXCEPTION "+e);
			return "ARITHMETICEXCEPTION";
		}
		catch (Exception e) {
			System.out.println("Caught exception "+e);
			return "CATCH";
		}		
		finally {
			return "FINALLY";
		}
		
//		return "Method END";
	}
}
