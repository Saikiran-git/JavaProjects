package EmployeeLoanEligibilityPolymorphism;


public class Loan {
	
	//Implement the below method 
	
	public double calculateLoanAmount(Employee employeeObj) {
	    
	    double loanprice = 0;	
	    
	    if(employeeObj instanceof PermanentEmployee){
		    loanprice = 0.15 * (employeeObj.getSalary());
		    return loanprice;
		}
		
		else{
		    loanprice = 0.10 * (employeeObj.getSalary());
		    return loanprice;
		}
		
	}

}
