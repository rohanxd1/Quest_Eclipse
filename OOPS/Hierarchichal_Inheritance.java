package OOPS;
class A1
{
	String s=" Hello from A";
	
}
class B1 extends A1
{
	int a=1;
	public void display()
	{
		System.out.println(a+" "+s);
	}
}
class C1 extends A1
{
	int b=10;
	public void display()
	{
		System.out.println(b+" "+s);
	}
}
public class Hierarchichal_Inheritance 
{ public static void main(String[] args)
	{
		B1 b1=new B1();
		b1.display();
		C1 c1=new C1();
		c1.display();
	}
}
