package Collections_Study;

import java.util.*;

public class Array_List 
{ public static void main(String args[])
	{
		ArrayList <String> Alist=new ArrayList<String>();
		Alist.add("Rohan");
		Alist.add("Arman");
		Alist.add("Pooja");
		Alist.add("Rohan");
		Alist.add("Shreyas");
		System.out.println(Alist);
		Alist.remove("Shreyas");
		System.out.println(Alist);
		System.out.println(Alist.size());
		System.out.println(Alist.get(1));
		ArrayList <String> Alist2=new ArrayList<>(Arrays.asList("Dhanush","Figo","Nayanraj"));
		System.out.println(Alist.equals(Alist2));
		Alist.addAll(Alist2);
		Alist.add("Dhanush");
		System.out.println(Alist);
		Alist2.add("Rohan");
		System.out.println(Alist2);
//		Alist.removeAll(Alist2);
		Alist.retainAll(Alist2);
		System.out.println(Alist);
//		ArrayList ilist=new ArrayList();
	}

}
