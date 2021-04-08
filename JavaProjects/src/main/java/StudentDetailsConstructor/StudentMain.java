package StudentDetailsConstructor;

import java.util.Scanner;
public class StudentMain{
    @SuppressWarnings("resource")
	public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student's Id:");
        int studentid = sc.nextInt();
        System.out.println("Enter Student's Name:");
        String studentname = sc.nextLine();
        System.out.println("Enter Student's address:");
        String studentaddress = sc.nextLine();
        System.out.println("Whether the student is from NIT(Yes/No):");
        String decision = sc.nextLine();
        String yes = "YES", no = "NO";
        if(decision.equals(yes)){
            Student std = new Student(studentid, studentname, studentaddress);
            System.out.println("Student id:"+std.getStudentId());
            System.out.println("Student name:"+std.getStudentName());
            System.out.println("Address:"+std.getStudentAddress());
            System.out.println("College name:"+std.getCollegeName());
        }
        else if(decision.equals(no)){
            System.out.println("Enter the college name:");
            String collegename = sc.nextLine();
            Student std = new Student(studentid, studentname, studentaddress, collegename);
            System.out.println("Student id:"+std.getStudentId());
            System.out.println("Student name:"+std.getStudentName());
            System.out.println("Address:"+std.getStudentAddress());
            System.out.println("College name:"+std.getCollegeName());
        }
        else{
            System.out.println("Wrong Input");
        }
    }
}