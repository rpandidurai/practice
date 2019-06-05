package ps.iv.multithreading;

public class DoubletonThread {

	public static void main(String[] args) {
		
	}

}

class DoubleTon extends Thread
{
	private static final DoubleTon INSTANCE_1 = new DoubleTon("1");
	private static final DoubleTon INSTANCE_2 = new DoubleTon("2");
	
	private String obj;
	private static volatile DoubleTon[] objects = {INSTANCE_1, INSTANCE_2};
	private static volatile int index = 0;
	
	private DoubleTon(String obj)
	{
		this.obj = obj;
	}
	
	public String getObj()
	{
		return this.obj;
	}
	
	public static DoubleTon getInstance1()
	{
		return INSTANCE_1;
	}
	
	public static DoubleTon getInstance2()
	{
		return INSTANCE_2;
	}
	
	public static DoubleTon getInstance()
	{
//		synchronized (objects[index]) {
			index = (index == 0)? 1 : 0;
			return objects[index];
//		}
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i < 10; i++)
		System.out.println(getInstance().getObj());
	}
	
	public static void main(String args[])
	{
		getInstance1().start();
		getInstance2().start();
	}
}

