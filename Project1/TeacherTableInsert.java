package Project1;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import javax.swing.*;
public  class TeacherTableInsert extends JFrame 
{	

    JTextField idField;
    JTextField nameField;
    JTextField passwordField;
    JButton insertButton;
    static JLabel resLabel;

    public TeacherTableInsert() throws SQLException
    {	

		
    	setLayout(null);
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        
        JLabel TeacherLabel = new JLabel("Teachers Table");
        TeacherLabel.setBounds(120, 20, 300, 40); 
        TeacherLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
        add(TeacherLabel);

        
        JLabel idLabel = new JLabel("ID:");
        idLabel.setBounds(80, 100, 100, 25);
        add(idLabel);
        idField = new JTextField();
        idField.setBounds(200, 100, 200, 25);
        add(idField);
       
        
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(80, 150, 100, 25);
        add(nameLabel);
        nameField = new JTextField();
        nameField.setBounds(200, 150, 200, 25);
        add(nameField);

    
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(80, 200, 100, 25);
        add(passwordLabel);
        passwordField = new JTextField();
        passwordField.setBounds(200, 200, 200, 25);
        add(passwordField);
        
        insertButton=new JButton("Create Account");
        insertButton.setBounds(220,250,150,20);
        add(insertButton);
        resLabel=new JLabel();
        resLabel.setBounds(221,290,150,20);
        add(resLabel);
        
        insertButton.addActionListener((e)->{
        
        int id;
        String tName;
        String tPass;
        id=Integer.parseInt(idField.getText());
        tName=nameField.getText();
        tPass=passwordField.getText();
        
        
        String url="jdbc:mysql://localhost:3306/teacherstudent";
		String username="Rohan";
		String password="Rohan123";
		try(Connection c=DriverManager.getConnection(url,username,password);)
		{
		
			String add="INSERT INTO TEACHERS VALUES(?,?,?)";
			try(PreparedStatement ps=c.prepareStatement(add);)
			{	
				ps.setInt(1,id);
				ps.setString(2,tName);
				ps.setString(3,tPass);
				
				int changes=ps.executeUpdate();
				if(changes>0)
				{
					System.out.println("Record inserted");
					resLabel.setText("Record inserted");
					
				}
				else
				{
					System.out.println("Insertion failed");
				}
			}
		} 
		catch (SQLException e1) 
		{
			e1.printStackTrace();
		}

        
        }); 
        
    }
    

    
    public static void main(String[] args) throws SQLException
    {
        TeacherTableInsert t = new TeacherTableInsert();
        t.setVisible(true);
        resLabel.setText("");

    }
}
