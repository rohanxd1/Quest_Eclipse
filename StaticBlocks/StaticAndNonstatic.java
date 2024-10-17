package StaticBlocks;

public class StaticAndNonstatic 
{ static int a=10;
	{ System.out.println("Hello");
	}
	static 
	{
		int b=10;
		System.out.println("Hi"+b);
	}
	public static void main(String[] args)
	{
		StaticAndNonstatic ob1=new StaticAndNonstatic();
	}

}
