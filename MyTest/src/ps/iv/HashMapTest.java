/**
 * 
 */
package ps.iv;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * @author e3025685
 *
 */
public class HashMapTest {

	public static void main(String[] args) {
		Employees e1 = new Employees(1, "Pandidurai");
		Employees e2 = new Employees(2, "Pandidurai");
		Employees e3 = new Employees(3, "Pandidurai");
		Employees e4 = new Employees(4, "Pandidurai 2");
		Employees e5 = new Employees(5, "Pandidurai 2");
		Employees e6 = new Employees(6, "Pandidurai");
		Employees e7 = new Employees(7, "Pandidurai");
		Employees e8 = new Employees(8, "Pandidurai");
		Employees e9 = new Employees(9, "Pandidurai 2");
		Employees e10 = new Employees(10, "Pandidurai 2");
		Employees e11 = new Employees(11, "Pandidurai");
		Employees e12 = new Employees(12, "Pandidurai");
		Employees e13 = new Employees(13, "Pandidurai");
		Employees e14 = new Employees(14, "Pandidurai 2");
		Employees e15 = new Employees(15, "Pandidurai 2");
		Employees e16 = new Employees(16, "Pandidurai 2");
		Employees e17 = new Employees(17, "Pandidurai 2");
		Employees e18 = new Employees(18, "Pandidurai 2");
		Employees e19 = new Employees(19, "Pandidurai 2");
		Employees e20 = new Employees(20, "Pandidurai 2");
		Employees e21 = new Employees(21, "Pandidurai 2");
		
//		if(e1.equals(e4))
//		{
//			System.out.println("TRUE");
//		}
		//Map<Employees, String> eMap =  new HashMap<Employees, String>();
		Hashtable<Employees, String> eMap = new Hashtable<Employees, String>();
		
		eMap.put(e1, "E1");
		eMap.put(e2, "E2");
		eMap.put(e3, "E3");
		eMap.put(e4, "E4");
		eMap.put(e5, "E5");
		eMap.put(e6, "E1");
		eMap.put(e7, "E2");
		eMap.put(e8, "E3");
		eMap.put(e9, "E4");
		eMap.put(e10, "E5");
		eMap.put(e11, "E1");
		eMap.put(e12, "E2");
		eMap.put(e13, "E3");
		eMap.put(e14, "E4");
		eMap.put(e15, "E5");
		eMap.put(e16, "E4");
		eMap.put(e17, "E5");
		eMap.put(e18, "E5");
		eMap.put(e19, "E4");
		eMap.put(e20, "E5");
		eMap.put(e2, "E5");
		
		
		
		//ht.put(e1, "E1");
//		
//		System.out.println(eMap);
//		System.out.println(eMap.containsKey(e1));
		
		Map m = new HashMap();
		m.put(1, "No 1");
		m.put(Integer.valueOf(1), "Integer 1");
		m.put(Long.valueOf(3), "Long 3");
		m.put(Float.valueOf(4), "Float 4");
		m.put(Character.valueOf('5'), "Character 5");		
		m.put(new String("6"), "String 6");
		m.put("6", "literal 6");
		
		
//		m.keySet().add(7);
		//m.putAll(eMap);
		m.putIfAbsent(3, "New 3333");
		System.out.println(m.toString());
		
		// New 
		
		Hashtable<Employees, String> testHashMap = new Hashtable<Employees, String>();
		
		for(int i=0; i < 10000; i++)
		{
			testHashMap.put(new Employees(i, "Pandi "+i), "Value Pandi "+i);
		}
		
		System.out.println(testHashMap.size());
		System.out.println(testHashMap);
	}
}


final class Employees
{

	
	final private int id;
	final private String name;
	
	public Employees(int id, String name) 
	{
		this.id = id;
		this.name = name;
	}

	final public int getId() 
	{
		return id;
	}

	final public String getName() 
	{
		return name;
	}
	
	
	@Override
	public int hashCode() 
	{
		// TODO Auto-generated method stub
		System.out.println("Employees hashcode : "+this.id);
		int key = 12;
		//System.out.println("Hash : " + (this.id + this.name.length()));
		return key ;//+ this.name.length();
	}
	
	@Override
	public boolean equals(Object obj) 
	{
		System.out.println("Employees equals " + this.id);
		/*if(obj == null)
		{ 
			return false;
		}
		if(obj instanceof Employees)
		{			
			Employees tmpObj = (Employees) obj;
			System.out.println("Comparing with " + tmpObj.id);
			if(this.getId() == tmpObj.getId())
			{
				return true;
			}
		}
		*/
		return false;
		
	}	
}