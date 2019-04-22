/**
 * 
 */
package ps.iv;


/**
 * @author e3025685
 *
 */
public class StringEx {

	/**
	 * @param args
	 */
	public static void main(java.lang.String[] args) {
		
		B b = new B();
		System.out.println(B.sayHello());
		
		String s1 = "Pandi";
		String s2 = "Pandi";
		
		String s3 = new String("Pandi");
		
		if(s1 == s2)
		{
			System.out.println("S1 and S2 are same");
		}
		
		if(s1 == s3)
		{
			System.out.println("S1 and S3 are same");
		}
		else
		{
			System.out.println("S3 is not same");
		}
	}
	
	public static java.lang.String sayHello()
	{
		return "Hello...";
	}

}

class B extends  StringEx
{
	public static void main(java.lang.String[] args) {
		

	}
	
	public static java.lang.String sayHello()
	{
		return "Hello... from child";
	}
}
