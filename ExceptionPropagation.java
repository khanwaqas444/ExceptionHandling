package exceptionHandling;

public class ExceptionPropagation 
{
	public static void main(String[] args) {
		m1();
	}
	public static void m1()
	{
		try
		{
			m2();
		}
		catch(ArithmeticException a)
		{
			System.out.println("Exception handled..!");
		}
	}
	public static void m2()
	{
		System.out.println(10/0);
	}

}
