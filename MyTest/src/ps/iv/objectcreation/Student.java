/**
 * 
 */
package ps.iv.objectcreation;

import java.io.Serializable;

/**
 * @author e3025685
 *
 */
public class Student implements Cloneable, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7615740314918052408L;
	private long rollNo;
	private  String studentName;
	private  String currentClass;
	
	public long getRollNo() {
		return rollNo;
	}
	public void setRollNo(long rollNo) {
		this.rollNo = rollNo;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCurrentClass() {
		return currentClass;
	}
	public void setCurrentClass(String currentClass) {
		this.currentClass = currentClass;
	}
	
	@Override
	public String toString() {
		return this.rollNo + " - "+ this.studentName + " - " + this.currentClass;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
