package PlacementEnrollmentCount;

import java.util.Scanner;
import java.util.stream.Stream;
import java.util.stream.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		//Fill your code here   
        System.out.println("Enter all roll numbers separated by comma");
        String roll = sc.nextLine();
        System.out.println("Enter the department name acronym");
        String dept = sc.nextLine();
        int c = getCount(getRollNumbers(roll),dept);
        if(c > 0)
            System.out.println("Number of students in "+dept+" is "+c);
        else
            System.out.println("No students from "+dept);

        sc.close();
	}

	public static Stream<String> getRollNumbers(String rollNumbers) {
		//Fill your code here
        String[] rollnum = rollNumbers.split(",");
		Stream<String> stream = Arrays.stream(rollnum);
		return stream;

	}

	public static int getCount(Stream<String> rollNumberStream, String dept) {
		//Fill your code here       
        int len = dept.length();
		List<String> emp = rollNumberStream.filter(
		    x -> x.substring(0, len).equalsIgnoreCase(dept)).collect(Collectors.toList()
		);
		return emp.size();


	}

}
