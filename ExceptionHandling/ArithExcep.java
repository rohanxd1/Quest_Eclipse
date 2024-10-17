package ExceptionHandling;

public class ArithExcep 
{ public static void main(String[] args)
	{
		int a=10;
		int b=0;
		int c;
		try
		{
			c=a/b;
			System.out.println(a+"/"+b+"="+c);
		}
		catch(ArithmeticException e)
		{System.out.println("Division by 0 undefined");
		 e.printStackTrace();	
		}
		finally
		{
			System.out.println("Rest of the code");
		}
	}

}
