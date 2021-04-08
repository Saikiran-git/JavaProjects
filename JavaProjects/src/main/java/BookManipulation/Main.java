package BookManipulation;

import java.util.*;
public class Main{
    @SuppressWarnings("resource")
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Library l = new Library();
        for(int i = 0; i >= 0; i++){
            System.out.println("1.Add Book \n2.Display all book details \n3.Search Book by author");
            System.out.println("4.Count number of book - by book name \n5.Exit");
            System.out.println("Enter your choice:");
            int choice = sc.nextInt();
            
            if(choice == 1){
                Book b = new Book();
                System.out.println("Enter the isbn no:");
                int isbn = sc.nextInt();
                sc.nextLine();
                b.setIsbnno(isbn);
                System.out.println("Enter the book name:");
                String bookName = sc.nextLine();
                b.setBookName(bookName);
                System.out.println("Enter the author name:");
                String author = sc.nextLine();
                b.setAuthor(author);
                l.addBook(b);
            }
            
            else if(choice == 2){
                ArrayList<Book> al = l.viewAllBooks();
                for(int j = 0; j < al.size(); j++){
                    System.out.println("ISBN no: "+al.get(j).getIsbnno());
                    System.out.println("Book name: "+al.get(j).getBookName());
                    System.out.println("Author name: "+al.get(i).getAuthor());
                }
            }
            
            else if(choice == 3){
                System.out.println("Enter the author name:");
                String name = sc.nextLine();
                ArrayList<Book> al = l.viewBooksByAuthor(name);
                if(al.isEmpty())
                    System.out.println("None of the book published by author "+name);
                else{
                    for(int j = 0; j < al.size(); j++){
                        System.out.println("ISBN no: "+al.get(j).getIsbnno());
                        System.out.println("Book name: "+al.get(j).getBookName());
                        System.out.println("Author name: "+al.get(j).getAuthor());
                    }
                }
            }
            
            else if(choice == 4){
                ArrayList<Book> al1 = l.getBookList();
                if(al1.size() > 0){
                    for(int j = 0; j < al1.size(); j++){
                        int al = l.countnoofbook(al1.get(j).getBookName());
                        System.out.println(al1.get(j).getBookName()+"-"+al);
                    }
                }
                else
                    System.out.println("The list is empty");
            }
            else
                break;
        }
    }
}