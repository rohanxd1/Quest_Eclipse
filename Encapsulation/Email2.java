package Encapsulation;
import java.util.*;
public class Email2 
{ public static void main(String[] args)
	{
		int ch=0;
		Email e=null;
		Scanner sc=new Scanner(System.in);
		do
		{System.out.print("1.Create:\n2.Show Email\n3.Change Password\n4.Exit\nEnter choice:");
		 ch=sc.nextInt();
		 sc.nextLine();
		 switch(ch)
		 { case 1: System.out.print("Enter Email:");
		 			String email;
		 			email=sc.nextLine();
		 			String password;
		 			System.out.print("Enter Password:");
		 			password=sc.nextLine();
		 			e=new Email(email,password);
		 			System.out.println();
			 		break;
		   case 2:  if(e==null)
		   			{
			   			System.out.println("No accounts exist");
		   			}
		   			else
		   			{
		   				System.out.print("Enter Password to show email:");
		   				String pass=sc.nextLine();
		   				if(pass.equals(e.getPass()))
		   					{
		   						String mail=e.getEmail();
		   						System.out.println("Email:"+mail);
		   					}
		   				else
		   					{
		   						System.out.print("Wrong Password\n");
		   					}
		   			}
		   			System.out.println();
			   		break;
		   case 3:	if(e==null)
  					{
	   					System.out.println("No accounts exist\n");
  					}
		   			else
		   			{
		   				System.out.print("Enter Email:");
			   			String mail=sc.nextLine();
			   			System.out.print("Enter old password:");
			   			String pass=sc.nextLine();
			   			if(mail.equals(e.getEmail())&&pass.equals(e.getPass()))
			   			{
			   				System.out.print("Enter new Password:");
			   				pass=sc.nextLine();
			   				e.setPass(pass);
			   			}
			   			else
			   			{
			   				System.out.println("Wrong password or email");
			   			}
		   			}
		   			System.out.println();
			   		break;
		   case 4: System.out.print("Exiting\n");
			   		break;
		   default: System.out.println("Wrong input try again.\n");
			   		break;
		 
		 }
		}while(ch!=4);
		sc.close();
	}
  
}
