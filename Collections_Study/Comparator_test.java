package Collections_Study;
import java.util.*;
public class Comparator_test 
{	public static void main(String[] args) 
	{ 
	  ArrayList<Comparator_test_class> Product=new ArrayList<Comparator_test_class>();
	  Product.add(new Comparator_test_class(5,"Lays",20));
	  Product.add(new Comparator_test_class(1,"Bingo",10));
	  Product.add(new Comparator_test_class(10,"Bytes",15));
	  Product.add(new Comparator_test_class(3,"Cheetos",10));
	  Product.add(new Comparator_test_class(7,"Oreo",15));
	  Product.add(new Comparator_test_class(2,"JimJam",15));
	  System.out.println("List is:");
	  for(Comparator_test_class c:Product)
	  {
		  System.out.println(c);
	  }
	  Collections.sort(Product,new priceAscSort());
	  System.out.println("\nPrice sort ASC:");
	  for(Comparator_test_class c:Product)
	  {
		  System.out.println(c);
	  }
	  Collections.sort(Product,new nameDescSort());
	  System.out.println("\nName sort DESC:");
	  for(Comparator_test_class c:Product)
	  {
		  System.out.println(c);
	  }
	  Collections.sort(Product,new idAscSort());
	  System.out.println("\nID sort ASC:");
	  for(Comparator_test_class c:Product)
	  {
		  System.out.println(c);
	  }
	}

}
