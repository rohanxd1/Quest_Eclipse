package UserDefinedExceptionTest;
import java.util.*;
public class WebSite 
{ public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter age:");
		int age=sc.nextInt();
		try
		{
			if(age<18)
			{
				throw new UnderageClass();
			
			}
		}
		catch(UnderageClass e)
		{
		 e.printStackTrace();	
		}
		sc.close();
	}
}
