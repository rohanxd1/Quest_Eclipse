package JavaDataBaseTest;
import java.sql.*;
public class PreparedStatement_test 
{public static void main(String args[]) throws SQLException
	{
	 String url="jdbc:mysql://localhost:3306/jdbc_test";
	 String username="Rohan";
	 String password="Rohan123";
	 Connection c=DriverManager.getConnection(url,username,password);
	 String q="INSERT INTO STUDENT VALUES(?,?,?);";
	 PreparedStatement ps=c.prepareStatement(q);
	 ps.setInt(1,3);
	 ps.setString(2,"Test");
	 ps.setInt(3,25);
	 int changes=ps.executeUpdate();
	 System.out.println(changes+" changes made.");
	 
	 String q1="SELECT * FROM STUDENT;";
	 Statement s=c.createStatement();
	 ResultSet res=s.executeQuery(q1);
	 while(res.next())
	 {
		 System.out.println(res.getInt(1)+" "+res.getString(2)+" "+res.getInt(3));
	 }
	 c.close();
	}

}
