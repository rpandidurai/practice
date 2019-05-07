package ps.iv.java8.lambda;

public class SimpleLambdaTest {

	public static void main(String[] args) {		
		
		Calc sum = (a, b) -> {return a + b;};
		Calc sub = (a, b) -> {return a - b;};
		Calc multiply = (a, b) -> {return a * b;};
		Calc divide = (a, b) -> {return a / b;};
		Calc mod = (a, b) -> {return a % b;};
		
		
		System.out.println(Calc.doCalc(Calc.add, 2, 3));
		System.out.println(Calc.doCalc(sub, 2, 3));
		System.out.println(Calc.doCalc(multiply, 2, 3));
		System.out.println(Calc.doCalc(divide, 2, 3));
		System.out.println(Calc.doCalc(mod, 2, 3));
	}

}

@FunctionalInterface
interface Calc
{
	public Calc add = (a, b) -> {return a + b;};
	public int calc(int a, int b);
	
	static int doCalc(Calc c, int a, int b)
	{
		return c.calc(a, b);
	}
}