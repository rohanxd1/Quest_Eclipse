package Encapsulation;
import java.util.Scanner;

public class Bank2 
{
    public static void main(String[] args) 
    {
        int choice = 0;
        Bank account = null;
        Scanner sc = new Scanner(System.in);

        do 
        {
            System.out.print("1. Create Account\n2. Show Email\n3. Change Email\n4. Change Password\n5. Check Balance\n6. Deposit Money\n7. Withdraw Money\n8. Exit\nEnter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) 
            {
                case 1:
                		System.out.print("Enter Email: ");
                		String email = sc.nextLine();
                		System.out.print("Enter Password: ");
                		String password = sc.nextLine();
                		account = new Bank(email, password);
                		System.out.println("Account created successfully!\n");
                		break;

                case 2:
                    	if (account == null) 
                    	{
                    		System.out.println("No accounts exist.");
                    	} 
                    	else 
                    	{
                    		System.out.print("Enter Password to show email: ");
                    		String passInput = sc.nextLine();
                    		if (passInput.equals(account.getPassword())) 
                    		{
                    			System.out.println("Email: " + account.getEmail());
                    		} 
                    		else 
                    		{
                    			System.out.println("Wrong Password.");
                    		}
                    	}
                    	System.out.println();
                    	break;

                case 3: if (account == null)
                		{
                        System.out.println("No accounts exist.");
                		} 
                		else 
                		{
                			System.out.print("Enter Password: ");
                			String passCheck = sc.nextLine();
                			if (passCheck.equals(account.getPassword())) 
                			{
                				System.out.print("Enter new Email: ");
                				String newEmail = sc.nextLine();
                				account.setEmail(newEmail);
                				System.out.println("Email updated successfully!");
                			} 
                			else 
                			{
                				System.out.println("Wrong Password.");
                			}
                		}
                    	System.out.println();
                    	break;

                case 4: 
                    	if (account == null) 
                    	{
                    		System.out.println("No accounts exist.");
                    	} 
                    	else 
                    	{
                    		System.out.print("Enter Email: ");
                    		String emailCheck = sc.nextLine();
                    		System.out.print("Enter old password: ");
                    		String oldPass = sc.nextLine();
                    		if (emailCheck.equals(account.getEmail()) && oldPass.equals(account.getPassword()))
                    		{
                    			System.out.print("Enter new Password: ");
                    			String newPassword = sc.nextLine();
                    			account.setPassword(newPassword);
                    			System.out.println("Password updated successfully!");
                    		} 
                    		else
                    		{
                    			System.out.println("Wrong password or email.");
                    		}
                    	}
                    	System.out.println();
                    	break;

                case 5: 
                		if (account == null) 
                		{
                			System.out.println("No accounts exist.");
                		} 
                		else 
                		{
                			System.out.println("Current Balance: $" + account.getBalance());
                		}
                		System.out.println();
                		break;

                case 6: 
                		if (account == null) 
                		{
                			System.out.println("No accounts exist.");
                		} 
                		else
                		{
                			System.out.print("Enter deposit amount: ");
                			double depositAmount = sc.nextDouble();
                			account.deposit(depositAmount);
                			System.out.println("New Balance: $" + account.getBalance());
                		}
                		System.out.println();
                		break;

                case 7: 
                    	if (account == null) 
                    	{
                    		System.out.println("No accounts exist.");
                    	} 
                    	else 
                    	{
                    		System.out.print("Enter withdrawal amount: ");
                    		double withdrawAmount = sc.nextDouble();
                    		account.withdraw(withdrawAmount);
                    		System.out.println("New Balance: $" + account.getBalance());
                    	}
                    	System.out.println();
                    	break;

                case 8:
                		System.out.println("Exiting...");
                		break;

                default:
                    	System.out.println("Invalid choice, try again.\n");
                    	break;
            }
        } while (choice != 8);

        sc.close();
    }
}
