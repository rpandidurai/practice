package ps.iv;

public  class Customer {

	public int custId = 1;
	public String custType = "P";
	public String custName;

	
	Customer ()
	{
		System.out.println("Normal constructor");
	}
	
	Customer(String name, String type)
	{
		System.out.println("constructor with Name");
		this.custName = name;
	}
	
	Customer(int custId)
	{
		System.out.println("constructor with Name");
		this.custId = custId;
	}
	
	
	
	public static void main(String[] args) 
	{
		
		Customer cust1 = new Customer();
		
		System.out.println(cust1.custName);
		
		Customer cust2 = new Customer("Pandi", "N");
		cust2.custId = 2;
		cust2.custType = "N";
		System.out.println(cust2.custName);
		
		Customer cust3 = new Customer();
		cust3.custId = 3;		
		System.out.println(cust3.custName);
	}
	
	public void printBalance()
	{
		System.out.println("Bal ");
	}

	public <T> T getProcessed(T t)
	{
		return t;
	}
}
