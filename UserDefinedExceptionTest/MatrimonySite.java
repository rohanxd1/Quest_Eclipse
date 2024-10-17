package UserDefinedExceptionTest;
import java.util.*;
public class MatrimonySite 
{ public static void main(String[] args)
	{
	 	Scanner sc=new Scanner(System.in);
	 	System.out.print("Enter gender (M/F):");
	 	String g=sc.next();
	 	int age;
	 	g=g.toUpperCase();
//	 	boolean flag=false;
//	 	System.out.println(g);
	 	switch(g)
	 	{
	 		case "F": System.out.print("Enter Age:");
	 				  age=sc.nextInt();
	 				  try
	 				  {
		 				  if(age<18)
		 				  {
		 					  throw new FemaleUnderage();
		 					  
		 				  }
		 				  else if(age>35)
		 				  {
		 					  throw new FemaleOverage();
		 				  }
	 				  }
	 				  catch(ArithmeticException e)
	 				  {
	 					  e.printStackTrace();
	 				  }
	 				break;
	 		case "M":System.out.print("Enter Age:");
	 				 age=sc.nextInt();
	 				 try
	 				 {
		 				 if(age<21)
		 				  {
		 					  throw new MaleUnderage();

		 				  }
		 				  else if(age>40)
		 				  {
		 					  throw new MaleOverage();
		 				  }
	 				 }
	 				 catch(ArithmeticException e)
	 				 {
	 					 e.printStackTrace();
	 				 }
	 				break;
	 		default:System.out.println("Enter Valid Gender");
	 				break;
	 	}
	 
	}

}
