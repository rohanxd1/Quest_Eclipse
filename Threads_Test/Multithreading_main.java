package Threads_Test;
//we can use threads by wither Threads class or Runnable interface
//if we need multiple threads with same the use interface as it supports multiple inheritance
//when start invoked jvm auto invoke run after craeting thread..but if run explicitly called no thread creation
public class Multithreading_main 
{
	public static void main(String args[])
	{
		Multithreading_Threadclass m1=new Multithreading_Threadclass();//using object of class which is child of thread
		m1.start();//we invoke start but jvm will invoke run automatically
		Multithreading_Runnable m2=new Multithreading_Runnable();//we cannot use thread methods when using interface
		Thread t1=new Thread(m2); //thus we use thread constructor and pass runnable obj as argument
		t1.start();//no we can use start fn of m2 with t1
	}
}
