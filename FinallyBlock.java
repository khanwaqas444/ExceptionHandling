package exceptionHandling;

public class FinallyBlock 
{
	public static void main(String[] args) {
		
		try 
		{
			System.out.println("Main Method Started");
			int a=20,b=0,c;
			c=a/b;
					System.out.println(c);
					System.out.println("Catch Block");
				}
		catch(ArithmeticException a)
		{
			System.out.println("can't devide by zero");
		}
		finally
		{
			System.out.println("Finally Block");
		}
		System.out.println("Main method ended");
	}

}
