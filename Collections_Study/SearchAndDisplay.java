package Collections_Study;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class SearchAndDisplay 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> list=new ArrayList<>();
		System.out.print("Enter num:");
		int n=sc.nextInt();
		for(int i=0;i<n;++i)
		{	
			System.out.print("Enter "+(i+1)+"th element:");
			int num=sc.nextInt();
			list.add(num);
		}
		ListIterator<Integer> iterator=list.listIterator();
		int counter=1;
		System.out.println("\nDisplaying Elements");
		while(iterator.hasNext())
		{	
			System.out.println("Element no "+counter+":"+iterator.next());
			++counter;
		}
//		seraching for index
		int pos=0;
		boolean flag=false;
		iterator=list.listIterator();
		while(iterator.hasNext())
		{	
			if(iterator.next()==34)
			{
				pos=iterator.previousIndex();
				flag=true;
			}
		}
		if(flag==true)
		{
			System.out.println("34 was found at pos "+pos);
			System.out.print(list.get(pos));
		}
		else
		{
			System.out.println("NOt found");
		}
		sc.close();
	}

}
