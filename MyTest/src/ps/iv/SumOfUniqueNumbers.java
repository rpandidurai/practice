package ps.iv;

import java.util.HashSet;
import java.util.Set;

public class SumOfUniqueNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numbers[] = {6, 8,1, 2, 3, 4, 3, 2, 1, 1, 6, 6, 6, 6};
		
		Set<Integer> numberSet = new HashSet<Integer>();
		Set<Integer> existNumberSet = new HashSet<Integer>();
		int sum = 0;
		for (int i = 0; i < numbers.length ; i++)
		{
			if (!numberSet.contains(numbers[i]))
			{
				sum = sum + numbers[i];
				numberSet.add(numbers[i]);
			}
			else if (!existNumberSet.contains(numbers[i]))
			{
				sum = sum - numbers[i];
				existNumberSet.add(numbers[i]);
			}			
		}
		
		System.out.println("Sum of unique numbers : " + sum );
	}

}
