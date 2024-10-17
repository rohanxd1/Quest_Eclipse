package Collections_Study;
import java.util.*;

public class Student_Search 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Student_details[] objArray = new Student_details[100];
        ArrayList<Student_details> studList=new ArrayList<>();
        int i = 0;
        char ch = 'y';
        do
        {
            System.out.print("Enter Student roll no: ");
            int rollno = sc.nextInt();
            sc.nextLine(); 
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Year: ");
            int year = sc.nextInt();
            sc.nextLine();
            objArray[i] = new Student_details(rollno, name, year);
            studList.add(objArray[i]);
            ++i;
            System.out.print("Continue? (Y/N): ");
            ch = sc.nextLine().charAt(0);

        } while ((ch == 'y' || ch == 'Y') && i < 100);
//        System.out.println(studList);
        System.out.println();
        System.out.print("Enter roll number of student to search:");
        int searchnum=sc.nextInt();
        sc.nextLine();
        for(Student_details ob:studList)
        {
        	if(ob.rollno==searchnum)
        	{	
        		ob.display();
        	}
        }
        sc.close();
    }
}
