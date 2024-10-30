package Threads_Test;

public class Demo2 extends Thread
{
	public void run()
	{	for(int i=0;i<100;++i)
		{
			System.out.println("Writing: "+Thread.currentThread().getName()+" : "+Thread.currentThread().getPriority());
		}
	}
}
