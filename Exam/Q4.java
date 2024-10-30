package Exam;
//user defined exception
import java.util.*;
public class Q4 
{
	public static void main(String args[])
	{	
		int age = 0;
		try
		{
			System.out.print("Age:");
			Scanner sc=new Scanner(System.in);
			sc.nextInt();
			sc.close();
		}
		catch(IllegalArgumentException e)
		{
			e.printStackTrace();
		}
		if(age<18)
		{
			throw new IllegalArgumentException("Underage");
		}
		else
		{
			System.out.println("Above 18");
		}
		
	}
}
