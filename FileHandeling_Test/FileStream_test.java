package FileHandeling_Test;

import java.io.*;
import java.util.Scanner;

public class FileStream_test {
    public static void main(String args[]) throws IOException,FileNotFoundException {
    	String path="C:\\Java_workspace\\Quest_eclipse\\src\\FileHandeling_Test\\Test.txt";
        File in = new File(path);
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nFile Operations Menu:");
            System.out.println("1. Check if file exists");
            System.out.println("2. Create file if it doesn't exist");
            System.out.println("3. Delete file if it exists");
            System.out.println("4. Check if file is readable");
            System.out.println("5. Read from file using Scanner");
            System.out.println("6. Read from file using FileInputStream");
            System.out.println("7. Write using Stream");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    if (in.exists()) {
                        System.out.println("File already exists.");
                    } else {
                        System.out.println("File does not exist.");
                    }
                    break;

                case 2:
                    if (!in.exists()) {
                        in.createNewFile();
                        System.out.println("File was created successfully.");
                    } else {
                        System.out.println("File already exists.");
                    }
                    break;

                case 3:
                    if (in.exists()) {
                        in.delete();
                        System.out.println("File deleted successfully.");
                    } else {
                        System.out.println("File was not deleted/not found.");
                    }
                    break;

                case 4:
                    if (in.canRead()) {
                        System.out.println("File is readable.");
                    } else {
                        System.out.println("File is not readable.");
                    }
                    break;

                case 5:
                    if (in.exists()) {
                        Scanner fileScanner = new Scanner(in);
                        System.out.println("Here is the content:");
                        while (fileScanner.hasNextLine()) {
                            String data = fileScanner.nextLine();
                            System.out.println(data);
                        }
                        fileScanner.close();
                    } else {
                        System.out.println("File does not exist to read.");
                    }
                    break;

                case 6:
                    if (in.exists()) {
                        try (FileInputStream fi = new FileInputStream(in)) {
                            System.out.println("Reading file using FileInputStream:");
                            int read;
                            while ((read = fi.read()) != -1) {
                                System.out.print((char) read);
                            }
                            System.out.println();
                        }
                    } else {
                        System.out.println("File does not exist to read.");
                    }
                    break;
                case 7:FileOutputStream wrt=new FileOutputStream(path);
                	   System.out.print("Enter text:");
                	   
                	   String message=sc.nextLine();
                	   byte[] arr=message.getBytes();
                	   wrt.write(arr);
                	   System.out.println("Written Successfully");
                	   wrt.close();
                	break;

                case 8:
                    System.out.println("Exiting program.");
                    break;

                default:
                    System.out.println("Invalid choice, please try again.");
            }
        } while (choice != 8);

        sc.close();
    }
}
