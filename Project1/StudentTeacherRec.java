package Project1;
import  java.sql.*;
import java.util.*;
public class StudentTeacherRec
{	public static int tempstuid;
	public static String rolecheck(Connection c,String Loginname) throws SQLException
	{	tempstuid=0;
		String role=null;
		String display="Select id from Students where name=?";
		try(PreparedStatement ps=c.prepareStatement(display);)
		{
			ps.setString(1,Loginname);
			try(ResultSet res=ps.executeQuery();)
			{if(res.next())
				{	tempstuid=res.getInt(1);
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
	public static void studentdetails(Connection c,int id) throws SQLException
	{
		String  display="SELECT ID,NAME,YEAR FROM STUDENTS WHERE ID=?";
		try(PreparedStatement ps=c.prepareStatement(display);)
		{
			ps.setInt(1,id);
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
	
	//disp marklist
	public static void dispmark(Connection c, int id) throws SQLException
	{
	    String displayMarkQuery = "SELECT SUBJECT, SUBID, FID FROM MARKLIST WHERE SID = ?";
	    try (PreparedStatement ps = c.prepareStatement(displayMarkQuery)) 
	    {
	        ps.setInt(1, id);
	        try (ResultSet rs = ps.executeQuery()) 
	        {
	            
	            if (!rs.isBeforeFirst()) {
	                System.out.println("No marks found for the given student ID.");
	                return;
	            }
	            System.out.println("Marks for Student ID: " + id);
	            while (rs.next()) 
	            {
	                String subject = rs.getString("SUBJECT");
	                int subId = rs.getInt("SUBID");
	                int fid = rs.getInt("FID");
	                System.out.println("("+subId+")Subject: " + subject  + " FID: " + fid);
	            }
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
			System.out.println(count+" records entered.ln");
		}
		
	}
	
	//case3
	public static void searchbyid(Connection c) throws SQLException 
	{
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter student ID to search: ");
	    int id = sc.nextInt();
	    sc.nextLine();
	    String display = "SELECT ID, NAME, YEAR FROM STUDENTS WHERE ID = ?";
	    try (PreparedStatement ps = c.prepareStatement(display)) 
	    {
	    	ps.setInt(1, id);
	        try (ResultSet res = ps.executeQuery()) 
	        {
	            if (res.next()) 
	            {
	                System.out.println("Student Found: ");
	                System.out.println("ID: " + res.getInt(1) + ", Name: " + res.getString(2) + ", Year: " + res.getInt(3));
	                System.out.println();
	            } else 
	            {
	                System.out.println("No student found with ID: " + id);
	            }
	        }
	    }
	}
	
	//case 4: add markist
	public static void addMarklist(Connection c, String tname) throws SQLException 
	{	int currentTeacherId=0;
		String getTid="SELECT ID FROM TEACHERS WHERE NAME=?";
		try(PreparedStatement tidps=c.prepareStatement(getTid);)
		{	tidps.setString(1,tname);
			ResultSet res=tidps.executeQuery();
			if(res.next())
			{
				currentTeacherId=res.getInt(1);
			}
		}
	    Scanner sc = new Scanner(System.in);
	    while (true) 
	    {
	        System.out.println("1. Add New Marklist");
	        System.out.println("2. Update Existing Marklist");
	        System.out.println("3. Go Back");
	        System.out.print("Enter your choice: ");
	        int choice = sc.nextInt();
	        sc.nextLine(); 

	        if (choice == 3) 
	        {	
	        	System.out.println();
	            break; 
	        }

	        System.out.print("Enter student ID: ");
	        int studentId = sc.nextInt();
	        sc.nextLine();
	        
	        
	        String checkstudent = "SELECT * FROM STUDENTS WHERE ID = ?";
	        try (PreparedStatement checkStudentPS = c.prepareStatement(checkstudent)) 
	        {
	            checkStudentPS.setInt(1, studentId);
	            try (ResultSet rs = checkStudentPS.executeQuery()) 
	            {
	                if (!rs.next()) 
	                {
	                    System.out.println("No student exists with the given ID.");
	                    System.out.println();
	                    continue;
	                }
	            }
	        }

	        
	        if (choice == 1) {
	            String checkMarklist = "SELECT * FROM MARKLIST WHERE SID = ?";
	            try (PreparedStatement checkMarklistPS = c.prepareStatement(checkMarklist)) 
	            {
	                checkMarklistPS.setInt(1, studentId);
	                try (ResultSet rs = checkMarklistPS.executeQuery()) 
	                {
	                    if (rs.next()) {
	                        System.out.println("Marklist already exists for this student.");
	                        System.out.println();
	                        continue;
	                    }
	                }
	            }

	            
	            System.out.println("Enter marks for Physics, Chemistry, and Maths:");
	            System.out.print("Physics: ");
	            int physicsMarks = sc.nextInt();
	            System.out.print("Chemistry: ");
	            int chemistryMarks = sc.nextInt();
	            System.out.print("Maths: ");
	            int mathsMarks = sc.nextInt();
	            sc.nextLine(); 

	            String insertMarklistQuery = "INSERT INTO MARKLIST (SID, SUBID, SUBJECT, FID) VALUES (?, ?, ?, ?)";
	            try (PreparedStatement insertPS = c.prepareStatement(insertMarklistQuery)) 
	            {
	                
	                insertPS.setInt(1, studentId);
	                insertPS.setInt(2, 1); 
	                insertPS.setString(3, "Physics");
	                insertPS.setInt(4, currentTeacherId);
	                insertPS.executeUpdate();

	                
	                insertPS.setInt(1, studentId);
	                insertPS.setInt(2, 2); 
	                insertPS.setString(3, "Chemistry");
	                insertPS.setInt(4, currentTeacherId);
	                insertPS.executeUpdate();

	                
	                insertPS.setInt(1, studentId);
	                insertPS.setInt(2, 3);
	                insertPS.setString(3, "Maths");
	                insertPS.setInt(4, currentTeacherId);
	                insertPS.executeUpdate();

	                System.out.println("Marklist added successfully.");
	            }
	        }
	        
	        else if (choice == 2) 
	        {
	            String checkMarklist = "SELECT * FROM MARKLIST WHERE SID = ?";
	            try (PreparedStatement checkMarklistPS = c.prepareStatement(checkMarklist)) 
	            {
	                checkMarklistPS.setInt(1, studentId);
	                try (ResultSet rs = checkMarklistPS.executeQuery()) 
	                {
	                    if (!rs.next()) 
	                    {
	                        System.out.println("No marklist exists for this student.");
	                        System.out.println();
	                        continue;
	                    }
	                }
	            }

	            
	            System.out.println("Enter marks to update for Physics, Chemistry, and Maths:");
	            System.out.print("Physics: ");
	            int physicsMarks = sc.nextInt();
	            System.out.print("Chemistry: ");
	            int chemistryMarks = sc.nextInt();
	            System.out.print("Maths: ");
	            int mathsMarks = sc.nextInt();
	            sc.nextLine(); 

	            String updateMarklistQuery = "UPDATE MARKLIST SET FID = ? WHERE SID = ? AND SUBJECT = ?";
	            try (PreparedStatement updatePS = c.prepareStatement(updateMarklistQuery)) 
	            {
	                
	                updatePS.setInt(1, currentTeacherId);
	                updatePS.setInt(2, studentId);
	                updatePS.setString(3, "Physics");
	                updatePS.executeUpdate();

	                
	                updatePS.setInt(1, currentTeacherId);
	                updatePS.setInt(2, studentId);
	                updatePS.setString(3, "Chemistry");
	                updatePS.executeUpdate();

	                
	                updatePS.setInt(1, currentTeacherId);
	                updatePS.setInt(2, studentId);
	                updatePS.setString(3, "Maths");
	                updatePS.executeUpdate();

	                System.out.println("Marklist updated successfully.");
	                System.out.println();
	            }
	        } 
	        else 
	        {
	            System.out.println("Invalid choice. Please try again.");
	            System.out.println();
	        }
	    }
	}

	//------------
	//case 5:
	public static void studupdate(Connection c)	throws SQLException
	{
		String update="UPDATE STUDENTS SET NAME=?,YEAR=? WHERE ID=?";
		String name;
		int year;
		try(PreparedStatement ps=c.prepareStatement(update);)
		{
			System.out.print("Enter id of student to update:");
			Scanner sc=new Scanner(System.in);
			int id=sc.nextInt();
			sc.nextLine();
			String disp="SELECT ID, NAME, YEAR FROM STUDENTS WHERE ID = ?";
			try(PreparedStatement dps=c.prepareStatement(disp);)
			{
				dps.setInt(1, id);
				try(ResultSet dres=dps.executeQuery();)
				{
					if(dres.next())
					{	
						System.out.println("Student Found: ");
			            System.out.println("ID: " + dres.getInt(1) + ", Name: " + dres.getString(2) + ", Year: " + dres.getInt(3));
						System.out.print("Enter new Name:");
						name=sc.nextLine();
						System.out.print("Enter new Year:");
						year=sc.nextInt();
						sc.nextLine();
						ps.setString(1,name);
						ps.setInt(2, year);
						ps.setInt(3, id);
						int changes=ps.executeUpdate();
						System.out.println((changes>0) ? "Record updates.":"Updation failed.");
						System.out.println();
					}
					else
					{
						System.out.println("Record not found!\n");
					}
				}
			}
			
		}
	}
	//------------------------
	//case 6: delete student
	public static void studel(Connection c) throws SQLException 
	{
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the student ID to delete: ");
	    int id = sc.nextInt();
	    sc.nextLine();
	    String searchQuery = "SELECT ID, NAME, YEAR FROM STUDENTS WHERE ID = ?";
	    try (PreparedStatement sps = c.prepareStatement(searchQuery)) 
	    {
	        sps.setInt(1, id);
	        try (ResultSet res = sps.executeQuery()) 
	        {
	            if (res.next()) 
	            {
	                System.out.println("Student Found: ");
	                System.out.println("ID: " + res.getInt(1) + ", Name: " + res.getString(2) + ", Year: " + res.getInt(3));
	                System.out.print("Are you sure you want to delete this record? (y/n): ");
	                String confirm = sc.nextLine();
	                if (confirm.equalsIgnoreCase("y") || confirm.equalsIgnoreCase("yes")) 
	                {
	                    String deleteQuery = "DELETE FROM STUDENTS WHERE ID = ?";
	                    try (PreparedStatement delps = c.prepareStatement(deleteQuery)) 
	                    {
	                        delps.setInt(1, id);
	                        int changes = delps.executeUpdate();
	                        System.out.println(changes > 0 ? "Record deleted successfully." : "Failed to delete record.");
	                        System.out.println();
	                    }
	                } 
	                else 
	                {
	                    System.out.println("Deletion failed.\n");
	                }
	            } 
	            else 
	            {
	                System.out.println("Record no found.\n");
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
						{	System.out.println("Current User:"+Loginname);
							studentdisp();
							ch=sc.nextInt();
							sc.nextLine();
							System.out.println();
							switch(ch)
							{
								case 1: studentdetails(c,tempstuid);
										break;
								case 2: dispmark(c,tempstuid);
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
						{   System.out.println("Current User:"+Loginname);
							teacherdisp();
							ch=sc.nextInt();
							sc.nextLine();
							System.out.println();
							switch(ch)
							{
								case 1: allstudisp(c);
										break;
								case 2: addstud(c);
										break;
								case 3: searchbyid(c);
										break;
								case 4: addMarklist(c,Loginname);
										break;
								case 5: studupdate(c);
										break;
								case 6: studel(c);
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
