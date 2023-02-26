package practiceJava;

import java.util.Scanner;

public class EncapOne
{
    public static void main(String[] args) {
        
    	Scanner sc = new Scanner(System.in);
        
        System.out.println("Hello World.. This is Encapsulation. Welcome to online banking : ");
        System.out.println("Please enter your choice: \n1.Deposit \n2.Withdraw");
        
        int choice = sc.nextInt();
        AccountOps ao = new AccountOps();
        
        switch (choice) 
        {
            case 1: 
                ao.depositMoney();
                break;
                
            case 2: 
                ao.withdrawMoney();
                break;
            
            default: 
                System.out.println("Invalid choice");
                break;
            
        }
    }
}
