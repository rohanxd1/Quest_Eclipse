package JavaDataBaseTest;
import java.sql.*;
public class DeleteVal 
{public static void main(String args[]) throws SQLException
	{
	 String url="jdbc:mysql://localhost:3306/jdbc_test";
	 String username="Rohan";
	 String password="Rohan123";
	 Connection c=DriverManager.getConnection(url,username,password);
	 Statement s=c.createStatement();
	 String q1="delete from student where id=3;";
	 boolean flag=s.execute(q1);
	 if(flag==true)
		 System.out.println("Not deleted");
	 else
		 System.out.println("Deleted");
	 String q2="select * from student;";
	 ResultSet res=s.executeQuery(q2);
	 while(res.next())
	 {
		 System.out.println(res.getInt(1)+" "+res.getString(2)+" "+res.getInt(3));
	 }
	 c.close();
	}

}
