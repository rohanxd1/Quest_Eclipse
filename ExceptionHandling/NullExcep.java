package ExceptionHandling;
public class NullExcep 
{ public static void main(String[] args) 
	{	
		String a=null;
		try
		{
			int len=a.length();
			System.out.println(len);
		}
		catch(Exception e)
		{
		  System.out.println(e);
		}
		System.out.println("Normal flow Maintained");
		
	}	

}
