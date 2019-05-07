/**
 * 
 */
package ps.iv.utils;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.*;

/**
 * 
 *
 */
public final class CommonUtils {

	public static <T> T checkParameterNotNull(T reference)
	{
		if (reference == null)
		{
			Exception e = new IllegalArgumentException("Null not allowed as parameter...");
			//Log it
		}		
		return reference;
	}
	
	
	public static void main (String[] args)
	{
		
		int arr[] = {1,3, 6, 9, 4, 2, 8};
		int arr2[] = {6, 7, 8, 3, 4};
		
//		Integer[] narr =  new Integer(arr2);
		
		int target = 17;
		
		Set<Integer> aSet = new HashSet<Integer>();
		
		aSet = Arrays.stream(arr).boxed().collect(Collectors.toSet());
		
		int a1 = -1;
		int a2 = -1;
		
		for(int i=0; i < arr2.length; i++)
		{
			int key = target - arr2[i];
			
			if(aSet.contains(key))
			{
				a1 = key;
				a2 = arr2[i];
			}
		}
		
		System.out.println(a1 +" , "+ a2);
		
		int[] input = {9, 9, 8};
		
		System.out.println(Arrays.toString(addOneToTheArray(input)));
		printFibnocci(15);
//		System.out.println(Arrays.toString(bubbleSort(arr)));
	}
	
	//Bubble sort	
	public static int[] bubbleSort(int a[])
	{
		int l = a.length;
		boolean swap = false;
		int count=0;
		for(int i=0; i < l; i++)
		{	
			swap = false;
			for(int j=0; j < (l-(i+1)); j++ )
			{		
				count++;
				if(a[j] > a[j+1])
				{
					int t = a[j];
					a[j] = a[j+1];
					a[j+1] = t;
					swap = true;
				}
			}
			
			if(!swap)
				break;
			
		}
		System.out.println(count);
		return a;
	}
	
	public static int[] addOneToTheArray(int input[])
	{
		int result[] = new int[input.length];
		int length = input.length;
		int carry = 1;
		int sum = 0;
		//1234
		for (int i = input.length-1; i >= 0; i--)
		{
			sum = input[i] + carry;
			if(sum == 10)
				carry =1;
			else
				carry =0;
			
			result[i] = sum % 10;
		}
		
		if (carry == 1) 
		{
			result = new int[length+1];
			result[0]= 1;
		}
		
		return result;
	}
	
	public static void printFibnocci(int n)
	{
		int sum = 0;
		int n1=1;
		int n2=0;
		for (int i=0; i < n; i++)
		{
			System.out.print(sum+" ");
			sum = n1+n2;
			n1 = n2;
			n2 = sum;
		}		
	}
	
}
