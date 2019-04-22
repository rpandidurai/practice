/**
 * 
 */
package ps.iv;

import java.util.Comparator;

/**
 * @author e3025685
 *
 */
public class Employee {
	
	private int id;
	private String name;
	private int age;
	private long salary;
	private String designation;
	
	public Comparator<Employee> idComparator = new Comparator<Employee>() {
		@Override
		public int compare(Employee o1, Employee o2) {
			// TODO Auto-generated method stub
			return o1.getId() - o2.getId();
		}
	};
	
	public Comparator<Employee> ageComparator = new Comparator<Employee>() {
		@Override
		public int compare(Employee o1, Employee o2) {
			// TODO Auto-generated method stub
			return o1.getAge() - o2.getAge();
		}
	};
	
	public Comparator<Employee> nameComparator = new Comparator<Employee>() {
		@Override
		public int compare(Employee o1, Employee o2) {
			// TODO Auto-generated method stub
			return o1.getName().compareTo(o2.getName());
		}
	};
	
	public Comparator<Employee> desgnComparator = new Comparator<Employee>() {
		@Override
		public int compare(Employee o1, Employee o2) {
			// TODO Auto-generated method stub
			return o1.getDesignation().compareTo(o2.getDesignation());
		}
	};
	
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
		
	public Employee(int id, String name, int age, long salary, String designation) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.designation = designation;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id+"-"+name+"-"+age+"-"+designation+"-"+salary;
	}

}
