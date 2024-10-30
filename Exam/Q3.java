package Exam;
//multiple catch blocks
import java.util.*;
public class Q3 
{
	public static void main(String args[])
	{
		String a,b;
		try
		{
		System.out.print("A:");
		Scanner sc=new Scanner(System.in);
		a=sc.nextLine();
		System.out.print("B:");
		b=sc.nextLine();
		int result;
		result=Integer.parseInt(a)/Integer.parseInt(b);
		System.out.println(result);
		sc.close();
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		catch(NumberFormatException e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Rest of code");
		}
	}

}
