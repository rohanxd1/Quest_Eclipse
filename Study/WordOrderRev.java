package Study;
import java.util.*;
public class WordOrderRev 
{public static void main(String args[])
	{	Scanner sc=new Scanner(System.in);
		String s1;
		System.out.print("Enter String:");
		s1=sc.nextLine();
		String words[]=s1.split(" ");
		for(int i=(words.length)-1;i>=0;--i)
		{
			System.out.print(words[i]+" ");
		}
		
		sc.close();
	}

}
