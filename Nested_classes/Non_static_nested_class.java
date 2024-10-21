package Nested_classes;

public class Non_static_nested_class 
{ int a=10;
	static int b=20;
	public static void m1()
	{
	  System.out.println("Hello");
	}
	public void m2()
	{
	  System.out.println("hi");
	}
	class inner_nonstatic
	{
		public void m3()
		{
			System.out.println(b);
			m2();
		}
	
	}
}
