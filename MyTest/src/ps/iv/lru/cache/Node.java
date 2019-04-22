/**
 * 
 */
package ps.iv.lru.cache;

/**
 * @author e3025685
 *
 */
public class Node {

	int key;
	int value;
	
	Node prev;
	Node next;
	
	public Node(int key, int value) {		
		this.key = key;
		this.value = value;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return key + " " + value;
	}
}
