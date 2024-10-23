package Questions;
import java.util.*;
import java.util.stream.*;
//given list of int remove dupli skip first 2 unique num and return next 3 num from llist in reverse order
public class Stream_workout 
{
	public static void main(String args[])
	{
		List<Integer> l1=new ArrayList<Integer>();
		 Scanner sc=new Scanner(System.in);
		  for(int i=0;i<10;++i)
		  {	  
			  System.out.print("Enter number "+(i+1)+":");
			  int num=sc.nextInt();
			  l1.add(num);
		  }
		  System.out.println("Original list:\n"+l1);
		List<Integer> s=l1.stream().distinct()
								   .skip(2).collect(Collectors.toList());
		System.out.println("After removing duplicate and skipping 2:\n"+s);
		Collections.reverse(s);
		System.out.println("Reversing:\n"+s);
		s=s.stream().limit(3).collect(Collectors.toList());
		System.out.println("Displaying only first 3:\n"+s);
		sc.close();
		
	}
}
