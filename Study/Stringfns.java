package Study;
import java.util.*;
public class Stringfns {
	public static void main(String args[])
	{
		String name;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter name:");
		name=sc.nextLine();
		System.out.println("Your name is:"+name);
		int len=0;
		len=name.length();
		String subs= new String();
		System.out.println("Length is:"+len);
		subs=name.substring(2,7);
		System.out.println("Substring is:"+subs);
		String name2="                    Rohan Martin   ";
		String no_spaces=name2.trim();
		System.out.println(name2+" with No Trailing White spaces:"+no_spaces);
		String day=String.join("/","01","06","2002");
		System.out.println("Formatted Date:"+day);
		System.out.println("UpperCase:"+(name.toUpperCase()));
		System.out.println("LowerCase:"+(name.toLowerCase()));
		sc.close();
	}
}
