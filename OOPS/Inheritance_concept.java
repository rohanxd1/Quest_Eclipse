package OOPS;
class A
{ 
	static String s1="This is A";
}
class B extends A
{
	 String s2="This is B";
}
class C extends B
{
	public void display(String s)
	{
		System.out.println(s);
	}
}
public class Inheritance_concept 
{
	public static void main(String args[])
	{
		C cObj= new C();
		cObj.display(C.s1);
		cObj.display(cObj.s2);
	}

}
