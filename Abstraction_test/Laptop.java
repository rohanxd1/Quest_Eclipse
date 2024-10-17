package Abstraction_test;

public class Laptop 
{public static void main(String[] args)
	{
		MSOffice M=new Word();
		Word W=(Word)M;
		M.createNewFile();
		System.out.println("Extension:"+W.type);
		MSOffice M1=new Excel();
		Excel E=(Excel)M1;
		M1.createNewFile();
		System.out.println("Extension:"+E.type);
		MSOffice M3=new PowerPoint();
		M3.createNewFile();
		PowerPoint P=(PowerPoint)M3;
		System.out.println("Extension:"+P.type);
		
	}

}
