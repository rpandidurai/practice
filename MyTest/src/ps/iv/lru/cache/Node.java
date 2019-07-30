/**
 * 
 */
package ps.iv.lru.cache;

/**
 * @author e3025685
 *
 */
public class Node<K, V> {

	K key;
	V value;
	
	Node<K, V> prev;
	Node<K, V> next;
	
	public Node(K k, V v) {		
		this.key = k;
		this.value = v;
	}
	
	@Override
	public String toString() {
		return key + " " + value;
	}
}
