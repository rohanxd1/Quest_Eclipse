package Collections_Study;
import java.util.*;
class Product
{
	int a=10;
	String s="Rohan";
	public void display()
	{
		System.out.println("Hello "+s+" "+a);
	}
	@Override
	public String toString()
	{
		return s+" "+a;
	}
}
public class ArrayList_Objects 
{ public static void main(String args[])
	{
		ArrayList <Product> l1=new ArrayList<>();
		Product p1 =new Product();
		Product p2=new Product();
		Product p3=new Product();
		l1.add(p1);
		l1.add(p2);
		l1.add(p3);
		System.out.println(p1);
		for(Product p:l1)
		{
			p.display();
		}
	 
	}

}
