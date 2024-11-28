package Project1;
import  java.sql.*;
import java.util.*;
public class StudentTeacherRec
{	public static String rolecheck(Connection c,String Loginname) throws SQLException
	{	String role=null;
		String display="Select * from Students where name=?";
		PreparedStatement ps=c.prepareStatement(display);
		ps.setString(1,Loginname);
		ResultSet res=ps.executeQuery();
		if(res.next())
		{	
			role="student";
			return role;
		}
		String display2="Select * from teachers where name=?";
		ps=c.prepareStatement(display2);
		ps.setString(1,Loginname);
		res=ps.executeQuery();
		if(res.next())
		{	
			role="teacher";
			return role;
		}
		else
		{	role="null";
			return role;
		}
	}
	



	//student
	public static boolean studentlogin(Connection c,String Loginname,String Studentpass) throws SQLException
	{	
		String display="Select password from Students where name=?";
		try(PreparedStatement ps=c.prepareStatement(display);)
		{
			ps.setString(1,Loginname);
			ResultSet res=ps.executeQuery();
			String dbpass=null;
			if(res.next())
			{	
				dbpass=res.getString(1);
			}
			if(dbpass.equals(Studentpass))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
	}
	public static void studentdisp()
	{
		System.out.print("1.View details\n2.Marklist\n3.Logout\nEnter choice:");
	}
	public static void studentdetails(Connection c,String Loginname) throws SQLException
	{
		String  display="SELECT ID,NAME,YEAR FROM STUDENTS WHERE NAME=?";
		try(PreparedStatement ps=c.prepareStatement(display);)
		{
			ps.setString(1,Loginname);
			ResultSet res=ps.executeQuery();
			if(res.next())
			{
				System.out.println(res.getInt(1)+" "+res.getString(2)+" "+res.getInt(3));
			}
			else
			{
				System.out.println("Error");
			}
		}
	}
//	--------------------------------TEACHERS-------------------------------------------------
	public static void teacherdisplay()
	{
		System.out.print("1.View students\n2.Add students\n3.Search\n4.Add Markilist\n5.Update details\n6.Delete Record\nEnter choice:");
	}
	
	public static void main(String args[]) throws SQLException
	{
		String url="jdbc:mysql://localhost:3306/teacherstudent";
		String username="Rohan";
		String password="Rohan123";
		try(Connection c=DriverManager.getConnection(url,username,password);)
		{
			System.out.print("Login:\nUsername:");
			try(Scanner sc=new Scanner(System.in);)
			{
				String Loginname=sc.nextLine();
				String role=rolecheck(c,Loginname);
//				System.out.print(role);
				if(role.equals("student"))
				{	
					System.out.print("Username:"+Loginname+"\nPassword:");
					String Studentpass=sc.nextLine();
					boolean log=studentlogin(c,Loginname,Studentpass);
//					System.out.println(log); check if login is true
					if(log==true)
					{
						int ch;
						do
						{
							studentdisp();
							ch=sc.nextInt();
							sc.nextLine();
							switch(ch)
							{
								case 1: studentdetails(c,Loginname);
										break;
								case 2:
										break;
								case 3: System.out.println("Logging out and exiting");
										break;
								default:System.out.println("Enter valid input");
										break;
							}
						}while(ch!=3);
					}
					else
					{
						System.out.println("Login Failed.\nIncorrect username/password");
					}
				}
				else if(role.equals("teacher"))
				{
					System.out.println("teacher");
				}
				else
				{
					System.out.println("Invalid credentials(Username)");
				}
			}
			 
			
		}
	}

}
