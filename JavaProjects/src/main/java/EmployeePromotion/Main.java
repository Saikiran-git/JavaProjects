package EmployeePromotion;

import java.util.*;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		
		//fill the code
		List<Employee> employeeList = new LinkedList<>();
		System.out.println("Enter the number of employees");
		System.out.println("Enter the employee details");
		int n = sc.nextInt();
		Management m = null;
		sc.nextLine();
		
		while(n-- > 0){
		    String str1 = sc.nextLine();
		    String[] str2 = str1.split(":");
		    Employee e = new Employee(str2[0], str2[1], Double.parseDouble(str2[2]));
		    employeeList.add(e);
		}
		
		System.out.println("Enter the number of times salary limit to be searched");
		int lim = Integer.parseInt(sc.next());
		
		for(int i = 0; i < lim; i++) 
		    System.out.println("Enter the salary limit to be searched");
		
		for(int i = 0; i < lim; i++){
		    double d = Double.parseDouble(sc.next());
		    m = new Management(d, employeeList);
		    m.start(); 
		    m.join();
		    int cnt = m.getCount();
		    System.out.println(d+" : "+cnt);
		}
		
    }
}
