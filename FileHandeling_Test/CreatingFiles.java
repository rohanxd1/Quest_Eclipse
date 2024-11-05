package FileHandeling_Test;

import java.io.*;
import java.util.Scanner;

public class CreatingFiles 
{ public static void main(String args[]) throws IOException
	{	
		File in = new File("C:\\Java_workspace\\Quest_eclipse\\src\\FileHandeling_Test\\Test.txt");
		Scanner scanner = new Scanner(System.in);
		int choice;

		do {
 			System.out.println("1. Check if file exists");
			System.out.println("2. Create file if it doesn't exist");
			System.out.println("3. Delete file if it exists");
			System.out.println("4. Check if file is readable");
			System.out.println("5. Read from from file");
			System.out.println("6. Exit");
			System.out.print("Enter your choice: ");
			choice = scanner.nextInt();

			switch (choice) 
				{
					case 1:if (in.exists()) 
							{
								System.out.println("File already exists.");
							}
							else 
								{
									System.out.println("File does not exist.");
								}
							break;
					case 2:if (!in.exists())
							{
								in.createNewFile();
								System.out.println("File was created successfully.");
							} 
							else 
								{
									System.out.println("File already exists.");
								}
							break;
					case 3:if (in.exists()) 
							{
								in.delete();
								System.out.println("File deleted successfully.");
							}
							else 
								{
									System.out.println("File was not deleted/not found.");
								}	
							break;
				   case 4:if (in.canRead()) 
				   			{
					   			System.out.println("File is readable.");
				   			} 
				   			else 
				   				{
				   					System.out.println("File is not readable.");
				   				}
				   			break;
				  case 5:if(in.exists())
				  			{
					  			Scanner sc=new Scanner(in);
					  			System.out.println("Here is content:");
					  			while(sc.hasNextLine())
					  			{
					  				String data=sc.nextLine();
					  				System.out.println(data);
					  			}
				  			}
				  			break;
				  case 6:System.out.println("Exiting program.");
		  			break;
				  default:System.out.println("Invalid choice, please try again.");
				}
			} while (choice != 5);

		scanner.close();
	}
}