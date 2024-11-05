package FileHandeling_Test;
import java.io.*;
import java.util.*;
public class BufferedIO_test
{
 public static void main(String args[]) throws IOException
 {	 String path="C:\\Java_workspace\\Quest_eclipse\\src\\FileHandeling_Test\\Test.txt";
	 FileOutputStream fwrite=new FileOutputStream(path);
	 String message="Hi this is BufferedIOTest";
	 BufferedOutputStream bo=new BufferedOutputStream(fwrite);
	 byte[] barr=message.getBytes();
	 bo.write(barr);
	 bo.close();
	 fwrite.close();
	 FileInputStream fread=new FileInputStream(path);
	 BufferedInputStream bi=new BufferedInputStream(fread);
	 byte[] barr2=bi.readAllBytes();
	 bi.close();
	 fread.close();
	  String readMessage = new String(barr2);
     System.out.println("Contents of the file: " + readMessage);
 }
}
