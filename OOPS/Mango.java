package OOPS;

public class Mango
{ int price=0;
  String Taste;
  String colour;
  public Mango(int price,String colour)
  { this.price=price;
  	this.colour=colour;
  }
  public Mango(int price,String colour,String Taste)
  {  this(price,colour);
	 this.Taste=Taste;
	 
  }
  public void display()
  {
	  System.out.println("Price:"+price+" Colour:"+colour);
	  if(Taste!=null)
	  {
		  System.out.println("Taste:"+Taste);
	  }
	  else
	  {
		  System.out.println();
	  }
  }
}
