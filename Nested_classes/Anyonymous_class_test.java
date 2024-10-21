package Nested_classes;

interface anonymousClass
{
	int a=10;
	void run();
}
public class Anyonymous_class_test 
{
	public static void main(String[] args) 
	{
		anonymousClass m1=new anonymousClass() 
		{
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("running");
				
			}
		};
		m1.run();
	}

}
