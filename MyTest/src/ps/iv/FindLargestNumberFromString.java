/**
 * 
 */
package ps.iv;

/**
 * @author e3025685
 *
 */
public class FindLargestNumberFromString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "156a84b3ndgt10kjh";
		
		char[] carr = str.toCharArray();
		int largestNumber = -1;
		int count = 0;
		for(char c : carr)
		{
			if (c > 47 && c < 58)
			{
				int r = Character.getNumericValue(c);
				if(largestNumber < r)
					largestNumber = r;
			}
		}
		
		System.out.println(largestNumber);

	}

}
