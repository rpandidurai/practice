/**
 * 
 */
package ps.iv;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author e3025685
 *
 */
public class SortEmployee {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> empList = new ArrayList<Employee>();
		
		empList.add(new Employee(1, "Pandidurai", 28, 2000, "SSE"));
		empList.add(new Employee(2, "Pandiselvam", 24, 3000, "SSE"));
		empList.add(new Employee(3, "Sekar", 29, 200000, "SSE"));
		empList.add(new Employee(5, "Dinesh", 27, 600000, "DB"));
		empList.add(new Employee(4, "Shankar", 28, 70000, "SAE"));
		
List<Employee> empList1 = new ArrayList<Employee>();
		
		empList1.add(new Employee(1, "Pandidurai", 28, 2000, "SSE"));
		empList1.add(new Employee(2, "Pandiselvam", 24, 3000, "SSE"));
		empList1.add(new Employee(3, "Sekar", 29, 200000, "SSE"));
		empList1.add(new Employee(5, "Dinesh", 27, 600000, "DB"));
		empList1.add(new Employee(4, "Shankar", 28, 70000, "SAE"));
		
		
		empList.sort(new EmployeeChainedComparator(new Employee().idComparator, new Employee().nameComparator, new Employee().ageComparator));		
		System.out.println(empList);
		
		empList1.sort(new Employee().idComparator);
		empList1.sort(new Employee().nameComparator);
		empList1.sort(new Employee().ageComparator);
		
		System.out.println(empList1);
	}

}
