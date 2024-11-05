package FileHandeling_Test;
import java.io.*;
import java.util.*;
public class Menu_Driven 
{public static void main(String args[]) throws IOException
	{
		Scanner sc=new Scanner(System.in);
		String path1="C:\\Java_workspace\\Quest_eclipse\\src\\FileHandeling_Test\\Menu_Driven1.txt";
		File f=new File(path1);
		int ch=-1;
		do
		{
			System.out.print("1.Create File\n2.Read From file\n3.Write to File\n4.Delete File\n5.Copy to another file\n6.Add to file\n6.Exit\nEnter choice(1-6):");
			ch=sc.nextInt();
			sc.nextLine();
			switch(ch)
			{
				case 1:if(!f.exists())
						{
							f.createNewFile();
							System.out.println("File created Successfully");
						}
						else
						{
							System.out.println("File already exists!!");
						}
					   break;
				case 2:if(f.exists())
					   {
						if(f.canRead())
						{
							if(f.length()!=0)
							{
								FileInputStream fread=new FileInputStream(path1);
								int read;
								while((read=fread.read())!=-1)
								{
									System.out.print((char)read);
								}
								System.out.println();
								fread.close();
							}
							else
							{
								System.out.println("File empty!");
							}
						}
						else
						{
							System.out.println("Cannot access file!");
						}
					   }
					   break;
				case 3:if(f.canWrite())
					   {
							FileOutputStream fwrite=new FileOutputStream(path1);
							System.out.println("Enter text:");
							String message=sc.nextLine();
							byte[] barr=message.getBytes();
							fwrite.write(barr);
							System.out.println("Written Successfully");
							fwrite.close();
					   }
					   else
					   {
						   System.out.println("Cannot access file");
					   }
					   break;
				case 4:if(f.exists())
						{
							f.delete();
							System.out.println("Deleted Successfully");
						}
					   break;
				case 5:
					   break;
				case 6:System.out.println("Exiting.");
					   break;
				default: System.out.println("Enter valid input!!");
						break;
			}
		}while(ch!=6);
	}

}
