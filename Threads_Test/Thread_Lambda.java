package Threads_Test;

public class Thread_Lambda 
{public static void main(String args[]) throws InterruptedException
	{
		Thread t1=new Thread(()->{
			for(int i=0;i<10;++i)
			{
				System.out.println("T1");
			}
		});
		Thread t2=new Thread(()->{
			for(int i=0;i<10;++i)
			{
				System.out.println("T2");
			}
		});
		t1.setPriority(Thread.MAX_PRIORITY);
		t1.setName("Thread Number 1");
		t1.start();
		System.out.println(t1.getName());
		t2.start();
//		t2.join(); if want continue to execute only after t2 termination
		System.out.println("Continue");
		
	}

}
