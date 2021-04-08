package ContactDetailsOfHosteller;

import java.util.Scanner;
public class Main{
	
    @SuppressWarnings("resource")
	public static Hosteller getHostellerDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Details:");
        System.out.println("Student Id: ");
        int stuid = sc.nextInt();
        System.out.println("Student Name: ");
        sc.nextLine();
        String stuname = sc.nextLine();
        System.out.println("Department Id: ");
        int deptid = sc.nextInt();
        System.out.println("Gender: ");
        sc.nextLine();
        String gen = sc.nextLine();
        System.out.println("Phone Number: ");
        String phno = sc.nextLine();
        System.out.println("Hostel Name: ");
        String hosname = sc.nextLine();
        System.out.println("Room Number: ");
        int rnum = sc.nextInt();
        
        Hosteller host = new Hosteller();
        host.setStudentId(stuid);
        host.setName(stuname);
        host.setDepartmentId(deptid);
        host.setGender(gen);
        host.setPhone(phno);
        host.setHostelName(hosname);
        host.setRoomNumber(rnum);
        
        System.out.println("Modify Room Number(Y/N)");
        char i = sc.next().charAt(0);
        
        if(i == 'Y'){
            System.out.println("New Room Number");
            int newnum = sc.nextInt();
            host.setRoomNumber(newnum);
        }
        
        System.out.println("Modify Phone Number(Y/N)");
        char j = sc.next().charAt(0);
        
        if(j == 'Y'){
            System.out.println("New Room Number");
            sc.nextLine();
            String nuwnum = sc.nextLine();
            host.setPhone(nuwnum);
        }
        
        return host;
    }
    
    public static void main(String args[]){
        Hosteller hostmain = new Hosteller();
        hostmain = getHostellerDetails();
        System.out.println("The Student Details");
        System.out.println(hostmain.getStudentId()+" "+hostmain.getName()+" "+hostmain.getDepartmentId()+" "+hostmain.getGender()+" "+hostmain.getPhone()+" "+hostmain.getHostelName()+" "+hostmain.getRoomNumber());
    }
    
}