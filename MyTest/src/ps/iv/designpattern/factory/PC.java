package ps.iv.designpattern.factory;

public class PC extends Computer {

	PC(String RAM, String HDD, String processor)
	{
		this.RAM = RAM;
		this.HDD = HDD;
		this.processor = processor;
	}
	
	@Override
	public String getRam() {
		
		return this.RAM;
	}

	@Override
	public String getHdd() {
		
		return this.HDD;
	}

	@Override
	public String getProcessor() {
		
		return this.processor;
	}

}
