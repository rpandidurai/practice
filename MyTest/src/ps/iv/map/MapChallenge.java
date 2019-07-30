package ps.iv.map;

import java.util.HashMap;
import java.util.Map;

public class MapChallenge {

	private static int i = 0;
	
	public static void main(String[] args) {
		
		Map<Person, String> map = new HashMap<Person, String>();
		
		map.put(new Person(1, "Kishore"), "Kishore");
		map.put(new Person(1, "Pandi"), "Pandi");
		map.put(new Person(1, "Barath"), "Barath");
		
		System.out.println(map);
		
		System.out.println(map.get(new Person(1, "Barath")));
	}
	
	public void newMethod(int i)
	{
		i++;
	}

}

class Person
{
	private int id;
	private String name;
	
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {		
		return id;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Person o = (Person) obj;
		return this.name.equals(o.getName());
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id + " - "+this.name;
	}
}
