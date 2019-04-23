/**
 * 
 */
package ps.iv.utils;

/**
 * @author e3025685
 *
 */
public final class CommonUtils {

	public static <T> T checkParameterNotNull(T reference)
	{
		if (reference == null)
		{
			Exception e = new IllegalArgumentException("Null not allowed as parameter...");
			//Log it
		}
		
		return reference;
	}
	
	
}
