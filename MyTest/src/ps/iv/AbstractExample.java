/**
 * 
 */
package ps.iv;

/**
 * @author e3025685
 *
 */
public abstract class AbstractExample {
	
	private static final String aname = "Final name";
	private String oname = "O name";
	
	public AbstractExample() {
		System.out.println(" * AbstractExample() constructor");
	}
	
	public AbstractExample(String msg) {
		System.out.println(" * AbstractExample() constructor");
	}
	
	public void sayHello()
	{
		System.out.println("Hello from AbstractExample class...");
	}
	
	public abstract void printMessage(String msg);
}
