// deposit,withdrw,balance,all checking needed ,if withdrw chck balance then do 
package Encapsulation;
public class Bank 
{
    private String email;
    private String password;
    private double balance; 

    public Bank(String email, String password) 
    {
        this.email = email;
        this.password = password;
        this.balance = 0.0; 
    }

    public String getEmail() 
    {
        return email;
    }

    public String getPassword() 
    {
        return password;
    }

    public double getBalance() 
    {
        return balance;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    
    public void deposit(double amount)
    {
        if (amount > 0) 
        {
            balance += amount;
            System.out.println("Successfully deposited $" + amount);
        } 
        else 
        {
            System.out.println("Deposit amount must be greater than zero.");
        }
    }

    public void withdraw(double amount) 
    {
        if (amount > 0 && amount <= balance)
        {
            balance -= amount;
            System.out.println("Successfully withdrew $" + amount);
        } 
        else if (amount > balance) 
        {
            System.out.println("Insufficient balance to withdraw.");
        } 
        else 
        {
            System.out.println("Withdrawal amount must be greater than zero.");
        }
    }
}
