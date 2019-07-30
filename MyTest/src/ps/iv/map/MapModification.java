package ps.iv.map;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MapModification {

	public static void main(String[] args) 
	{
		Map<Integer, String> hm = new HashMap<>();
		
		putValues(hm);
		
		Map<Integer, String> cm = new ConcurrentHashMap<>();
		
//		putValues(cm);
		
		System.out.println(cm.size());
//		System.out.println(hm);
		int j=10;
		for(Map.Entry<Integer, String> m : cm.entrySet())
		{
			System.out.println(m);
//			if(j == 0)
//			{
//				cm.put(j++, "10");
//				cm.put(j++, "20");
				cm.remove(m.getKey());
//				j++;
//			}
			
		}
		System.out.println(cm.size());
		System.out.println(hm);
	}
	
	public static void putValues(Map<Integer, String> map)
	{
		
		for(int i = 1; i <= 5; i++)
		{
			map.put(i, ""+i);
		}
		map.put(null, null);
		map.put(1, "reloaded");
	}

}
