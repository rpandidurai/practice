/**
 * 
 */
package ps.iv;

/**
 * @author e3025685
 *
 */
public class AbstractImplementation extends AbstractLevel1{

	/**
	 * @param args
	 */
	public AbstractImplementation(String msg) {
		//super();
		System.out.println("Message : " + msg);
	}
	public AbstractImplementation() {
		System.out.println("Cons ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		AbstractExample ai = new AbstractImplementation("From Implementation class...");
		
		int n = 9;
		
		System.out.println(getFactor(n));
		
		String s1 = "String";
		String rs = "Y" + s1.substring(1, s1.length());
		
		System.out.println(rs);
	}
	
	public static int getFactor(int n)
	{
		if(n < 1)
			return 1;
		return n * getFactor(n-1);
	}

	@Override
	public void printMessage(String msg) {
		System.out.println("The message : " + msg);
		
	}
	
	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println("Hello from AbstractImplementation...");
	}

}
