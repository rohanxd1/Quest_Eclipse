package Threads_Test;

public class Demo1 extends Thread
{
	public void run()
	{	for(int i=0;i<100;++i)
		{
		System.out.println("Running : "+Thread.currentThread().getName()+" : "+Thread.currentThread().getPriority());
		}
	}
}
