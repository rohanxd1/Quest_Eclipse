package Study;
import java.util.*;
public class Sumofdigi 
{	public static void main(String args[])
	{
		int num=0,sum=0,n=0;
		StringBuffer digits = new StringBuffer();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 3 digi num:");
		num=sc.nextInt();
		n=num;
		System.out.print("Sum of digits of "+num+" is:");
		while(n>0)
		{
			sum+=n%10;
			digits.insert(0,n%10);
			n=n/10;
			if(n>0)
			{
				digits.insert(0,'+');
			}
		}
		System.out.print(digits+"="+sum);
		sc.close();
	}
}
