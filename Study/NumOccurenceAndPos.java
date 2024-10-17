package Study;
import java.util.*;
public class NumOccurenceAndPos 
{public static void main(String args[])
	{	int size=0;
		System.out.print("Enter Size of integers:");
		Scanner sc=new Scanner(System.in);
		size=sc.nextInt();
		int ar[]=new int[size];
		System.out.println("Enter "+size+" numbers: ");
		for(int i=0;i<size;++i)
		{
			ar[i]=sc.nextInt();
		}
		int num,count=0,posindex=0;
		int pos[]=new int[size];
		boolean flag=false;
		System.out.print("Enter number to search:");
		num=sc.nextInt();
		for(int i=0;i<size;++i)
		{
			if(ar[i]==num)
			{	flag=true;
				++count;
				pos[posindex]=i;
				++posindex;
				
			}
		}
		if(flag==false)
		{
			System.out.println("The number "+num+" was not found");
		}
		else
		{
			System.out.print("The number "+num+" was found "+count+" times at index(s) ");
			for(int i=0;i<count;++i)
			{
				System.out.print(pos[i]);
				if(i<count-1)
				{
					System.out.print(",");
				}
				
			}
			System.out.println(".");
		}
		sc.close();
	}


}
