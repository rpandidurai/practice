/**
 * 
 */
package ps.iv;

/**
 * @author e3025685
 *
 */
public class MyBlockLevelTest extends BA {
	
	MyBlockLevelTest()
	{
		System.out.println("MyBlockLevelTest()");
	}
	
	MyBlockLevelTest(int a)
	{
		System.out.println("MyBlockLevelTest(int a)");
	}
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
//		MyBlockLevelTest obj = new MyBlockLevelTest();
//		obj.a = 90;
//		sa = 80;
		new MyBlockLevelTest(12);
//		obj.b = 90; // error

	}
}


class A
{
	private A(){
		System.out.println("A()");
	}
	
	A (int a){
		
	}
	
	static
	{
		System.out.println("class A static block");
	}
	
	{
		System.out.println("class A object block");
	}
}

class BA extends A
{
	BA(){
		super(12);
		System.out.println("BA()");
	}
	
	BA(int a)
	{
		super(13);
		System.out.println("BA(int a)");
	}
	static
	{
		System.out.println("class BA static block");
	}
	
	{
		System.out.println("class BA object block");
	}
		
}