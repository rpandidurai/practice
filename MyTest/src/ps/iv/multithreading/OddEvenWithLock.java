package ps.iv.multithreading;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class OddEvenWithLock extends Thread{

	private Value v = null;
	private int o ;
	private Lock l = new ReentrantLock();
	
	public OddEvenWithLock(Value v, int o) {
		this.o = o;
		this.v = v;
	}

	public static void main(String[] args) {
		Value v = new Value();
		Thread odd = new OddEvenWithLock(v, 1);
		Thread even = new OddEvenWithLock(v, 0);

		odd.setName("odd");
		even.setName("even");

		odd.start();
		even.start();
	}

	//Semaphore Start
	/*@Override
	public void run() {
		try {
			v.s.acquire();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		while (v.value <= 10) {
			if (v.getValue() % 2 == this.o)
			{
				System.out.println(Thread.currentThread().getName() +"-"+v.getValue());
				v.value++; 
				v.s.release();
			}
		}
	}*/
	// Semaphore end
	//}

	/*			@Override
			public void run() {
				synchronized (v) {
					while (v.value <= 10) {
						if (v.getValue() % 2 == this.o)
						{
							System.out.println(Thread.currentThread().getName() +"-"+v.getValue());
							v.value++;
							v.notify();
						}
						else
						{
							try {
								v.wait();
							} catch (InterruptedException e) {

								e.printStackTrace();
							}
						}
					}
				}
	 */
	
	@Override
	public void run() {
		
		while (v.value <= 10) {
			l.lock();
			if (v.value <= 10 && v.value <= 10 && v.getValue() % 2 == this.o)
			{
				System.out.println(Thread.currentThread().getName() +"-"+v.getValue());
				v.value++;
				l.unlock();
			}
		}
		
	}
	
}

class Value
{
	volatile int value = 1;
	private int count = 10;
	Semaphore s = new Semaphore(1);

	public void printNumber()
	{
		System.out.println(Thread.currentThread().getName()+"-"+value);
	}

	public int getValue()
	{
		return value;
	}
}
