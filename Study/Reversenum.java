package Study;
import java.util.*;
public class Reversenum {
	public static void main(String args[])
	{	Scanner sc=new Scanner(System.in);
		int a=0,num=0;
		System.out.print("Enter 3 Digit number:");
		a=sc.nextInt();
		if(a>999)
		{	System.out.println("Number greater than 3 digit...triming");
			while(a>999)
			{
				a=a/10;
			}
		}
		int ones,tens,hun;
		num=a;
		ones=num%10;
		num=num/10;
		tens=num%10;
		hun=num/10;
		int rev_num;
		rev_num=(ones*100)+(tens*10)+hun;
		System.out.println("Revers of "+a+" is :"+rev_num);
		sc.close();
	
	}

}
