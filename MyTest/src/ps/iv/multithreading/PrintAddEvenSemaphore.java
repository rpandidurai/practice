package ps.iv.multithreading;

import java.util.concurrent.Semaphore;

public class PrintAddEvenSemaphore extends Thread{

	static Semaphore s = new Semaphore(1);
	
	private static int totalCount = 10;
	private static volatile int number = 1;	
	
	private static String obj = new String();
	
	private int remainder = 0;
	
	public PrintAddEvenSemaphore(int remainder) {
		this.remainder = remainder;
	}
	
	public static void main(String[] args) {
		
		PrintAddEvenSemaphore t1 = new PrintAddEvenSemaphore(1);
		PrintAddEvenSemaphore t2 = new PrintAddEvenSemaphore(0);
		t1.setName("Odd1");
		t2.setName("Even2");
		t1.start();
		t2.start();
	}
	
	@Override
	public void run() {		
		
		while (number <= totalCount)
		{
			try {
				s.acquire();
//				if ((number > totalCount))
//				{
//					return;
//				}
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			try
			{
				if (number % 2 == remainder)
				{
					System.out.println(Thread.currentThread().getName()+" : "+ number++);		
				}
				
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
//			number++;
			s.release();	
		}
	}

}
