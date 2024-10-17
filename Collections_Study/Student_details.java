package Collections_Study;

public class Student_details 
{   int rollno;
	String name;
	int year;
	
	Student_details(int rollno,String name,int year)
	{	
		this.rollno=rollno;
		this.name=name;
		this.year=year;
	}
	public void display()
	{
		System.out.println("Rollno: "+rollno+"\nName:"+name+"\nYear:"+year);
	}
	@Override
	public String toString()
	{
		return "Rollno: "+rollno+"\nName:"+name+"\nYear:"+year;
	}
}
