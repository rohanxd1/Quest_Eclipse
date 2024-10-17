package ExceptionHandling.ExceptionHandlingTest;

public class TryCatchFinallyArith
{ public static void main(String[] args)
	{
	 try
	 {
		 int a=20/0;
		 System.out.println(a);
	 }
	 catch(ArithmeticException e)
	 {
//		 e.printStackTrace();
		 System.out.println(e);
		 System.out.println("Hello");
	 }
	 finally
	 {
		 System.out.println("Finally Executes");
	 }
	 
	}

}
