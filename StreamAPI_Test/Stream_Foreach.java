package StreamAPI_Test;
import java.util.*;
public class Stream_Foreach 
{
	public static void main(String args[])
	{
		List<Integer>  l1=new  ArrayList<Integer>();
		l1.add(40);
		l1.add(43);
		l1.add(15);
		l1.add(34);
		l1.add(12);
		l1.add(42);
		l1.add(10);
		l1.add(30);
		l1.stream().forEach(n->System.out.println(n));
	} 
}
