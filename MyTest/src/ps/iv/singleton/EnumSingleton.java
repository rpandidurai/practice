/**
 * 
 */
package ps.iv.singleton;

/**
 * @author e3025685
 *
 */
public enum EnumSingleton {
	INSTANSE;
	
	int i = 10;
	
	public void printMessage()
	{
		System.out.println("Hello...");
	}
	
	public void printMessage(String msg)
	{
		System.out.println(msg);
	}
}
