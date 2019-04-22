/**
 * 
 */
package ps.iv;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author e3025685
 *
 */
public class EmployeeChainedComparator implements Comparator<Employee> {

	public List<Comparator<Employee>> employeeComparator =  new ArrayList<Comparator<Employee>>();
	private Comparator<Employee>[] comparators;
	
	public EmployeeChainedComparator(Comparator<Employee>... comparators)
	{
		this.comparators = comparators;
		employeeComparator = Arrays.asList(comparators);
	}
	
	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		for(Comparator<Employee> comp : employeeComparator)
		{
			int result = comp.compare(o1, o2);
			if(result != 0)
			{
				return result;
			}
		}
		return 0;
	}
}
