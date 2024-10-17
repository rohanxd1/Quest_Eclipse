package Collections_Study;
import java.util.*;
public class Comparable_test
{public static void main(String args[])
	{
		
		Comparable_test_class ob1=new Comparable_test_class(4,"abc");
		Comparable_test_class ob2=new Comparable_test_class(5,"hgds");
		Comparable_test_class ob3=new Comparable_test_class(2,"hghg");
		Comparable_test_class ob4=new Comparable_test_class(3,"rohan");
		Comparable_test_class ob5=new Comparable_test_class(1,"aahe");
		Comparable_test_class ob6=new Comparable_test_class(10,"ueur");
		Comparable_test_class ob7=new Comparable_test_class(4,"lkd");
		ArrayList<Comparable_test_class> list=new ArrayList<>();
		list.add(ob1);
		list.add(ob2);
		list.add(ob3);
		list.add(ob4);
		list.add(ob5);
		list.add(ob6);
		list.add(ob7);
		Collections.sort(list);
		for(Comparable_test_class ob:list)
		{
			System.out.println(ob);
		}
		
	}

}
