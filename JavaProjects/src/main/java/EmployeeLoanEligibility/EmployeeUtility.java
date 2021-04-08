package EmployeeLoanEligibility;

import java.util.stream.Stream;
import java.util.*;

public class EmployeeUtility {

	public Employee[] getEmployeeDetails(String[] details) {

		//Fill your code here   
		int len = details.length;
        Employee[] e = new Employee[len];
	    for(int i = 0; i < len; i++){
	        String[] str = details[i].split(";"); 
	        Employee emp = new Employee();
	        emp.setEmpId(str[0]);
	        emp.setEmpName(str[1]);
	        emp.setSalary(Double.parseDouble(str[2]));
	        e[i] = emp;
	    }
	    return e;
        

	}

	public Stream<Employee> getStreamOfEmployee(Employee[] empDetails) {

		//Fill your code here
        Stream<Employee> stream = Arrays.stream(empDetails);
	    return stream;


	}

	public String[] shortlistedEmployee(Stream<Employee> empStream,double minSalary) {

		//Fill your code here
        Comparator<Employee> c = (k, v)-> k.getEmpId().compareTo(v.getEmpId());//1
	    Employee[] emp = empStream.filter(e->e.getSalary() >= minSalary)
                        .sorted(c)
                        .toArray(Employee[]::new);//2
	    String[] str = new String[emp.length];
	    for(int i = 0; i < emp.length; i++)
	        str[i] = emp[i].getEmpId()+" "+emp[i].getEmpName()+" "+emp[i].getSalary();//3
        return str;
	}



}
