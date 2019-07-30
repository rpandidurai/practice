/**
 * 
 */
package ps.iv.lru.cache;

import java.util.HashMap;

/**
 * @author e3025685
 * @param <K>
 *
 */
public class LRUCache<K> {

	HashMap<Integer, Node<Integer, Integer>> map = null;
	static final int capacity = 3;
	
	Node<Integer, Integer> head = null;
	Node<Integer, Integer> tail = null;
	
	public LRUCache() {
		this.map = new HashMap<Integer, Node<Integer, Integer>>();
	}
	
	
	public Integer get(int key)
	{
		if(!map.containsKey(key))
		{
			return -1;
		}
		Node<Integer, Integer> t = map.get(key);
		
		remove(t);
        setHead(t);
 
        return t.value;
	}
	
	public void put(int key, int value) 
	{
		if(map.containsKey(key))
	        {
	            Node<Integer, Integer> t = map.get(key);
	            t.value = value;
	 
	            remove(t);
	            setHead(t);
	        }
	        else
	        {
	            if(map.size() >= capacity)
	            {
	                map.remove(tail.key);
	                remove(tail);
	            }
	 
	            Node<Integer, Integer> t = new Node<Integer, Integer>(key, value);
	            setHead(t);
	            map.put(key, t);
	        }
	    }
	 
	private void remove(Node t)
	{
		if (t.prev != null)
		{
			t.prev.next = t.next;
		}
		else
		{
			head = t.next;
		}
		
		if(t.next != null)
		{
			t.next.prev = t.prev;
		}
		else
		{
			tail = t.prev;
		}
	}
	
	private void setHead(Node t)
	{
		if(head != null)
		{
			head.prev = t;
		}
		
		t.next = head;
		t.prev = null;
		
		head = t;
		
		if(tail != null)
		{
			tail = head;
		}
	}	
}
