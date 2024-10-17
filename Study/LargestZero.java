package Study;
import java.util.*;
public class LargestZero 
{public static void main(String args[])
	{
		String s1;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number:");
		s1=sc.nextLine();
		char sArray[]=s1.toCharArray();
		int count=0,zeroCount=0;
		for(int i=0;i<s1.length();++i)
		{ 	
			if(sArray[i]=='0')
			{ 
				++zeroCount;
			}
			if(sArray[i]!='0'| i==(s1.length()-1))
			{
				if(zeroCount>count)
				{
					count=zeroCount;
					zeroCount=0;
				}
			}
		}
		if(count!=0)
		{
		 System.out.println("Largest Zero Count is:"+count);
		}
		else
		{
			System.out.println("No Zeroes found.");
		}
		
		sc.close();
	}


}
