package ps.iv.multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadInterference extends Thread{

	public static void main(String[] args) {
		
		Foo f = new Foo();
		Far f1 = new Far();
//		f.doCalc();
		
		Thread t1 = new Thread(() ->  f1.doCalc());
		Thread t2 = new Thread(() ->  f1.doCalc());
		
		t1.start();
		
		t2.start();
		f1.doCalc();
	}
	
	

}

class Foo
{
	private int value = 0;
	
	public void doCalc()
	{
		synchronized (this) 
		{
			value = 0;
			System.out.println(Thread.currentThread().getName()+" Values is : "+value);
			value++;
			System.out.println(Thread.currentThread().getName()+" Values++ is : "+value);
			value = 10;
			System.out.println(Thread.currentThread().getName()+" Values +10 is : "+value);	
		}		
	}
	
	public void printHi()
	{
		System.out.println(Thread.currentThread().getName()+" Hi...");
	}
}

class Far
{
	private AtomicInteger value = new AtomicInteger(0);
	
	public void doCalc()
	{
//		synchronized (this) 
//		{
			value.set(1);
			System.out.println(Thread.currentThread().getName()+" Values is : "+value);
			value.getAndIncrement();
			System.out.println(Thread.currentThread().getName()+" Values++ is : "+value);
			value.set(50);
			System.out.println(Thread.currentThread().getName()+" Values +10 is : "+value);	
//		}		
	}
}
