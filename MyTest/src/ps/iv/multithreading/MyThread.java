/**
 * 
 */
package ps.iv.multithreading;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Base64;
import java.util.UUID;

import org.w3c.dom.Node;

/**
 * @author e3025685
 *
 */
public class MyThread {

	private static final char[] CA = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();
	private static final int[] IA = new int[256];
	static {
		Arrays.fill(IA, -1);
		for (int i = 0, iS = CA.length; i < iS; i++)
		{
//			System.out.print(CA[i]);
			IA[CA[i]] = i;
			System.out.println(IA[CA[i]]);
		}
		System.out.println();
		IA['='] = 0;
	}
	
	public static String createUUIDString() {
        try {
            // Create the unique identifier
            UUID vIdentifier = UUID.randomUUID();
            
            System.out.println(vIdentifier.getLeastSignificantBits());
            // Write the bytes to a buffer and base 64 encode the result     
            byte[] vBytes = ByteBuffer.allocate(16).putLong(0, vIdentifier.getLeastSignificantBits()).putLong(8, vIdentifier.getMostSignificantBits()).array();
            
            // Encode the value into a string
            String vEncodedValue = Base64.getMimeEncoder().encodeToString(vBytes);
            
            // Release the buffer and return the string
            vBytes = null;                
            return vEncodedValue;
        }
        catch (Exception e) {
            
        }
        return "";
    }
	/**
	 * @param args
	 */
	public static volatile int vValue = 1;
	public static void main(String[] args) {
		
		System.out.println(createUUIDString());
		// TODO Auto-generated method stub
		/*ThreadA a = new ThreadA();
		a.start();
		
		RunnableThread r = new RunnableThread();
		
		Thread rt = new Thread(r);
		rt.start();*/
	}

}
