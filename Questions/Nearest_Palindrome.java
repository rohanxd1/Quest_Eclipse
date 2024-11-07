package Questions;
import java.util.*;

public class Nearest_Palindrome {
    static boolean isPalindrome(int num) 
    {
        String s = Integer.toString(num);
        return s.equals(new StringBuilder(s).reverse().toString());
    }

    static int findNearestPalindrome(int num)
    {
        int lower = num - 1;
        int higher = num + 1;

        // Find the nearest lower palindrome
        while (!isPalindrome(lower)) 
        {
            lower--;
        }

        // Find the nearest higher palindrome
        while (!isPalindrome(higher)) 
        {
            higher++;
        }

        // Compare distances and return the closest palindrome
        if ((num - lower) <= (higher - num)) 
        {
            return lower;
        } else 
        {
            return higher;
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to check: ");
        int num = sc.nextInt();

        if (isPalindrome(num))
        {
            System.out.println("Palindrome");
        } else
        {
            int nearestPalindrome = findNearestPalindrome(num);
            System.out.println("Nearest palindrome is: " + nearestPalindrome);
        }

        sc.close();
    }
}
