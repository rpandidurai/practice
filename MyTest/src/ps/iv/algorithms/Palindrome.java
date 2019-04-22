package ps.iv.algorithms;

public class Palindrome {

	public static void main(String[] args) {
		
		int number = 371;
		int reversed = 0, temp = 0;
		temp = number;
		int arms = 0, n =0;
		
		for (; temp != 0; temp /= 10, n++);
			
		temp = number;
		
		while (temp != 0)
		{
			int reminder = temp % 10;
			reversed = reversed * 10 + reminder;
			arms = arms + (int) Math.pow(reminder, n);
			temp = temp / 10 ;			
		}

		System.out.println("Original - "+number);
		System.out.println("Reversed - "+reversed);
		System.out.println("Arms - "+arms);
		
		System.out.println("Is palindrome "+ (number == reversed));
	}

}
