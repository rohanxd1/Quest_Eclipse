package Threads_Test;

public class Demo_Main 
{public static void main(String args[])
	{	
		Demo1 t1=new Demo1();
		Demo2 t2=new Demo2();
		t1.start();
		
		t2.start();
	}

}
