package Collections_Study;
import java.util.*;
public class List_Iterator_test 
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
//		Reverse
		iterator=list.listIterator(n);
		counter=n;
		System.out.println("\nDisplaying Elements from back and change value of 3rd elem");
		while(iterator.hasPrevious())
		{	
			
			System.out.println("Element no "+counter+":"+iterator.previous());
			if(counter==3)
			{
				iterator.set(34);
			}
			--counter;
		}
		System.out.println("Updated list"+list);
		sc.close();
	}
}
