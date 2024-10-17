package Collections_Study;
import java.util.*;
//maintain ins order
public class LinkedHashSet_test 
{public static void main(String args[])
	{
		LinkedHashSet<Object> obj=new LinkedHashSet<Object>();
		obj.add(5);
		obj.add(2);
		obj.add(1);
		obj.add(6);
		obj.add(5);
		obj.add(10);
		System.out.println(obj);
	}

}
