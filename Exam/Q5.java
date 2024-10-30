package Exam;
//list Iterator
import java.util.*;
public class Q5 
{
	public static void main(String args[])
	{
		ArrayList<Integer> l1=new ArrayList<>();
		l1.add(10);
		l1.add(60);
		l1.add(12);
		l1.add(50);
		l1.add(20);

		ListIterator<Integer> itr=l1.listIterator();
		System.out.println(l1);
				
		while(itr.hasNext())
		{	int num=itr.next();
			if(num==50)
			{
				itr.set(20);
				itr.add(66);
			}
		}
		System.out.println(l1);
		itr=l1.listIterator(l1.size());
		System.out.print("From the end\n[");
		while(itr.hasPrevious())
		{
			System.out.print(itr.previous());
			if(itr.hasPrevious())
			{
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}

}
