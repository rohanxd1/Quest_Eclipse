package FileHandeling_Test;
import java.io.*;
public class BufferedReaderWriter_test 
{
	public static void main(String[] args) throws IOException
	{
		String path="C:\\Java_workspace\\Quest_eclipse\\src\\FileHandeling_Test\\BufferedRW.txt";
		FileWriter fw=new FileWriter(path);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("Hi this is BufferedReaderWriter Test");
		bw.close();
		fw.close();
		
		FileReader fr=new FileReader(path);
		BufferedReader br=new BufferedReader(fr);
		System.out.println(br.readLine());
		br.close();
		fr.close();
	}
}
