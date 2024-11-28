package JavaDataBaseTest;
import java.util.*;
import java.sql.*;
public class Procedure_calls 
{	public static void display(Connection c) throws SQLException
	{
		System.out.println("Displaying Details:");
		CallableStatement prepcall=c.prepareCall("call display()");
		ResultSet res=prepcall.executeQuery();
		while(res.next())
		{
			System.out.println(res.getInt(1)+" "+res.getString(2)+" "+res.getInt(3));
		}
		System.out.println();
		
	}
	public static void deleterec(Connection c,int id) throws SQLException
	{
		CallableStatement delcall=c.prepareCall("call deletebyid(?)");
		int changes=0;
		delcall.setInt(1,id);
		changes=delcall.executeUpdate();
		System.out.println((changes>0) ? changes+" records deleted":"Deletion failed");
		System.out.println();
	}
	public static void insertrec(Connection c,int id,String name,int age) throws SQLException
	{
		CallableStatement inscall=c.prepareCall("call insertrec(?,?,?)");
		inscall.setInt(1, id);
		inscall.setString(2,name);
		inscall.setInt(3, age);
		int changes=0;
		changes=inscall.executeUpdate();
		System.out.println((changes>0) ? changes+" records inserted":"Insertion failed");
		System.out.println();
	}
	public static void updaterec(Connection c,int oldid,int newid,String newname,int newage) throws SQLException
	{
		CallableStatement upcall=c.prepareCall("call updaterec(?,?,?,?)");
		upcall.setInt(1,newid);
		upcall.setString(2, newname);
		upcall.setInt(3, newage);
		upcall.setInt(4, oldid);
		int changes=0;
		changes=upcall.executeUpdate();
		System.out.println((changes>0) ? changes+" records updated":"Updation failed");
		System.out.println();
	}
	public static void main(String[] args) throws SQLException
	{
		String url="jdbc:mysql://localhost:3306/jdbc_test";
		String username="Rohan";
		String password="Rohan123";
		Connection c=DriverManager.getConnection(url,username,password);
		int choice;
		Scanner sc=new Scanner(System.in);
		do
		{	
			System.out.print("1.Show record.\n2.Insert records.\n3.Update records.\n4.Delete Records.\n5.Exit\nChoose option:");
			
			choice=sc.nextInt();
			sc.nextLine();
			switch(choice)
			{
				case 1: display(c);
						break;
				case 2: System.out.println("Enter details of record to insert");
						System.out.print("id:");
						int newid=sc.nextInt();
						sc.nextLine();
						System.out.print("Name:");
						String newname=sc.nextLine();
						System.out.print("Age:");
						int newage=sc.nextInt();
						insertrec(c,newid,newname,newage);
						System.out.println("Updated Table:");
						display(c);
						break;
				case 3:	System.out.print("Enter id to update:");
						int oldid=sc.nextInt();
						System.out.print("Enter new id:");
						int upid=sc.nextInt();
						sc.nextLine();
						System.out.print("Enter new name:");
						String upname=sc.nextLine();
						System.out.print("Enter new age:");
						int upage=sc.nextInt();
						updaterec(c,oldid,upid,upname,upage);
						System.out.println("Updated Table:");
						display(c);
						break;
				case 4:	System.out.print("Enter id to  delete:");
						int id=sc.nextInt();
						sc.nextLine();
						deleterec(c,id);
						System.out.println("Updated Table:");
						display(c);
						break;
				case 5:	System.out.println("Exiting");
						break;
				default: System.out.println("Enter valid input");
						break;
			}
		}while(choice!=5);
		c.close();
		sc.close();
	}

}
