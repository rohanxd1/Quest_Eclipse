package ExceptionHandling;

public class ThrowExcep 
{ public static  void main(String[] args)
	{ System.out.println("Hello");
	  m1();
	}
  public static void m1()
  {
	  if(4<6)
	  {
		  throw new ArrayIndexOutOfBoundsException();
//		  we can put explicit exceptions using throws even if no exceptions
	  }
  }

}
