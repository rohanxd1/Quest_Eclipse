package OOPS;
class A2 
{
	void display()
	{
		System.out.println("This is from A");
	}
}
class B2 extends A2
{	
	void display()
	{
		System.out.println("This is from B");
	}
}
public class Fn_Overriding 
{ public static void main(String[] args)
	{
		B2 b=new B2();
		b.display();
	}

}
