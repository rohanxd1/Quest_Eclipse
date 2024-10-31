package Threads_Test;
import java.util.*;
import java.util.concurrent.CountDownLatch;
class Incrementing_Class
{   static int count=0;
	
	void counter()
	{	
		synchronized(this)
		{
			++count;
		}
	
	}

}
public class Synchronized_Blocks 
{ 
	public static void main(String args[]) throws InterruptedException
	{	Incrementing_Class ob=new Incrementing_Class();
		CountDownLatch latch = new CountDownLatch(2);
		Thread t1=new Thread(()->{
		
		for(int i=0;i<100;++i)
		{
			System.out.println(Thread.currentThread().getName());
			ob.counter();
			System.out.println("Count:"+ob.count);
			latch.countDown();
		}
		});
		
		Thread t2=new Thread(()->{
			for(int i=0;i<100;++i)
			{
				System.out.println(Thread.currentThread().getName());
				ob.counter();
				System.out.println("Count:"+ob.count);
				latch.countDown();
			}
		});
		t1.start();
		t2.start();
		latch.await();
//		t1.join();
//		t2.join();
		System.out.println("Final Count:"+ob.count);
	}
}
