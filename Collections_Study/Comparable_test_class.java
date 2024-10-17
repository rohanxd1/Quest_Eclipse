package Collections_Study;
//note down generic and non generic datatypes
public class Comparable_test_class implements Comparable<Comparable_test_class>
{	int rollno;
	String name;
	public Comparable_test_class(int rollno,String name)
	{
		this.rollno=rollno;
		this.name=name;
	}
	@Override
	public String toString() 
	{
		return "[rollno=" + rollno + ", name=" + name + "]";
	}
//	@Override
//	public int compareTo(Comparable_test_class m) 
//	{
//		return this.rollno-m.rollno;
//	}
	@Override
	public int compareTo(Comparable_test_class m) 
	{
		return this.name.compareTo(m.name);
	}
//	@Override
//	public int compareTo(Object o) 
//	{ Comparable_test_class m1=(Comparable_test_class) o;
//	if(this.rollno==m1.rollno)								//downcasting since comparable is in object..since need to use
    														//comparable from object in our class downcast object to it

//	{
//		return 0;
//	}
//	else if(this.rollno>m1.rollno)
//	{
//		return 1;
//	}
//	else
//	{
//		return -1;
//	}
//	}

}
