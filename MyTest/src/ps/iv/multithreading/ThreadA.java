/**
 * 
 */
package ps.iv.multithreading;

/**
 * @author e3025685
 *
 */
public class ThreadA extends Thread {

	public ThreadA() {
		// TODO Auto-generated constructor stub
	}
	public ThreadA(Thread a) {
		super(a);
	}
	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub
		System.out.println("ThreadA running...");
		
		for(int i = 0; i < 5; i++)
		{
			System.out.println("Thread - vValue" + MyThread.vValue);
			try {
				sleep(10);
				MyThread.vValue = MyThread.vValue + i;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		super.run();
	}
	
	@Override
	public synchronized void start() {
		// TODO Auto-generated method stub
		System.out.println("ThreadA start");
		super.start();
	}
}
