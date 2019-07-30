package ps.iv.exceptions;

public class CustomExceptionTest {

	public static void main(String[] args) throws Exception {
		
		Parent parent = new Parent();
		
		parent.m1();
		
		Child child = new Child();
		
		child.m1();
		
		
	}

}


class Parent extends RuntimeException
{
  	public void m1() throws Parent, Exception
  	{
  		throw new Parent();
  	}
}

class Child extends Parent
{
	public void m1() throws Exception
	{
		throw new Exception();
	}
}