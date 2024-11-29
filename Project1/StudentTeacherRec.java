package Project1;
import  java.sql.*;
import java.util.*;
public class StudentTeacherRec
{	public static String rolecheck(Connection c,String Loginname) throws SQLException
	{	String role=null;
		String display="Select * from Students where name=?";
		try(PreparedStatement ps=c.prepareStatement(display);)
		{
			ps.setString(1,Loginname);
			try(ResultSet res=ps.executeQuery();)
			{if(res.next())
				{	
					role="student";
					return role;
				}
			}
		}
		String display2="Select * from teachers where name=?";
		try(PreparedStatement ps1=c.prepareStatement(display2);)
		{
			
			ps1.setString(1,Loginname);
			try(ResultSet res1=ps1.executeQuery();)
			{
				if(res1.next())
				{	
					role="teacher";
					return role;
				}
				else
				{	role="null";
					return role;
				}
			}
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
				System.out.println();
			}
			else
			{
				System.out.println("Error\n");
			}
		}
	}
//	--------------------------------TEACHERS-------------------------------------------------
	public static boolean teacherlogin(Connection c,String Loginname,String Teacherpass) throws SQLException
	{	String display="SELECT PASSWORD FROM TEACHERS WHERE NAME=?";
		try(PreparedStatement ps=c.prepareStatement(display);)
		{
			ps.setString(1,Loginname);
			ResultSet res=ps.executeQuery();
			String dbpass=null;
			if(res.next())
			{
				dbpass=res.getString(1);
			}
			if(dbpass.equals(Teacherpass))
			{				
				return true;
			}
			else
			{
				return false;
			}
		}
	}
	public static void teacherdisp()
	{
		System.out.print("1.View students\n2.Add students\n3.Search\n4.Add Markilist\n5.Update details\n6.Delete Record\n7.Logout\nEnter choice:");
	}
	//case1
	public static void allstudisp(Connection c) throws SQLException
	{
		String display="SELECT ID,NAME,YEAR FROM STUDENTS";
		try(PreparedStatement ps=c.prepareStatement(display);)
		{
			try(ResultSet res=ps.executeQuery();)
			{
				if(res.next())
				{	do
					{				
						System.out.println(res.getInt(1)+" "+res.getString(2)+" "+res.getInt(3));
					}while(res.next());
					System.out.println();
				}
				else
				{
					System.out.println("Empty set\n");
				}
			}
		}
	 }
	//case2
	public static void addstud(Connection c) throws SQLException
	{	Scanner sc=new Scanner(System.in);
		String add="INSERT INTO STUDENTS(NAME,PASSWORD,YEAR) VALUES(?,?,?)";
		try(PreparedStatement ps=c.prepareStatement(add);)
		{
			String choice="yes";
			int count=0;
			do
			{   
				System.out.print("Enter name of student:");
				String name=sc.nextLine();
				String p1;
				String p2;
				do
				{				
					System.out.print("Enter new password:");
					p1=sc.nextLine();
					System.out.print("Re-enter password:");
					p2=sc.nextLine();
					if(!(p1.equals(p2)))
					{
						System.out.print("Wrong password\n\n");
					}			
				}while(!(p1.equals(p2)));
				System.out.print("Enter year:");
				int year=sc.nextInt();
				sc.nextLine();
				ps.setString(1,name);
				ps.setString(2,p1);
				ps.setInt(3,year);
				int changes=ps.executeUpdate();
				if(changes>0)
				{
					System.out.println("Record inserted");
					++count;
				}
				else
				{
					System.out.println("Insertion failed");
				}
				System.out.print("Insert again?(y/n)\nEnter choice:");
				choice=sc.nextLine();
			}while(choice.equalsIgnoreCase("yes") || choice.equalsIgnoreCase("y"));
			System.out.print(count+" records entered");
		}
		sc.close();
	}
	
	//case3
	public static void searchbyid(Connection c) throws SQLException 
	{
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter student ID to search: ");
	    int studentId = sc.nextInt();
	    sc.nextLine();
	    String display = "SELECT ID, NAME, YEAR FROM STUDENTS WHERE ID = ?";
	    try (PreparedStatement ps = c.prepareStatement(display)) 
	    {
	    	ps.setInt(1, studentId);
	        try (ResultSet res = ps.executeQuery()) 
	        {
	            if (res.next()) 
	            {
	                System.out.println("Student Found: ");
	                System.out.println("ID: " + res.getInt(1) + ", Name: " + res.getString(2) + ", Year: " + res.getInt(3));
	                System.out.println("\n");
	            } else 
	            {
	                System.out.println("No student found with ID: " + studentId);
	            }
	        }
	    }
	}
	
	//case 4:
	
	//case 5:
	public static void studupdate(Connection c)	throws SQLException
	{
		String update="UPDATE STUDENTS SET ID=?, NAME=? YEAR=? WHERE ID=?";
		try(PreparedStatement ps=c.prepareStatement(update);)
		{
			System.out.print("Enter id of student to update:");
			Scanner sc=new Scanner(System.in);
			int id=sc.nextInt();
			sc.nextLine();
			String disp="SELECT NAME FROM STUDENTS WHERE ID=?";
			try(PreparedStatement dps=c.prepareStatement(disp);)
			{
				dps.setInt(1, id);
				try(ResultSet dres=dps.executeQuery();)
				{
					if(dres.next())
					{
						System.out.println();
					}
				}
			}
		}
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
				boolean log;
				if(role.equals("student"))
				{	
					System.out.print("Username:"+Loginname+"\nPassword:");
					String Studentpass=sc.nextLine();
					log=studentlogin(c,Loginname,Studentpass);
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
//---------------------------------------------------------------------------------------------------------------------------------//
				else if(role.equals("teacher"))
				{
					System.out.print("Username:"+Loginname+"\nPassword:");
					String Teacherpass=sc.nextLine();
					log=teacherlogin(c,Loginname,Teacherpass);
//					System.out.println(log); //check if login is true
					if(log==true)
					{
						int ch;
						do
						{
							teacherdisp();
							ch=sc.nextInt();
							sc.nextLine();
							switch(ch)
							{
								case 1: allstudisp(c);
										break;
								case 2: addstud(c);
										break;
								case 3: searchbyid(c);
										break;
								case 4: 
										break;
								case 5: 
										break;
								case 6: 
										break;
								case 7: System.out.println("Logging out and exiting");
										break;
								default:System.out.println("Enter valid input");
										break;
							}
						}while(ch!=7);
					}
					else
					{
						System.out.println("Login Failed.\nIncorrect username/password");
					}
					
				}
				else
				{
					System.out.println("Invalid credentials(Username)");
				}
			}
			 
			
		}
	}

}
