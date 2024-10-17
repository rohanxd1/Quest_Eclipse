package Study;

public class Swapno3rdvar 
{
	public static void main(String args[])
	{
		int a=10,b=25;
		System.out.println("Before Swapping A:"+a+"\nB:"+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping A:"+a+"\nB:"+b);
	}
}
