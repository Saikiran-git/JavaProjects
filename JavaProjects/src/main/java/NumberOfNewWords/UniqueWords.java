package NumberOfNewWords;

//import the necessary packages if needed
import java.util.*; 
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.*;

public class UniqueWords
{

	@SuppressWarnings("resource")
	public static void main(String args[]){
	    
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter Student's Article");
	    String s = sc.next() + sc.nextLine();
	    s = s.replaceAll("[\\p{P}&&[^\u0027]]", "");
	    s = s.toLowerCase();
	    int c = 1;
	    
	    for(int i = 0; i < s.length(); i++){
	  	  if(s.charAt(i)==' ') {
	  		  c++;
	  	  }
	    }
	
	    System.out.println("Number of words "+c);
	    
	    s = Arrays.stream( s.split("\\s+")).distinct().collect(Collectors.joining(" ") );
	    String[] words1 = s.split(" ");
	    List<String> list1 = new ArrayList<String>(Arrays.asList(words1));
	    
	    System.out.println("Number of unique words "+list1.size());
	    
	    Collections.sort(list1);
	    System.out.println("The words are");
	    int i = 1;
	    for(String str : list1){
	        System.out.println(i+". "+str);
	        i++;
	    }
	    
	}

}