package Questions;
import java.util.*;
public class MoveHyphens 
{ static String charMoveHyphen(String ar,int len)
	{  int count=0;
	   if(ar==null)
	   {
		   return null;
	   }
	   boolean flag=false;
		for(int i=0;i<len;++i)
		{ 
			if(ar.charAt(i)=='-')
					{
						++count;
						flag=true;
					}
		}
		ar=ar.replace("-","");
		String newString="";
		for(int i=0;i<count;++i)
		{
			newString+="-";
		}
		newString+=ar;
		if(flag==true)
		{
			return newString;
		}
		else
		{
			return ar;
		}
	}
    public static void main(String[] args) 
    {	Scanner sc=new Scanner(System.in);
		System.out.print("Enter String:");
		String str=sc.nextLine();
		int len=str.length();
		
		String result=charMoveHyphen(str, len);
		if(result==null)
		{
			System.out.println("String is null");
		}
		else if(result.equals(str))
		{
			System.out.println("No hyphenns present");
		}
		else
		{
			System.out.println("String after moving hyphens:"+result);
		}
	}
  
}
