package JavaDataBaseTest;
import java.sql.*;
public class UpdateTableTest 
{public static void main(String[] args) throws SQLException
	{
		String url="jdbc:mysql://localhost:3306/jdbc_test";
		String username="Rohan";
		String password="Rohan123";
		Connection c=DriverManager.getConnection(url,username,password);
		String q="Update STUDENT set NAME=? WHERE NAME=?;";
		PreparedStatement ps=c.prepareStatement(q);
		ps.setString(1,"Arman");
		ps.setString(2,"Test");
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
