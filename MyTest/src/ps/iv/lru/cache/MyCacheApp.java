/**
 * 
 */
package ps.iv.lru.cache;

/**
 * @author e3025685
 *
 */
public class MyCacheApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LRUCache cache = new LRUCache();
		
		cache.put(1, 10);
		cache.put(2, 20);
		cache.put(3, 30);
		cache.put(4, 40);
		cache.put(5, 50);
		
		System.out.println(cache.toString());
		

	}

}
