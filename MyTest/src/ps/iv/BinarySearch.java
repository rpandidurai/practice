package ps.iv;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BinarySearch {

	/*public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int sortedArray[] = {2, 3, 5, 6, 8, 9, 10, 20, 30, 44};
		
		
	}
	
	int binarySearch(int arr[], int key)
	{
		int mid = (arr.length - 1 ) / 2;
		
		if(arr[mid] == key)
		{
			return key;
		}
		
		if(arr[mid] < key)
		{
			
		}
		
		return key;
	}*/

	
	 // Returns index of x if it is present in arr[l.. 
    // r], else return -1 
   /* int binarySearch(int arr[], int start, int end, int x) 
    { 
        if (end >= start) { 
            int mid = start + (end - start) / 2; 
  
            // If the element is present at the // 1, 2, 3, 4, 5, 6, 7, 8
            // middle itself 
            if (arr[mid] == x) 
                return mid; 
  
            // If element is smaller than mid, then 
            // it can only be present in left subarray 
            if (arr[mid] > x) 
                return binarySearch(arr, start, mid - 1, x); 
  
            // Else the element can only be present 
            // in right subarray 
            return binarySearch(arr, mid + 1, end, x); 
        } 
  
        // We reach here when element is not present 
        // in array 
        return -1; 
    } */
  
    // Driver method to test above 
    public static void main(String args[]) 
    { 
      /*  BinarySearch ob = new BinarySearch(); 
        int arr[] = { 2, 3, 4, 10, 40, 80, 90, 110, 500 }; 
        int n = arr.length; 
        int x = 90; 
        int result = ob.binarySearch(0, n-1, arr, x); //ob.binarySearch(arr, 0, n - 1, x); 
        if (result == -1) 
            System.out.println("Element not present"); 
        else
            System.out.println("Element found at index " + result); */
        List<String> t =  new ArrayList<String>();
        t.add("test 1");
        MyImmutableClass mb = new MyImmutableClass("Ps", new Date("05/03/1990"), 2,t);
        System.out.println(mb);
        mb.getMyList().add("test 2");
        
        Date n = mb.getDb();
        n = new Date();
        
        System.out.println(mb);
        
        
        
    } 
    
    public int binarySearch(int start, int end, int arr[], int key)
    {
    	if(start <= end)
    	{
    		int mid = start + (end - start)/2;
    		
    		if(arr[mid] == key)
    		{
    			return mid;
    		}
    		
    		if(arr[mid] > key)
    		{
    			return binarySearch(start, mid-1, arr, key);
    		}
    		
    		return binarySearch(mid+1, end, arr, key);
    	}
    
    	return -1;    	    	
    }
}
