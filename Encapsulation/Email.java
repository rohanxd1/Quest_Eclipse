package Encapsulation;
import java.util.*;
public class Email 
{ private String email;
  private String password;
  String pass_input;
  String email_input;
  Scanner sc=new Scanner(System.in);
  public Email(String email,String password)
  {
	  this.email=email;
	  this.password=password;
  }
  public String getEmail()
  {	 
	  return email;
  }
  public String getPass()
  {   	 
	  return password;
      
  }
  public void setPass(String password)
  {			
	  this.password=password;
  }
	  
	  
 }


