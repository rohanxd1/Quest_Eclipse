package FileHandeling_Test;
import java.io.*;
public class PrintStream_test 
{
	public static void main(String[] args) throws IOException
	{
		String path="C:\\Java_workspace\\Quest_eclipse\\src\\FileHandeling_Test\\PrintTest.txt";
		FileOutputStream fo=new FileOutputStream(path);
		PrintStream p=new PrintStream(fo);
		p.print("this is print stream "+true);
		p.close();
		fo.close();
		System.out.println("success");
		
	}

}
