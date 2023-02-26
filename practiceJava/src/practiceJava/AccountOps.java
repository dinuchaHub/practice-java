
package practiceJava;

import java.util.Scanner;

public class AccountOps
{
    Scanner sc = new Scanner(System.in);;
    double amount;
    private String accountNumber;
    private String mobileNumber;
    private String name;
    private static double balance;
    
    public AccountOps() 
    {
        this.accountNumber = "123456";
        this.mobileNumber = "918308883859";
        this.name = "Dinesh Panchal";
        AccountOps.balance = 500.54;
    }
    
    public String getAccountNumber() {
        return this.accountNumber;
    }
    
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    
    public String getMobileNumber() {
        return this.mobileNumber;
    }
    
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public static double getBalance() {
        return balance;
    }
    
    public static void setBalance(double balance) {
        AccountOps.balance = balance;
    }
    
    public void depositMoney() {
        if (this.verify()) {
            this.amount = this.acceptAmount();
            AccountOps.balance += this.amount;
            System.out.println("You have sucessfully deposited amount " + this.amount + 
            		". \nCurrent account balance = " + AccountOps.balance + " Rupees Only. \nThank you!!");
        }
        else {
            System.out.println("Try again");
        }
    }
    
    public void withdrawMoney() {
        if (this.verify()) {            
        	this.amount = this.acceptAmount();
            double balance = getBalance();
            
            if (balance > this.amount) {
                balance -= this.amount;
                System.out.println("You have successfully withdrawn amount " + this.amount + 
                		". Current Account balance is " + balance + " Rupees Only. \nThank You");
                setBalance(balance);
            }
            else {
                System.out.println("You do not have sufficient balance to withdraw..!!");
            }
        }
        else {
            System.out.println("Try again");
        }
    }
    
    public boolean verify() {
        
    	System.out.println("Enter Name:");
        String name = this.sc.nextLine();
        
        System.out.println("Enter Mobile Number:");
        String mNumber = this.sc.nextLine();
        
        System.out.println("Enter Account Number:");
        String accNumber = this.sc.nextLine();
        
        if (name.equals(this.getName()) && accNumber.equals(this.getAccountNumber()) && mNumber.equals(this.getMobileNumber())) {
            System.out.println("User verified..!!");
            return true;
        }
        System.out.println("Invalid Details!");
        return false;
    }
    
    public double acceptAmount() {
        System.out.println("Enter amount: ");
        return this.sc.nextDouble();
    }
}
