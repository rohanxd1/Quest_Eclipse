package Questions;

public class Rpattern 
{	public static void drawPatternR(int h, int w)
	{  
    
		int mid = h / 2;  
		for(int i = 0; i < h; i++) 
		{  
			System.out.printf("*");  
			for(int j = 0; j < w; j++) 
				{  
					if((i == 0 || i == mid) && j < (w - 2)) 
					{  
						System.out.printf("*");  
					}
					else if(j == (w - 2) && !(i == 0 || i == mid))
					{  
						System.out.printf("*");  
					}else 
					{  
						System.out.printf(" ");  
					}  
				}  
			System.out.printf("\n");  
		}  
}  
	public static void main(String[] args) 
	{
		drawPatternR(10, 10);
	}

}
