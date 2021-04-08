package BookManipulation;

import java.util.*;
public class Library{
    
    private ArrayList<Book> bookList = new ArrayList<Book>();
    
    public void setBookList(ArrayList<Book> bookList){
        this.bookList=bookList;
    }
    
    public ArrayList<Book> getBookList(){
        return bookList;
    }
    
    public void addBook(Book bobj){
        bookList.add(bobj);
    }
    
    public boolean isEmpty(){
        return bookList.isEmpty();
    }
    
    public ArrayList<Book> viewAllBooks(){
        return bookList;
    }
    
    public ArrayList<Book> viewBooksByAuthor(String author){
        ArrayList<Book> al = new ArrayList<Book>();
        for(int i = 0; i < bookList.size(); i++){
            if(bookList.get(i).equals(author)){
                al.add(bookList.get(i));
            }
        }
        return al;
    }
    
    public int countnoofbook(String bname){
        int count = 0;
        for(int i = 0; i < bookList.size(); i++){
            if((bookList.get(i).getBookName()).equals(bname)){
                count++;
            }
        }
        return count;
    }
}