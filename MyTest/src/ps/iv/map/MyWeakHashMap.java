package ps.iv.map;

import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class MyWeakHashMap {

	String objname = "";
	public MyWeakHashMap(String str)
	{
		this.objname = str;
	}
	
	enum MyEnum
	{
		ONE(1),
		TWO(2),
		THREE(3);
		
		int value;
		
		MyEnum(int value)
		{
			this.value = value;
		}
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return this.value+"";
		}
	}
	
	public static void main(String[] args) {
		
		
		
		
		WeakHashMap<MyWeakHashMap, MyWeakHashMap> wh = new WeakHashMap<>();
		HashMap<MyWeakHashMap, Integer> hm = new HashMap<>();
		
		MyWeakHashMap ob1 = new MyWeakHashMap("ob1");
		MyWeakHashMap ob2 = new MyWeakHashMap("ob2");
		MyWeakHashMap ob13 = new MyWeakHashMap("ob13");
		MyWeakHashMap ob23 = new MyWeakHashMap("ob23");
		
		Map<MyEnum, Integer> em = Collections.synchronizedMap(new EnumMap<>(MyEnum.class));
		
		em.put(MyEnum.TWO, 20);
		em.put(MyEnum.THREE, 30);
		em.put(MyEnum.ONE, 10);
		System.out.println(em);
		
		wh.put(ob1, ob13);
		wh.put(ob2, ob23);
		
//		hm.put(ob1, 1);
//		hm.put(ob2, 2);
		
		System.out.println(wh);
		System.out.println(hm);
		
		ob1 = null;
		
		System.gc();
		
		System.out.println(wh);
		System.out.println(hm);
		
		
		

	}
	@Override
	public String toString() {
		
		return objname;
	}
	 public void finalize() 
     { 
         System.out.println("Finalize method is called"); 
     } 

}
