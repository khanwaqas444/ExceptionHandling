package exceptionHandling;

class InvalidAgeException extends Exception
{
	InvalidAgeException(String msg)
	{
		System.out.println(msg);
	}
}

public class Throws4 
{
	public static void main(String[] args) {
		
		try
		{
			vote(2);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public static void vote(int age) throws InvalidAgeException
	{
		if(age<18)
		{
			throw new InvalidAgeException("Not eligible for voting");
		}
		else 
		{
			System.out.println("Eligible for voting");
		}
	}
	
}
