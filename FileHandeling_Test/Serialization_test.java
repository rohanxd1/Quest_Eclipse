package FileHandeling_Test;
import java.io.*;
class student implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String name;
	int id;
	transient int num;//if using transient it doesnt save it
	student(String name,int id,int num)
	{
		this.name=name;
		this.id=id;
		this.num=num;
	}
	public String toString()
	{
		return "[Name:"+name+" id:"+id+" num:"+num+"]";
	}
}
public class Serialization_test 
{public static void main(String args[]) throws IOException,ClassNotFoundException
	{	
		String path="C:\\Java_workspace\\Quest_eclipse\\src\\FileHandeling_Test\\SerialTest.txt";
		FileOutputStream f=new FileOutputStream(path);
		ObjectOutputStream OWrite=new ObjectOutputStream(f);
		student s1=new student("Rohan",22,30);
		student s2=new student("Arman",21,40);
		OWrite.writeObject(s1);
		OWrite.writeObject(s2);
		OWrite.close();
		f.close();
		System.out.print("Serialization complete");
		
		
		FileInputStream fin=new FileInputStream(path);
		ObjectInputStream ORead=new ObjectInputStream(fin);
		student sob=(student) ORead.readObject();
		student sob1=(student) ORead.readObject();
		System.out.println(sob);
		System.out.println(sob1);
		System.out.println("Deserialized");
		ORead.close();
		fin.close();
	}

}
