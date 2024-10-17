package ExceptionHandling;

public class FinallyTest 
{ public static void main(String[] args)
	{
		try
		{
			int a=10/0;
		}
//		catch(ArithmeticException e)
//		{
//			e.printStackTrace();
//		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();//even if excep not caught due to wrong catch exception mentioned finally executes
		}
		finally
		{
			System.out.println("Finally block always executes");
//			can also put try and catch inside finally block
		}
		System.out.println("Hello World");
	}

}
