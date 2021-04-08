package RegisterACandidateUserdefinedExceptionWithThrowAndThrows;

import java.util.Scanner;

public class Main{
    
    @SuppressWarnings("resource")
	public static Candidate getCandidateDetails() throws InvalidSalaryException{
        Scanner sc = new Scanner(System.in);
        Candidate c = new Candidate();
        String name = sc.nextLine();
        String gen = sc.next();
        c.setName(name);
        c.setGender(gen);
        double salary = sc.nextDouble();
        if(salary <10000){
            throw new InvalidSalaryException("Registration Failed. Salary cannot be less than 10000");
        }
        else 
            c.setExpectedSalary(salary);
        return c;
    }
    
    public static void main(String args[]){
        try{
            Candidate c = Main.getCandidateDetails();
            if(c != null) 
                System.out.println("Registration Successful");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
}