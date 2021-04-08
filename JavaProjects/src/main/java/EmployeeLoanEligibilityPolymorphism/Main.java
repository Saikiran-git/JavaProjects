package EmployeeLoanEligibilityPolymorphism;

import java.util.Scanner;
public class Main{
   
    @SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        String b = sc.nextLine();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        int e = sc.nextInt();
        int f = sc.nextInt();
        Employee emp1 = new PermanentEmployee(a, b, d);
        emp1.calculateSalary();
        Employee emp2 = new TemporaryEmployee(a, b, e, f);
        emp2.calculateSalary();
        Loan l = new Loan();
        l.calculateLoanAmount(emp1);
        l.calculateLoanAmount(emp2);
    }
    
}
