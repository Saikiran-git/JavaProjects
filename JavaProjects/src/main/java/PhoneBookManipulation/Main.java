package PhoneBookManipulation;

import java.util.*;
public class Main 
{
    @SuppressWarnings("resource")
	public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        PhoneBook pbobj = new PhoneBook();
        System.out.println("Menu\n1.Add Contact\n2.Display all contacts\n3.Search contact by phone\n4.Remove contact\n5.Exit");
        System.out.println("Enter your choice: ");
        int n = sc.nextInt();
        
        if(n == 1){
            Contact c = new Contact();
            System.out.println("Add a contact: ");
            System.out.println("Enter the First Name: ");
            String fname = sc.nextLine();
            c.setFirstName(fname);
            System.out.println("Enter the Last Name: ");
            String lname = sc.nextLine();
            c.setLastName(lname);
            System.out.println("Enter the Phone No.: ");
            long num = sc.nextLong();
            c.setPhoneNumber(num);
            System.out.println("Email: ");
            String email = sc.nextLine();
            c.setEmailId(email);
            pbobj.addContact(c);
        }
        
        if(n == 2){
            System.out.println("The contacts in the List are:");
            List<Contact> contobj = pbobj.viewAllContacts();
            for(Contact con : contobj){
                System.out.println("First Name: "+con.getFirstName());
                System.out.println("Last Name: "+con.getLastName());
                System.out.println("Phone No.: "+con.getPhoneNumber());
                System.out.println("Email: "+con.getEmailId());
            }
        }
        
        if(n == 3){
            System.out.println("Enter the Phone number to search contact:");
            Long phnum = sc.nextLong(); 
            Contact c = pbobj.viewContactGivenPhone(phnum);
            System.out.println("The contact is: ");
            System.out.println("First Name: "+c.getFirstName());
            System.out.println("Last Name: "+c.getLastName());
            System.out.println("Phone No.: "+c.getPhoneNumber());
            System.out.println("Email: "+c.getEmailId());
        }
        
        if(n == 4){
            System.out.println("Enter the Phone number to remove:");
            Long phno = sc.nextLong();
            System.out.println("Do you want to remove the contact(Y/N):");
            String dec = sc.next();
            if(dec.startsWith("Y")){
                boolean flag = pbobj.removeContact(phno);
                if(flag)
                    System.out.println("The contact is successfully deleted");
                else
                    System.out.println("Contact is not found");
            }
            else if(dec.startsWith("N"))
                return;
        }
        
        if(n == 5){
            return;    
        }
        
    }
}
