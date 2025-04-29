package exceptionHandling;

public class NumberFormatExce 
{ 
	public static void main(String[] args) {
		String str="waqas";
		
		try
		{
			int a=Integer.parseInt(str);
			System.out.println(a);
			System.out.println("String NumberFormatException");
		}
		catch(NumberFormatException n) 
		{
			System.out.println("String "+str+" can't be converted to Integer");
		}
	}

}
