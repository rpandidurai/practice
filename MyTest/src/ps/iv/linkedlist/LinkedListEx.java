/**
 * 
 */
package ps.iv.linkedlist;

import java.util.LinkedList;

/**
 * @author e3025685
 *
 */
public class LinkedListEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedList<Integer> L1 = new LinkedList<Integer>();
		LinkedList<Integer> L2 = new LinkedList<Integer>();
		
		L1.add(10);
		L1.add(20);
		L1.add(30);
		L1.add(40);
		
		L2.add(30);
		L2.add(40);
		
		System.out.println(L1.getFirst());
		System.out.println(L2.getLast());
	}
}
