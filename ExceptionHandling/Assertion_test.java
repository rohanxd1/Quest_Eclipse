package ExceptionHandling;

public class Assertion_test 
{public static void main(String args[])
	{	
		try
		{
			int age=14;
			assert age>=18:"Underage";
		}
		catch(AssertionError e)
		{
			System.out.println(e);
		}
	}

}
