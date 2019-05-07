package ps.iv.designpattern.factory;

import ps.iv.designpattern.factory.Computer.ComputerType;

public class TestFactory {

	public static void main(String[] args) {
		Computer pc = ComputerFactory.getComputer(ComputerType.PC, "8 GB", "1 TB", "Core i7 8th gen");
		Computer laptop = ComputerFactory.getComputer(ComputerType.LAPTOP, "16 GB", "2 TB", "Core i7 8th gen");
		
		System.out.println(pc);
		System.out.println(laptop);

	}

}
