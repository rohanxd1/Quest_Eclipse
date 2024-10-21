package Questions;
//add student name and grade and display,remove by name,search by name and sort by name
import java.util.*;
public class Students_record 
{public static void main(String args[])
	{Students_record_class[] students=new Students_record_class[20];
	 Scanner sc=new Scanner(System.in);
	 ArrayList<Students_record_class> slist=new ArrayList<Students_record_class>();
	 Iterator<Students_record_class> itr=slist.iterator();
	 int ch=0,i=0;
	 do
	 {
		 System.out.print("1.Add Students\n2.Display\n3.Remove\n4.Search\n5.Sort\n6.Exit\nEnter Choice:");
		 ch=sc.nextInt();
		 sc.nextLine();
		 boolean found=false;
		 switch(ch)
		 {
		 	case 1:System.out.print("Enter Name:");
		 		   String name=sc.nextLine();
		 		   System.out.print("Enter Grade:");
		 		   int grade=sc.nextInt();
		 		   students[i]=new Students_record_class(name,grade);
		 		   slist.add(students[i]);
		 		   ++i;
		 		   System.out.println("Record Added Successfully\n");
		 		   break;
		 	case 2:if(slist.isEmpty())
		 		   {
		 				System.out.println("No Entries present");
		 		   }
		 		   else
		 		   {
		 			   
		 			   for(Students_record_class s:slist)
		 			   {
		 				   System.out.println(s);
		 			   }
		 		   }
		 		   System.out.println();
		 		   break;
		 	case 3:if(slist.isEmpty())
		 		   {
	 					System.out.println("No Entries present\n");
	 					break;
		 		   }
		 		   System.out.print("Enter name of student to remove:");
		 		   String n=sc.nextLine();
		 		   found=false;
		 		   itr=slist.iterator();
		 		   while(itr.hasNext())
		 		   {
		 			Students_record_class s1=itr.next();
		 			if(s1.name.equalsIgnoreCase(n))
		 			{
		 				found=true;
		 				System.out.println(s1);
		 				itr.remove();
		 				System.out.println("Record was removed Successfuly\n");
		 				
		 			}
		 		   }
		 		   if(!found)
		 		   {
		 			   System.out.println(n+" was not found\n");
		 		   }
		 		   break;
		 	case 4:if(slist.isEmpty())
		 	       {
					System.out.println("No Entries present\n");
					break;
	 		       }
		 		   System.out.print("Enter name of student to search:");
		 		   String nsearch=sc.nextLine();
		 		   found=false;
		 		   itr=slist.iterator();
		 		   while(itr.hasNext())
		 		   {
		 			   Students_record_class s1=itr.next();
		 			   if(s1.name.equalsIgnoreCase(nsearch))
		 			   {
		 				   found=true;
		 				   System.out.println(s1);
		 				   itr.remove();
		 				   System.out.println("Record was found Successfuly\n");
	 				
		 			   }
		 		   }
		 		   if(!found)
		 		   {
		 			   System.out.println(nsearch+" was not found");
		 		   }
		 		   break;
		 	case 5:if(slist.isEmpty())
	 	       	   {
		 			System.out.println("No Entries present\n");
		 			break;
	 	       	   }
		 		   System.out.print("1.Ascending\n2.Descending\nEnter Choice:");
		 		   int choice = sc.nextInt();
		 		   if(choice==1)
		 		   {   System.out.println("Ascending order:");
		 			   Collections.sort(slist,new StudentAscSort());
		 			   itr=slist.iterator();
		 			   while(itr.hasNext())
		 			   {
		 				   System.out.println(itr.next());
		 			   }
		 		   }
		 		   else if(choice==2)
		 		   {   System.out.println("Descending order:");
		 			   Collections.sort(slist,new StudentDescSort());
		 			   itr=slist.iterator();
		 			   while(itr.hasNext())
		 			   {
		 				   System.out.println(itr.next());
		 			   }
		 		   }
		 		   else
		 		   {
		 			   System.out.println("Enter valid input");
		 		   }
		 		   break;
		 	case 6:System.out.println("Exiting");
		 }
	 }while(ch!=6);
	}

}
