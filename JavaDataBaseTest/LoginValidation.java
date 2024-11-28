/*
 CREATE SIMPLE USER LOGIN SYSTEM USING JDBC
CREATE USER TABLE WITH COLOUMN USERNAME,PASSWORD,MAIL

WRITE PROGRAM TO CHECK IF USER EXIST IN DATABASE BY VALIDATING USERNAME AND PASSWORD
DISPLAY A SUCCESS MESSAGE IF CREDENTIALS ARE CORRECT..OTHEWISE SHOW ERROR MESSAGE
 * */
package JavaDataBaseTest;
import java.util.*;
import java.sql.*;

class dbchecker
{	String[] cred=new String[2];
	String[] check(Connection c,String name) throws SQLException
	{	
		String s="Select * from USER WHERE USERNAME=?";
		PreparedStatement ps=c.prepareStatement(s);
		ps.setString(1,name);
		ResultSet res=ps.executeQuery();
		if(res.next())
		{
			cred[0]=res.getString(2);
			cred[1]=res.getString(3);
			return cred;
		}
		else
		{
			return null;
		}
		
	}
}
public class LoginValidation 
{   
	public static void main(String args[]) throws SQLException
	{
		String url="jdbc:mysql://localhost:3306/jdbc_test";
		String username="Rohan";
		String password="Rohan123";
		Connection c=DriverManager.getConnection(url,username,password);
		String mail,user,pass;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Username:");
		user=sc.nextLine();
		dbchecker db=new dbchecker();
		String details[]=db.check(c,user);
		if(details==null)
		{
			System.out.println("No user exists");
		}
		else
		{	
			String dbpass=details[0];
			mail=details[1];
			System.out.print("Username:"+user+"\nEnter password:");
			pass=sc.nextLine();
			if(pass.equals(dbpass))
			{
				System.out.println("Login Successfull\nMail:"+mail);
			}
			else
			{
				System.out.println("Wrong password");
			}
		}
		c.close();
		sc.close();
	}

}
