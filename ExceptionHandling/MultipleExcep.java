package ExceptionHandling;

public class MultipleExcep 
{ public static void main(String[] args)
	{
		int ar[]= {1,2,3,4};
		try
		{
			int num=ar[8];
			int a=num/0;
			System.out.println(a);
		}
		catch(ArithmeticException e)
		{	e.printStackTrace();			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Normal FLow preserved");
	}
	

}
