package Nested_classes;

interface Demo
{
	abstract void run();
}
class A
{
	public void MyMethod(Demo d)
	{
		System.out.println("Hello");
		d.run();
	}
}
public class Anyonymous_Method 
{
	public static void main(String[] args) 
	{
		A ob=new A();
		ob.MyMethod(new Demo() 
		{
		 @Override
		 public void run()
		 {
			 System.out.println("Running");
		 }
		 
		});

	}
}
