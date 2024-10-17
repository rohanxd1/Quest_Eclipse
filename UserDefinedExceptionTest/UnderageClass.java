package UserDefinedExceptionTest;

public class UnderageClass extends ArithmeticException
{   @Override
	public String getMessage()
	{
		return "Underage";
	}
	
}
