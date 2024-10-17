package Study;
import java.util.*;
public class Stringbuffertest {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter text:");
		String s1;
		s1=sc.nextLine();
		String revString= new StringBuffer(s1).reverse().toString();
		System.out.println("Reversed String is:"+revString);
		int num=0;
		System.out.print("Enter a number:");
		num=sc.nextInt();
		String revnumstring=new StringBuffer(Integer.toString(num)).reverse().toString();
		int revnum=Integer.valueOf(revnumstring);
		System.out.println("Reversed Number is: " + revnum);
		sc.close();
	}

}
