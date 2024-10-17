package Study;
public class TrianglePattern 
{	static void leftSidedRtAngledTri(int n)
	{	System.out.println("Left-Sided Right Angled Triangle:");
		for(int i=0;i<n;++i)
		{
			for(int j=0;j<=i;++j)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	static void upsideDownLeftSidedRtTri(int n)
	{
		System.out.println("Upside Down Left-Sided Right Angled Triangle:");
		for(int i=0;i<n;++i)
		{
			for(int j = n-i; j > 0; --j)
			{
				System.out.print("*");
			}
			System.out.println("");
			
		}
	}
	static void rightSidedRtAngledTri(int n)
	{
		System.out.println("Right-Sided Right Triangle:");
		 for (int i = 0; i < n; i++) 
		 {	            
	            for (int j = i; j < n-1; j++)
	            {
	                System.out.print(" ");
	            }
	            for (int k = 0; k <= i; k++) 
	            {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	}
	static void upsideDownRightSidedRtTri(int n)
	{System.out.println("Upside Down Right sided Right Triangle");
		for(int i=n;i>=0;--i)
		{
			for(int j=0;j<n-i;++j )
			{
				System.out.print(" ");
			}
			for(int j=0;j<i;++j)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	static void wPattern(int n)
	{ System.out.println("W pattern:");
	    for (int i = n; i >= 1; i--) 
	   {
        for (int j = 1; j <= i; j++) 
        {
            System.out.print("*");
        }
        
        for (int j = 1; j <= 2* (n - i); j++) 
        {
            System.out.print(" ");
        }
        
        for (int j = 1; j <= i; j++) 
        {
            System.out.print("*");
        }

        System.out.println();
       }
		
	}
	public static void main(String args[])
	{
		int n=5;
		
		leftSidedRtAngledTri(n);
		upsideDownLeftSidedRtTri(n);
		rightSidedRtAngledTri(n);
		upsideDownRightSidedRtTri(n);
		wPattern(n);
	}

}
