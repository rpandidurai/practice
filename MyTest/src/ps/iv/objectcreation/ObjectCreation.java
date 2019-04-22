/**
 * 
 */
package ps.iv.objectcreation;

import java.io.File;
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
public class ObjectCreation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {			
		// new keyword
		Student s1 = new Student();
		
		s1.setRollNo(1l);
		s1.setStudentName("Pandidurai R");
		s1.setCurrentClass("X");
		
		System.out.println(s1);
		
		// Class.forName
		
		try {
			
			Student s2 = (Student) Class.forName("ps.iv.objectcreation.Student").newInstance();
			s2.setRollNo(26);
			s2.setStudentName("ShanthaSheela J");
			s2.setCurrentClass("B.Tech");
			
			System.out.println(s2);
			
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		//Contructors class
		Student s3 = null;
		try {
			
			Constructor<Student> c = Student.class.getConstructor();	
			s3 = c.newInstance();
			s3.setRollNo(2l);
			s3.setStudentName("IYAL PS");
			s3.setCurrentClass("Pre Pre");
			
			System.out.println(s3);
			
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException |NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Cloning
		
		Student s4 = null;
		try 
		{
			s4 = (Student) s3.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(s4);
		
		
		// Serializable
		
		FileOutputStream fo;
		try 
		{
			fo = new FileOutputStream(new File("Student.obj"));
			ObjectOutputStream oo = new ObjectOutputStream(fo);
			
			oo.writeObject(s4);
			
			oo.close();
			
			FileInputStream fi = new FileInputStream(new File("Student.obj"));
			ObjectInputStream oi = new ObjectInputStream(fi);
			
			Student s5 = (Student) oi.readObject();
			
			oi.close();
			
			System.out.println(s5);
			
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
