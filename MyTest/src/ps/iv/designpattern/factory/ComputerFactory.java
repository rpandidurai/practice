package ps.iv.designpattern.factory;

import ps.iv.designpattern.factory.Computer.ComputerType;

public class ComputerFactory {

	public static Computer getComputer(ComputerType type, String RAM, String HDD, String processor)
	{
		switch(type) 
		{
		case PC:
			return new PC(RAM, HDD, processor);
		case LAPTOP:
			return new LAPTOP(RAM, HDD, processor);		
		}
		
		return null;		
	}
}
