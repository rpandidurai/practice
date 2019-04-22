/**
 * 
 */
package ps.iv.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author e3025685
 *
 */
public class TestSingletonClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MySingleton instance1 = MySingleton.getInstance();
		
		MySingleton instance2 = null;
		
		Constructor[] constructors = MySingleton.class.getDeclaredConstructors();
		try 
		{
			for(Constructor c : constructors)
			{
				c.setAccessible(true);

				instance2 = (MySingleton)c.newInstance();

			}

		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("instance1 : " + instance1.hashCode());
		System.out.println("instance2 : " + instance2.hashCode());
		
		EnumSingleton es = EnumSingleton.INSTANSE;
		es.printMessage();
		es.printMessage("Enum Singleton class...");
		// 
		/*
		EnumSingleton es = EnumSingleton.INSTANSE;
		EnumSingleton es2 = null;
		System.out.println(es.i);
		es.i = 0;
		System.out.println(es.i);
		
		constructors =  EnumSingleton.class.getConstructors();
		
		try 
		{
			for(Constructor c : constructors)
			{
				c.setAccessible(true);

				es2 = (EnumSingleton)c.newInstance();

			}

		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("es : " + es.hashCode());
		if(es2 != null)
		System.out.println("es2 : " + es2.hashCode());
		*/
		//
		// Serializable 
		try 
		{
			MySingleton seri1 =  MySingleton.getInstance();
			
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("singleton.text"));
			out.writeObject(seri1);
			out.close();
			
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("singleton.text"));
			MySingleton seri2 = (MySingleton) in.readObject();
			
			System.out.println("seri1 : " + seri1.hashCode());
			System.out.println("seri2 : " + seri2.hashCode());
			
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//CLoning
		try {
			MySingleton c1 =  MySingleton.getInstance();
			c1.id =20;
			c1.list.add("One");
			MySingleton c2 =  (MySingleton) c1.clone();
			
			System.out.println("c1 : " + c1.hashCode());
			System.out.println("c2 : " + c2.hashCode());
			System.out.println("List c1 - "+c1.list + " c1 id : " + c1.id + " , c2 id : " + c2.id + " : List - c2 "+c2.list);
			c2.id = 30;
			c2.list.add("C2");
			System.out.println("List c1 - "+c1.list + " c1 id : " + c1.id + " , c2 id : " + c2.id+ " : List c2 - "+c2.list);
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
