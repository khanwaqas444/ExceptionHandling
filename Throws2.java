package exceptionHandling;

public class Throws2 
{
	void div(int a,int b) throws ArithmeticException
	{
		if(b==0)
		{
			throw new ArithmeticException();
		}
		else
		{
			int c=a/b;
			System.out.println(c);
		}
	}
	public static void main(String[] args) {
		Throws2 t=new Throws2 ();
		//t.div(20,0);
		try
		{
			t.div(20,0);
		}
		catch(Exception e)
		{
			System.out.println("The value of b is zero");
		}
	
	}

}
