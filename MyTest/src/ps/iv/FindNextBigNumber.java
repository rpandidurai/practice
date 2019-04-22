package ps.iv;

public class FindNextBigNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int seq[] = {10, 15, 16, 20, 23, 56};
		int key = 10;
		for(int i = 0; i < seq.length; i++)
		{
			if((seq[i] % key) == 0)
			{
				if(++i < seq.length)
				System.out.println(seq[i]);
				break;
			}
		}
	}
}
