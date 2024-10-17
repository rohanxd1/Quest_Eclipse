package ExceptionHandling;

public class ArrayOut 
{public static void main(String[] args) 
	{ int ar[]= {1,2,3};
	try {
			System.out.println(ar[5]);
		}
	catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Index out of bound");
			e.printStackTrace();
		}
	finally
		{
			System.out.println("REst of the code");
		}
 	
	}

}
