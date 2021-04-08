package AccountManipulationAbstractClass;

public class SavingsAccount extends Account{


    private double minimumBalance;
    
    //Uncomment the getters and setters after writing the attributes
    
    public SavingsAccount(int accountNumber, Customer customerobj, double balance, double MinimumBalance){
        super(accountNumber, customerobj, balance);
        minimumBalance = MinimumBalance;
    }

    
    public double getMinimumBalance() {
		return minimumBalance;
	}

	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}
    
    public boolean withdraw(double amount){
       if((balance - amount) > minimumBalance){
           balance = (balance - amount);
           return true;
       }
       else
           return false;
   }
    
}

    