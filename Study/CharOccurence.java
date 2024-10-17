package Study;
import java.util.*;
public class CharOccurence 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s1;
		System.out.print("Enter String:");
		s1=sc.nextLine();
		int s1len=s1.length();
		char sar[]=s1.toCharArray();
		System.out.print("Enter character to search:");
		char c;
		int count=0;
		StringBuffer pos=new StringBuffer();
		boolean flag=false;
		c=sc.nextLine().charAt(0);
		for(int i=0;i<s1len;++i)
		{
			if(c==sar[i])
			{
				flag=true;
				++count;
				pos.append(i+1);
				if(i<s1len-1)
				{
					pos.append(",");
				}
			}
		}
		if(flag==false)
		{
			System.out.println("Character "+c+" not found in string: "+s1);
		}
		else
		{
			System.out.println("Character '"+c+"' found "+count+" times in string \""+s1+"\" at positions: "+pos+".");
		}
		
		sc.close();
	}
}
