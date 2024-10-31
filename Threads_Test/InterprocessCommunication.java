package Threads_Test;
import java.util.*;
import java.util.concurrent.*;
class Bag {
    static int data;
    static boolean fullness = false;

    synchronized void producer(int data) throws InterruptedException {
        while (fullness) {
            wait();
//            System.out.println("Bag Full");
        }
        System.out.println("Current Thread:" + Thread.currentThread().getName());
        this.data = data;
        fullness = true;
        System.out.println("Data produced: " + data);
        notify();
    }

    synchronized void consumer() throws InterruptedException {
        while (!fullness) {
            wait();
//            System.out.println("Bag empty");
        }
        System.out.println("Current Thread:" + Thread.currentThread().getName());
        System.out.println("Consumed data: " + data);
        fullness = false;
        notify();
    }
}

public class InterprocessCommunication 
{
	public static void main(String args[]) throws InterruptedException 
	{
		Random random=new Random();
		Bag b1=new Bag();
		Thread t1= new Thread(()->{
			Thread.currentThread().setName("Producer Thread");
			for(int i=0;i<10;++i)
			{
//				System.out.println("Current Thread:"+Thread.currentThread().getName());
				int data=random.nextInt();
				try
				{					
					b1.producer(data);
					Thread.sleep(2000);
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
			}
		});
		
		Thread t2=new Thread(()->{
			Thread.currentThread().setName("Consumer Thread");
			for(int i=0;i<10;++i)
			{
//				System.out.println("Current Thread:"+Thread.currentThread().getName());
				try
				{					
					b1.consumer();
					Thread.sleep(1000);
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
			}
		});
		t1.start();
		t2.start();
	}
}
