package BankAccountDetails;

import java.util.Scanner;

public class AccountDetails{

    @SuppressWarnings("resource")
	public static Account getAccountDetails(){
        
        Account a = new Account();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account id:");
        int accountid = sc.nextInt();
        a.setAccountId(accountid);
        sc.nextLine();
        System.out.println("Enter account type:");
        String accounttype = sc.nextLine();
        a.setAccountType(accounttype);
        int retrievebal;
        
        do{
            System.out.println("Enter balance:");
            int accountbalance = sc.nextInt();
            a.setBalance(accountbalance);
            retrievebal = a.getBalance();
            if(retrievebal <= 0)            
                System.out.println("Balance should be positive");
        }
        while(retrievebal <= 0);
        return a;
    }
    
    @SuppressWarnings("resource")
	public static int getWithdrawAmount(){
        Scanner sc = new Scanner(System.in);
        int withdrawnbalance;
        do{
            System.out.println("Enter amount to be withdrawn:");
            withdrawnbalance = sc.nextInt();
            if(withdrawnbalance <= 0)
                System.out.println("Amount should be positive");
        }
        while(withdrawnbalance <= 0);
        return withdrawnbalance;
    }
    
    public static void main(String args[]){
        Account acc = new Account();
        acc = getAccountDetails();
        int withdrawamount = getWithdrawAmount();
        acc.withdraw(withdrawamount);
    }
   
}
