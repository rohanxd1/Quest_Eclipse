package ExceptionHandling;

import java.io.FileNotFoundException;

//throws only take checked errors i.e non runtime errors..it can take multiple exceptions..
//throws shift respsonsibiity to handle error to parent fn..methods to main..main to jvm
public class ThrowsExcep 
{ public static void main(String[] args)throws InterruptedException,FileNotFoundException
	{
	 m1();
	}
  static void m1() throws InterruptedException,FileNotFoundException
  {
	  System.out.println("Hello");
	  Thread.sleep(5000);
	  System.out.println("World");
  }
}
