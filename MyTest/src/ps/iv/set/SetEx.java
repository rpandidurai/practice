package ps.iv.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetEx implements Comparable<SetEx>{

	private int id;
	private String name;
	
	public SetEx(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	public static void main(String[] args) {
		Set<String> s = new HashSet<>();
		Set<SetEx> sx = new HashSet<>();
		Set<SetEx> ts = new TreeSet<>();
		
		s.add(new String("One"));
		s.add(new String("Two"));
		s.add(new String("One"));
		s.add(new String("Three"));
		s.add(null);
		System.out.println(s);
		
		sx.add(new SetEx(1, "One"));
		sx.add(new SetEx(2, "Two"));
		sx.add(new SetEx(1, "One Dup"));
		sx.add(new SetEx(0, "Zero"));
		sx.add(null);
		System.out.println(sx);
		
		ts.add(new SetEx(1, "One"));
		ts.add(new SetEx(2, "Two"));
		ts.add(new SetEx(1, "One Dup"));
		ts.add(new SetEx(0, "Zero"));
//		ts.add(null); // NullPointerException
		System.out.println(ts);

	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return id;
	}
	
	@Override
	public boolean equals(Object obj) {
		SetEx se = (SetEx) obj;
		return this.id ==  se.id;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id+" : "+name;
	}

	@Override
	public int compareTo(SetEx o) {
		// TODO Auto-generated method stub
		return  o.id - this.id;
	}
}
