/**
 * 
 */
package ps.iv.algorithms;

/**
 * @author e3025685
 *
 */
public class FindSumOfTwoNum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int arr[] = new int[] {1,2, 4, 6, 3, 7};
		int a[] = getSumOfIndexes(arr, 9);
		
		System.out.println(arr[a[0]] + "," + arr[a[1]]);
	}

	public static int[] getSumOfIndexes(int[] arr, int n)
	{
		for (int i=0; i < arr.length; i++)
		{
			for (int j = i +1; j < arr.length; i++)
			{
				if((arr[i] + arr[j]) == n)
				return new int[] {j, i};
			}			
		}
		
		return new int[2];
	}
}
