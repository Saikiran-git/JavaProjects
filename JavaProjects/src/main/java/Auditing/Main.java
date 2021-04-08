package Auditing;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class Main {
	
	private static Map <String,Double> employeeMap;

	public Map<String, Double> getEmployeeMap() {
		return employeeMap;
	}

	@SuppressWarnings("static-access")
	public void setEmployeeMap(Map<String, Double> employeeMap) {
		this.employeeMap = employeeMap;
	}
	
	public static void addEmployeeDetails(String employeeName, double salary)
	{
		// Fill the code
		employeeMap.put(employeeName, salary);
	}
	
	
	
	public static EmployeeAudit findEmployee()
	{
		// Fill the code
		EmployeeAudit ea = (double salary) -> {
	        Main m = new Main();
	        ArrayList<String> name = new ArrayList<String>();
	        Map <String, Double> empDetails = m.getEmployeeMap();
	        for(Map.Entry<String,Double> empdet:empDetails.entrySet()){
	            double empSalary = empdet.getValue();
	            if(salary >= empSalary){
	                name.add(empdet.getKey());
	            }
	        }
	        return name;
	    };
	    return ea;
	}
	
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		// Fill the code
		boolean b = true;
		while(b){
		    System.out.println("1.Add Employee Details");
			System.out.println("2.Find Employee Details");
			System.out.println("3.Exit");
			System.out.println("Enter the choice");
			int choice = sc.nextInt();
			switch(choice){
			    case 1:
			        System.out.println("Enter the Employee name");
		            System.out.println("Enter the Employee Salary");
		            Main.addEmployeeDetails(sc.nextLine(), sc.nextDouble());
    				break;
    			
    			case 2:
        			System.out.println("Enter the salary to be searched");
		            EmployeeAudit ea = Main.findEmployee();
		            ArrayList<String> empDetails = ea.fetchEmployeeDetails(sc.nextDouble());
		            System.out.println("Employee List");
		            for(int i = 0; i < empDetails.size(); i++)
		                System.out.println(empDetails.get(i));
		            break;
        				
    			case 3:
    			    System.out.println("Let's complete the session");
    			    b = false;
    			    System.exit(0);
			}
		}
		sc.close();
	}

}
