package Questions;
//int findCount(int arr[],int length,int num, int diff) return -1 of none
import java.util.*;
public class AbsoluteDiff 
{   public static int findCount(int arr[],int length,int num,int diff)
	{int count=0;
	 for(int i=0;i<length;++i)
	 {
		 if(Math.abs(arr[i]-num)<=diff)
		 {
			 ++count;
		 }
	 }
	 if(count>0)
	 {
		 return count;
	 }
	 else
	 {
		 return -1;
	 }
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of array:");
		int size=sc.nextInt();
		int [] arr=new int[size];
		System.out.println("Enter "+size+" elements:");
		for(int i=0;i<size;++i)
		{
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter Number for absolute sum:");
		int num=sc.nextInt();
		System.out.print("Enter absolute sum:");
		int diff=sc.nextInt();
		int count=0;
		count=findCount(arr,size,num,diff);
		if(count==-1)
		{
			System.out.println("No number valid");
		}
		else
		{
			System.out.println("Number of elements:"+count);
		}
		sc.close();
				
	 }
  

}
