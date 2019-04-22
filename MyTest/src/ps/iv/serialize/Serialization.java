/**
 * 
 */
package ps.iv.serialize;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author e3025685
 *
 */
public class Serialization {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException
	{		
		A a = new A();
		
		a.setId(1);
		a.setName("Pandidurai");
		
		System.out.println(a);
		
		FileOutputStream f = new FileOutputStream("a.txt");
		ObjectOutputStream o = new ObjectOutputStream(f);
		
		o.writeObject(a);
		
		
		FileInputStream fr = new FileInputStream("a.txt");
		ObjectInputStream or = new ObjectInputStream(fr);
		
		A a1 = (A) or.readObject();
		
		System.out.println(a1);
	}

}


class A implements Serializable
{
	private int id;
	private static String name;
	
	public Object readResolve();
	{
		return this;
	}
	
	public A() {
		System.out.println("A instantiated...");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public static String getName() {
		return name;
	}
	public static void setName(String name) {
		A.name = name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id + " " + name;
	}
}