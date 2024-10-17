package ExceptionHandling;
import java.util.*;
public class IntToStringExcep 
{ public static void main(String[] args)
	{Scanner sc=new Scanner(System.in);
	 String s;
	 System.out.print("Enter Number:");
	 s=sc.nextLine();
	 int a;
	 try
	 {		 
		 a=Integer.parseInt(s);
		 System.out.println(a);
	 }
	 catch(Exception e)
	 {
		 System.out.println(e);
	 }
	 System.out.println("Normal Flow preserved");
	 sc.close();
	}

}
