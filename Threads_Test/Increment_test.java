package Threads_Test;
class incrementer_class
{
	static int count=0;
	synchronized static void counter()
	{
		++count;
//		System.out.println(count);
	}
}

public class Increment_test extends Thread
{	static incrementer_class i1=new incrementer_class();
	public static void main(String args[]) throws InterruptedException
	{
		Thread t1=new Thread(()->{
			for(int i=0;i<100;++i)
			{
				System.out.println("t1");
				i1.counter();
				
			}
		});
		Thread t2=new Thread(()->{
			for(int i=0;i<100;++i)
			{
				System.out.println("t2");
				i1.counter();
			}
		});
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("count:"+i1.count);
	}
}
