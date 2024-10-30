package Threads_Test;

public class Runnable_Lambda 
{public static void main(String args[])
	{
		Runnable r1= ()->{
			for(int i=0;i<10;++i)
			{
				System.out.println("T1");
			}
		};
		Runnable r2=()->{
			for(int i=0;i<10;++i)
			{
				System.out.println("T2");
			}
		};
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		t1.start();
		t2.start();
	}

}
