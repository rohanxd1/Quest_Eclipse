package UserDefinedExceptionTest;

public class FemaleUnderage extends ArithmeticException 
{   @Override
	public String getMessage()
	{
		return "Underage";
	}
}
