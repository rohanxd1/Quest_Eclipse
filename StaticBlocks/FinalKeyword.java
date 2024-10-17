package StaticBlocks;

public class FinalKeyword 
{ final int a=10;
  final int b;
  static final int c;
		{
			System.out.println("non staticc block");
//			a=20; cannot be reassigned
			b=20;//can only do static in static and vice versa
		}
  static{
	     c=10;
	     System.out.println("Static block");
        }
  public static void main(String[] args) 
  {
	FinalKeyword obj=new FinalKeyword();
	System.out.println(obj.a);
  }
}
