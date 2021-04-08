package BankAccountDetails;

public class Account{
    
    private int accountId;
    private String accountType;
    private int balance;    
    
    public int getAccountId(){
        return accountId;
    }
    
    public void setAccountId(int accid){
        accountId = accid;
    }
    
    public String getAccountType(){
        return accountType;
    }
    
    public void setAccountType(String acctype){
        accountType = acctype;
    }
    
    public int getBalance(){
        return balance;
    }
    
    public void setBalance(int bal){
        balance = bal;
    }
    
    public boolean withdraw(int withdrawnbalance){
        
        if(getBalance() < withdrawnbalance){
            System.out.println("Sorry!!! No enough balance");
            return false;
        }
        
        else{
            int remainingBalance = 0;
            remainingBalance = getBalance() - withdrawnbalance;
            System.out.println("Balance amount after withdraw:"+remainingBalance);
            return true;
        }
        
    }
    
}