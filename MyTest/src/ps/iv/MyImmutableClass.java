/**
 * 
 */
package ps.iv;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author e3025685
 *
 */
public final class MyImmutableClass {
	
	private final String name;
	private final Date db;
	private final long id;
	private final List<String> myList;
	
	
	public MyImmutableClass(String name, Date db, long id, List<String> myList) {
		this.name = name;
		this.db = db;//new Date(db.getTime());
		this.id = id;
		this.myList = new ArrayList<String>(myList);
	}
	
	

	public String getName() {
		return name;
	}



	public Date getDb() {
		return new Date(this.db.getTime());
	}



	public long getId() {
		return id;
	}



	public List<String> getMyList() {
		return new ArrayList<String> (myList);
	}



	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<String> myList = new ArrayList<String>();
		myList.add("String 1");
		myList.add("String 2");
		
		MyImmutableClass mi = new MyImmutableClass("Pandidurai", new Date("03/05/1990"), 1l, myList);
		
		System.out.println(mi.myList + " " +  mi.db);
		
		mi.getMyList().add("String 3");		
		myList.add("String 4");
		Date lo = mi.db;
		
		lo.setDate(123);
		List<String> myList2 = mi.myList;
		myList2.add("String 5");
		System.out.println(mi.myList + " " +  mi.db);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id + " - " + name + " - " + db + " ( " + myList + ")";
	}
}
