package JavaDataBaseTest;
import java.sql.*;
import java.util.*;

public class MenuDrivenJDBC 
{ public static void main(String args[]) throws SQLException
	{		
		String url="jdbc:mysql://localhost:3306/jdbc_test";
		String username="Rohan";
		String password="Rohan123";
		Connection c=DriverManager.getConnection(url,username,password);
		int choice;
		
		Scanner sc=new Scanner(System.in);
		do
		{	
			int changes;
			//variables end
			System.out.print("1.Insert record.\n2.Show records.\n3.Update records.\n4.Delete Records.\n5.Exit\nChoose option:");
			
			choice=sc.nextInt();
			sc.nextLine();
			switch(choice)
			{
				case 1: String add="INSERT INTO STUDENTREC VALUES(?,?,?);";
						PreparedStatement ps=c.prepareStatement(add);
						System.out.print("Enter Rollno:");
						int rno=sc.nextInt();
						sc.nextLine();
						ps.setInt(1,rno);
						System.out.print("Name:");
						String name=sc.nextLine();
						ps.setString(2,name);
						System.out.print("Enter age:");
						int age=sc.nextInt();
						sc.nextLine();
						ps.setInt(3,age);
						changes=ps.executeUpdate();
						if(changes>0)
						{
							System.out.println(changes+" record addedd.");
						}
						else
							System.out.println("Insertion failed.");
						System.out.println();
						break;
				case 2: String display="SELECT * FROM STUDENTREC;";
						Statement s=c.createStatement();
						ResultSet result=s.executeQuery(display);
						if(!result.next())
						{
							System.out.println("Empty set");
						}
						else
						{	
							do
							{
								System.out.println(result.getInt(1)+" "+result.getString(2)+" "+result.getInt(3));
								
							}while(result.next());
							System.out.println();
						}
						break;
				case 3: String update="UPDATE STUDENTREC SET RNO=?,NAME=?,AGE=? WHERE RNO=?;";
						System.out.print("Enter RNO of record to update:");
						int urno=sc.nextInt();
						sc.nextLine();
						System.out.print("Enter new RNO:");
						int newrno=sc.nextInt();
						sc.nextLine();
						System.out.print("Enter new name:");
						String newname=sc.nextLine();
						System.out.print("Enter new age:");
						int newage=sc.nextInt();
						sc.nextLine();
						PreparedStatement ups=c.prepareStatement(update);
						ups.setInt(1,newrno);
						ups.setString(2,newname);
						ups.setInt(3,newage);
						ups.setInt(4,urno);
						changes=ups.executeUpdate();
						if(changes<1)
							System.out.println("Update failed");
						else
							System.out.println(changes+" record(s) updated");
						System.out.println();
						break;
				case 4: String delete="DELETE FROM STUDENTREC WHERE RNO=?";
						System.out.print("Enter RNO of record to delete:");
						int drno=sc.nextInt();
						sc.nextLine();
						PreparedStatement dps=c.prepareStatement(delete);
						dps.setInt(1, drno);
						changes=dps.executeUpdate();
						System.out.println((changes>0) ? changes+" record(s) deleted":"Deletion failed");
						System.out.println();
						break;
				case 5: System.out.println("Exiting");
						break;
				default:	System.out.println("Enter valid input.");
						break;
			}
			
		}while(choice!=5);
		sc.close();
		c.close();
	}

}
