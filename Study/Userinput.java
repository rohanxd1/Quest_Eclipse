package Study;
import java.util.*;

public class Userinput {
	void addNum(int a,int b) 
	{
		System.out.println(a+"+"+b+ " is :"+(a+b));
	}
	void subNum(int a,int b) 
	{
		System.out.println(a+"-"+b+ " is :"+(a-b));
	}
	void mulNum(int a,int b) 
	{
		System.out.println(a+"*"+b+ " is :"+(a*b));
	}
	void divNum(int a,int b) 
	{	
			double ans=0;
			ans=a/b;
			System.out.println(a+"/"+b+ " is :"+ans);
			System.out.println("Remainder is :"+(a%b));
	
	}
	
	public static void main(String args[])
	{
		int a=0,b=0;
		System.out.print("Enter A:");
		Scanner sc= new Scanner(System.in);
		a=sc.nextInt();
		System.out.print("B:");
		b=sc.nextInt();
		Userinput ob1= new Userinput();		
		int choice=0;
		while(choice!=5)
		{	System.out.print("\n1.Add\n2.Subtract\n3.Multiply\n4.Divide\n5.Exit\nEnter your choice:");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1: ob1.addNum(a, b);
						break;
				case 2: ob1.subNum(a, b);
						break;
				case 3: ob1.mulNum(a, b);
						break;
				case 4: ob1.divNum(a, b);
						break;
				case 5: System.out.println("Exiting!!");
						break;
				default : System.out.println("Enter Valid input!");
						  break;
			}
		}
		sc.close();
	}
}
