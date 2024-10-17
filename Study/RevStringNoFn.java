package Study;
import java.util.*;
public class RevStringNoFn 
{public static void main(String args[])
	{
		String s1;
		System.out.print("Enter String to reverse:");
		Scanner sc=new Scanner(System.in);
		s1=sc.nextLine();
		char s1_array[]= s1.toCharArray();
		String revstring= new String();
		for(int i=s1.length()-1;i>=0;--i)
		{
			revstring+=s1_array[i];
		}
		System.out.println("The reversed string is:"+revstring);
		sc.close();
		
	}

}
