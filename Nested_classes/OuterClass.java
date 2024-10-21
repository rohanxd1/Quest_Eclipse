package Nested_classes;

public class OuterClass
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
  static class InnerClass
  {
	 void display()
	 {
//		 System.out.println(a); can only do static var in static inner classes
		 System.out.println(b);
		 m1();
//		 m2(); can only call static methods
	 }
	
  }

}
