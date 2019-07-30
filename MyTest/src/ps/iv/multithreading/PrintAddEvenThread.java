package ps.iv.multithreading;

public class PrintAddEvenThread extends Thread
{
	private static int totalCount = 10;
	private volatile static int number = 1;	
	
	private static String obj = new String();
	
	private int remainder = 0;
	
	public PrintAddEvenThread(int remainder) {
		this.remainder = remainder;
	}

	@Override
	public void run() {		
		synchronized (obj) {
			while (number <= totalCount)
			{
				try
				{
					System.out.println(Thread.currentThread().getName()+" : "+ number);
					
					if (number % 2 != remainder)
					{		
						obj.wait();
					}
					else
					{
						obj.notify();
					}
					number++;
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
//				if (number > totalCount)
//				{
//					return;
//				}
				
//				obj.notify();
			}	
		}			
	}
	
	public static void main (String args[])
	{
		PrintAddEvenThread t1 = new PrintAddEvenThread(1);
		PrintAddEvenThread t2 = new PrintAddEvenThread(0);
		t1.setName("Odd");
		t2.setName("Even");
		t1.start();
		t2.start();
	}
	
}



