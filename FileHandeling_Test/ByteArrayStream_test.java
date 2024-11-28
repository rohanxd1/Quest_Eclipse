package FileHandeling_Test;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayStream_test 
{
	public static void main(String[] args) throws IOException 
	{
		FileOutputStream fo1 =new FileOutputStream("C:\\Java_workspace\\Quest_eclipse\\src\\FileHandeling_Test\\ByteArrayStream.txt");
		FileOutputStream fo2 =new FileOutputStream("C:\\Java_workspace\\Quest_eclipse\\src\\FileHandeling_Test\\ByteArrayStream2.txt");
		ByteArrayOutputStream bo=new ByteArrayOutputStream();
		bo.write(97);
		bo.writeTo(fo1);
		bo.writeTo(fo2);
		bo.close();
	}

}
