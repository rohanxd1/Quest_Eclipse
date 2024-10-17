package OOPS;
import java.util.*;

public class Overloading 
{ void area(int s)
	{
		System.out.println("Area of Square:"+(s*s));
		System.out.println();
	}
  void area(int l,int b)
    {
	  	System.out.println("Area of Rectangle:"+(l*b));
	  	System.out.println();
    }
  void area(int a,int b,int c)
  	{	
	  int s=0;
	  double area=0;
	  s=(a+b+c)/2;
	  area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
	  System.out.println("Area of Triangle:"+area);
	  System.out.println();
  	}
  void area(double r)
  	{
	  double area=0;
	  area=3.14*r*r;
	  System.out.println("Area of Circle:"+area);
	  System.out.println();
  	}
 public static void main(String[] args) 
  {	Scanner sc=new Scanner(System.in);
	Overloading obj=new Overloading();
	int ch=0;
	do
	{System.out.print("1.Sqaure:\n2.Rectangle\n3.Triangle\n4.Circle\n5.Exit\nEnter Choice:");
	 ch=sc.nextInt();
	 switch(ch)
	 {
	  case 1:int s;
	  		 System.out.print("Enter Side Length of Square:");
	  		 s=sc.nextInt();
	  		 obj.area(s);
		  	 break;
	  case 2:int l=0,b=0;
	  		 System.out.print("Enter Length:");
	  		 l=sc.nextInt();
	  		 System.out.print("Breadth:");
	  		 b=sc.nextInt();
	  		 obj.area(l,b);
		  	 break;
	  case 3:int a=0,c=0,d=0;
	  		 System.out.print("Enter Sides of Triangle\na:");
	  		 a=sc.nextInt();
	  		 System.out.print("b:");
	  		 c=sc.nextInt();
	  		 System.out.print("c:");
	  		 d=sc.nextInt();
	  		 obj.area(a,c,d);
		     break;
	  case 4:double r=0;
	  		 System.out.print("Enter Radius of Circle:");
	  		 r=sc.nextDouble();
	  		 obj.area(r);
		  	 break;
	  case 5:System.out.println("Exited");
		     break;
	 }
	}while(ch!=5);
	sc.close();
  }
}
