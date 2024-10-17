package Collections_Study;
import java.util.*;
//iterrator only forward traversal..need to be reset if used again..so use ListIterator
//if no element in list and next is used before hasnext then IllegalStateException
//if next is called befor useing hasnext at end of list no elem present then NoSuchELementException
public class Iterator_Test 
{ public static void main(String args[])
	{
	
		ArrayList<Integer> list=new ArrayList<>();
		System.out.print("Enter num:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;++i)
		{	
			System.out.print("Enter "+(i+1)+"th element:");
			int num=sc.nextInt();
			list.add(num);
		}
		Iterator<Integer> itr=list.iterator();
		int counter=1;
		System.out.println("\nDisplaying Elements");
		while(itr.hasNext())
		{	
			System.out.println("Element no "+counter+":"+itr.next());
			++counter;
		}
		
		  itr = list.iterator(); // Reset iterator
	        while (itr.hasNext())
	        {
	            if (itr.next() == 34) 
	            {
	                itr.remove();
	            }
	        }
		counter=1;
		itr=list.iterator();
		System.out.println("\nDisplaying Elements after deleting 34 if present");
		while(itr.hasNext())
		{	
			System.out.println("Element no "+counter+":"+itr.next());
			++counter;
		}
		
		sc.close();
	}
}
