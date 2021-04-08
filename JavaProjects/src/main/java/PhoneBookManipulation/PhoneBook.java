package PhoneBookManipulation;

import java.util.*;

public class PhoneBook{
    
    private List<Contact> phoneBook = new ArrayList<Contact>();
    
    public void setPhoneBook(List<Contact> listobj){
        phoneBook = listobj;
    }
    
    public List<Contact>getPhoneBook(){
        return phoneBook;
    }
    
    public void addContact(Contact contactObj){
        phoneBook.add(contactObj);
    }
    
    public List<Contact> viewAllContacts(){
        return phoneBook;
    }
    
    public Contact viewContactGivenPhone(long phoneNumber){
        Contact c = new Contact();
        for(Contact pb : phoneBook){
            if(pb.getPhoneNumber() == phoneNumber)
                c = pb;
        }
        return c;
    }
    
    public boolean removeContact(long phoneNumber){
        boolean flag = false;
        for(Contact pb : phoneBook){
            if(pb.getPhoneNumber() == phoneNumber){
                flag = true;
                phoneBook.remove(pb);
                break;
            }
        }
        return flag;
    }
    
}
