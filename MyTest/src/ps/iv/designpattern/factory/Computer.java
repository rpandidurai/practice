package ps.iv.designpattern.factory;

public abstract class Computer {

	public String RAM;
	public String HDD;
	public String processor;
	
	public abstract String getRam();
	public abstract String getHdd();
	public abstract String getProcessor();
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Computer with the config of ( RAM size : "+this.RAM+", HDD size : "+ this.HDD +", PROCESSOR : "+this.processor+")";
	}
	
	public enum ComputerType
	{
		LAPTOP(1),
		PC(2);
		
		private int value;
		
		private ComputerType(int value) {
			this.value = value;
		}
		
		public int getValue()
		{
			return this.value;
		}
	}
}
