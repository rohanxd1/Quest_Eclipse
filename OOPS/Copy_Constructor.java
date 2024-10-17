package OOPS;

class circle
{
	int radius;
	String Shape;
	public circle(int radius,String Shape)
	{
		this.radius=radius;
		this.Shape=Shape;
	}
	public circle(circle c)
	{
		this.radius=c.radius;
		this.Shape=c.Shape;
	}
	public void display()
	{
		System.out.println("Radius:"+radius+" Shape"+Shape);
	}
}
public class Copy_Constructor 
{	public static void main(String args[])
	{
		circle c1=new circle(5,"Semi-Circle");
		c1.display();
		circle c2=new circle(c1);
		c2.display();
	}
}
