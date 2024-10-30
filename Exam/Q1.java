package Exam;
//Nullpointer Exception
import java.util.*;
public class Q1 
{
	public static void main(String args[])
	{	try
		{
		 	String s1=null;
		 	int num=100;
		 	System.out.println(100/s1.length());
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Rest of code");
		}
	}
}
