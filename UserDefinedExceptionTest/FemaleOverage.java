package UserDefinedExceptionTest;

public class FemaleOverage extends ArithmeticException
{ 
	@Override
	public String getMessage()
	{
		return "Overage";
	}
}
