package ExceptionHandling.ExceptionHandlingTest;

public class TryCatchFinallyIndexExcep 
{public static void main(String[] args) 
	{
	 try
	 {
		 int ar[]= {1,2,3};
		 System.out.println(ar[4]);
	 }
	 catch(ArrayIndexOutOfBoundsException e)
	 {
		 e.printStackTrace();
	 }
	}

}
