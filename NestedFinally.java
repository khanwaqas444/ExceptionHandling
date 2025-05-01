package exceptionHandling;

public class NestedFinally 
{
	public static void main(String[] args) {
		
		try 
		{
			String a="Waqas";
			System.out.println(a.toLowerCase());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			try
			{
				System.out.println(10/0);
			}
			catch(ArithmeticException a)
			{
				System.out.println(a);
			}
			finally
			{
				System.out.println("Waqas2");
			}
		}
		System.out.println("main method ended");
	}

}
