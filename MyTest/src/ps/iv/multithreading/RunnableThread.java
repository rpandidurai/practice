/**
 * 
 */
package ps.iv.multithreading;

/**
 * @author e3025685
 *
 */
public class RunnableThread implements Runnable{

	@Override
	public void run() {
		System.out.println("RunnableThread running...");
		
		for(int i = 0; i < 5; i++)
		{
			System.out.println("Runnable... - vValue" + MyThread.vValue);
			try {
				Thread.sleep(10);
				MyThread.vValue = MyThread.vValue + i;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
