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
	 String q1="DELETE FROM student WHERE ID = 3 OR ID = 4;";
	 int changes=s.executeUpdate(q1); //for dml like insert,delete,update use executeUpdate
	 if(changes!=0)
		 System.out.println(changes+" record(s) deleted");
	 else
		 System.out.println("Failed");
	 String q2="select * from student;";
	 ResultSet res=s.executeQuery(q2);
	 while(res.next())
	 {
		 System.out.println(res.getInt(1)+" "+res.getString(2)+" "+res.getInt(3));
	 }
	 c.close();
	}

}
