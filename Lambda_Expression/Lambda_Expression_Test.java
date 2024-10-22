	package Lambda_Expression;
	
	interface drawable
	{
		void draw();
	
	}
	interface drawable2
	{
		void draw2(String shape);
	}
	public class Lambda_Expression_Test 
	{
		public static void main(String args[])
		{
			int a=20;
			drawable d=()->{
			System.out.println("HI"+a);
			};
			d.draw();
			drawable2 d2=(shape)->
			{
				System.out.println(shape+" "+a);
			};
			d2.draw2("Triangle");
			d2.draw2("Circle");
		}
	}
