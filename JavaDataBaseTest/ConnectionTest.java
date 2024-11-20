package JavaDataBaseTest;
import java.io.FileNotFoundException;
import java.sql.*;
public class ConnectionTest 
{
	public static void main(String args[]) throws SQLException,FileNotFoundException
	{
		String url="jdbc:mysql://localhost:3306/jdbc_test";
		String username="Rohan";
		String password="Rohan123";
		Connection c=DriverManager.getConnection(url,username,password);
		Statement st=c.createStatement();
//		String q="INSERT INTO STUDENT VALUES(1,'ROHAN',22);";
//		boolean flag=st.execute(q);
//		if(flag==true)
//			System.out.println("Failed");
//		else
//			System.out.println("Inserted");
		String q="SELECT * FROM STUDENT;";
		ResultSet res=st.executeQuery(q);
		while(res.next())
		{
			System.out.println(res.getInt(1)+" "+res.getString(2)+" "+res.getInt(3));
		}
		c.close();
	}
}
