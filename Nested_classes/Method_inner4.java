package Nested_classes;

public class Method_inner4 
{
	void Method1()
	{
		class classInner
		{
			void display()
			{
				System.out.println("hello");
			}
		}
		classInner ob1=new classInner();  //obj creation in method itself
	}

}
