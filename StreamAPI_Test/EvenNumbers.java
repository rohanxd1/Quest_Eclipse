package StreamAPI_Test;
import java.util.*;
import java.util.stream.*;
public class EvenNumbers 
{
	public static void main(String args[])
	{
		List<Integer> l1=new ArrayList<Integer>();
		  Scanner sc=new Scanner(System.in);
		  for(int i=0;i<6;++i)
		  {	  
			  System.out.print("Enter number "+(i+1)+":");
			  int num=sc.nextInt();
			  l1.add(num);
		  }
		  List<Integer> s=l1.stream().filter(n->n%2==0).distinct()/*to remove duplicate*/.collect(Collectors.toList());
		  //.skip(2) to remove first two numbers
		  //.limit(3) to print only 3
		  System.out.println(l1);
		  System.out.println(s);
		  sc.close();
	}
	
}
