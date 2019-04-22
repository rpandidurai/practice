/**
 * 
 */
package ps.iv.singleton;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author e3025685
 *
 */
public class MySingleton implements Serializable, Cloneable{

	private static MySingleton instanse = new MySingleton();
	
	public int id = 10;
	
	public List<String> list = new ArrayList<String>();
	
	public static MySingleton getInstance()
	{
		return instanse;
	}
	
	private MySingleton()
	{
		
	}
	
	public Object readResolve()
	{
		System.out.println("readResolve Invoked...");
		return instanse;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		throw new CloneNotSupportedException();
//		return super.clone();
	}
}
