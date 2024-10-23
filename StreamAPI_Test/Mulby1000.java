package StreamAPI_Test;
import java.util.*;
import java.util.stream.*;
//When using stream operations are done in the stream values..therefore to get value as list use collectors.toList()
//then use collect() method to store that in the list s
public class Mulby1000 
{
	public static void main(String args[])
	{ List<Integer> l1=new ArrayList<Integer>();
	  Scanner sc=new Scanner(System.in);
	  for(int i=0;i<10;++i)
	  {	  
		  System.out.print("Enter number "+(i+1)+":");
		  int num=sc.nextInt();
		  l1.add(num);
	  }
	  List<Integer> s=l1.stream().map(num->num*1000).sorted()/*to sort*/.collect/*to store to s list*/(Collectors.toList());
	  System.out.println(l1);
	  System.out.println(s);
	  sc.close();
	}

}
