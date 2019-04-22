/**
 * 
 */
package ps.iv;

/**
 * @author e3025685
 *
 */
public class MyBlockLevelTest {
	
	static int sa;
	int a;
	
	{// normal block		
		a = 10;
		int b = 30;
		System.out.println("Normal block & a : "+a);
		System.out.println("Normal block & sa : "+sa);
	}
	
	static
	{
		//static block
		sa = 20;
		System.out.println("Static block & sa "+sa);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		System.out.println("Main method");
		MyBlockLevelTest obj = new MyBlockLevelTest();
		obj.a = 90;
		sa = 80;
		new MyBlockLevelTest();
//		obj.b = 90; // error

	}
}


class A
{
	
}
