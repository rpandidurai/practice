/**
 * 
 */
package ps.iv.java8.interfce;

import ps.iv.java8.interfce.A;
import ps.iv.java8.interfce.B;

/**
 * @author e3025685
 *
 */
public interface C extends A, B {

//	@Override
	default String getName() {
		// TODO Auto-generated method stub
		return "C";
	}
	
//	public String getName();

}
