/**
 * 
 */
package ps.iv.java8.interfce;

/**
 * @author e3025685
 *
 */
public interface A {

	String name = "Interface A";
	public strictfp default String getName()
	{
		return "A";
	}
	
//	public strictfp void loadInterface(); // comile time error
}
