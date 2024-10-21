package Questions;
import java.util.*;
public class Students_record_class 
{
	String name;
	int grade;
	public Students_record_class(String name,int grade) 
	{
		this.name=name;
		this.grade=grade;
	}
	public int getgrade()
	{
		return grade;
	}
	public String toString()
	{
		return "[Name:"+name+" Grade:"+grade+"]";
	}
}
class StudentAscSort implements Comparator<Students_record_class>
{
	public int compare(Students_record_class s1,Students_record_class s2)
	{
		return s1.name.compareTo(s2.name);
	}
}
class StudentDescSort implements Comparator<Students_record_class>
{
	public int compare(Students_record_class s1,Students_record_class s2)
	{
		return s2.name.compareTo(s1.name);
	}
}

