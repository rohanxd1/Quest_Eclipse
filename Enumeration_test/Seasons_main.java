package Enumeration_test;

import java.util.Arrays;

public class Seasons_main 
{public static void main(String args[])
	{
		for(Seasons w:Seasons.values())
		{
			System.out.print(w+" ");
		}
		String s=Arrays.toString(Seasons.values());
		System.out.println();
		System.out.println(s);
		Seasons ss=Seasons.Winter;
		System.out.println(ss);
		switch(ss)
		{
		case Winter:System.out.println("Winter");
					break;
		case Summer:System.out.println("Winter");
					break;
		}
	}

}
