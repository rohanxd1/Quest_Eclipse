package FileHandeling_Test;
import java.io.*;
public class CopyFile 
{ public static void main(String args[]) throws FileNotFoundException,IOException
	{
		String path="C:\\Java_workspace\\Quest_eclipse\\src\\FileHandeling_Test\\Copyfile1.txt";
		File f1=new File(path);
		File f2=new File("C:\\Java_workspace\\Quest_eclipse\\src\\FileHandeling_Test\\Copyfile2.txt");
		FileInputStream f1read=new FileInputStream(f1);
		FileOutputStream f2write=new FileOutputStream(f2,true);//if true mention it will concatenate..else replace
		int read;
		while((read=f1read.read())!=-1)
		{
			f2write.write(read);
		}
		FileInputStream F2read=new FileInputStream(f2);
//		int read
		
	}

}
