package FileHandeling_Test;
import java.io.*;
public class FileReadWriter_test 
{
	public static void main(String[] args) throws IOException,FileNotFoundException
	{
		FileWriter fw=new FileWriter("C:\\Java_workspace\\Quest_eclipse\\src\\FileHandeling_Test\\FileWriter.txt");
		fw.write("Hi this is FileWriter");
		fw.close();
		
		FileReader fr=new FileReader("C:\\Java_workspace\\Quest_eclipse\\src\\FileHandeling_Test\\FileWriter.txt");
		int i;
		while((i=fr.read())!=-1)
		{
			System.out.print((char)i);
		}
		fr.close();
	}

}
