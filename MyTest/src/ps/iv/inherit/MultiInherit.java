/**
 * 
 */
package ps.iv.inherit;

/**
 * @author e3025685
 *
 */
public class MultiInherit extends A{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("MultiInherit");
		A sa = new A();
		B sb = new B();
		
//		print();
		print(sa.getClassName());
		print(sb.getClassName());
	}
	
	public static void print(String msg)
	{
		System.out.println(msg);
	}

}
