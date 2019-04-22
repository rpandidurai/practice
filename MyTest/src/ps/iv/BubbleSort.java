/**
 * 
 */
package ps.iv;

import java.util.Arrays;

/**
 * @author e3025685
 *
 */
public class BubbleSort {

	/**
	 * @param args
	 */
	public void sortBubble(int arr[])
	{
		int n = arr.length;
		boolean swap = false;
		for(int i=0; i < n ; i++)
		{
			swap = false;
			for(int j = 0; j < (n - i-1); j++)
			{
				if(arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swap = true;
				}
				
			}
			
			if(!swap)
			{
				break;
			}
		}
	}
	public static void main(String[] args) {
		
		int arr[] = {2, 4, 1, 6, 78, 32, 90, 43, 20, 78, 13};
		
		BubbleSort bs = new BubbleSort();
		//bs.sortBubble(arr);
		bs.recBubbleSort(arr, arr.length, 0, 0);
		
//		for(int a : arr)
		System.out.println(Arrays.toString(arr));
	}
	
	public void recBubbleSort(int arr[], int n, int i, int j)
	{
		if(i >= n)
		{
			return;
		}
		
		if(j < n-1)
		{
			recBubbleSort(arr, n, i, j+1);
			if (arr[j] > arr[j+1])
			{
				int tmp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = tmp;
			}
		}
		
		if(j==0)
		recBubbleSort(arr, n, i+1, 0);	
		
	}

}
