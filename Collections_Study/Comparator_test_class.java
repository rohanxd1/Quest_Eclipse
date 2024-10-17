package Collections_Study;
import java.util.*;
public class Comparator_test_class //product
{		int id;
		String name;
		int price;
		public Comparator_test_class(int id,String name,int price)
		{
			this.id=id;
			this.name=name;
			this.price=price;
		}
		@Override
		public String toString()
		{
			return "Id:"+id+" Name:"+name+" Price:"+price;
		}
	
}
//for price asc
class priceAscSort implements Comparator<Comparator_test_class>
{
	public int compare(Comparator_test_class c1,Comparator_test_class c2)
	{
		return c1.price-c2.price;
	}
}
class nameDescSort implements Comparator<Comparator_test_class>
{
	public int compare(Comparator_test_class c1,Comparator_test_class c2)
	{
		return c2.name.compareTo(c1.name);
	}
}
class idAscSort implements Comparator<Comparator_test_class>
{
	public int compare(Comparator_test_class c1,Comparator_test_class c2)
	{
		return c1.id-c2.id;
	}
}
