package MallParkingSystem;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.Scanner;
import java.time.temporal.ChronoUnit;
public class Main {

public static void main(String [] args) {
   
        try (//Fill the Code
		Scanner sc = new Scanner(System.in)) {
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
			String currenttime = "29/10/2019 20:10";
			System.out.println("In-time");
			String intime = sc.nextLine();
			LocalDateTime localintime = null;
			
			try{
	            localintime = LocalDateTime.parse(intime, dtf);
	        }
	        catch(Exception e){
	            System.out.println(intime+" is an Invalid In-Time");
	            return;
	        }
			
			localintime = LocalDateTime.parse(intime, dtf);

			LocalDateTime localcurrtime = LocalDateTime.parse(currenttime, dtf);
			
			if(localintime.compareTo(localcurrtime) >= 0){
			    System.out.println(intime+" is an Invalid In-Time");
			    return;
			}
			
			System.out.println("Out-time");
			String outtime = sc.nextLine();
			LocalDateTime localouttime = null;
			
			try{
	            localouttime = LocalDateTime.parse(outtime, dtf);
	        }
	        catch(Exception e){
	            System.out.println(outtime+" is an Invalid Out-Time");
	            return;
	        }
			
			localouttime = LocalDateTime.parse(outtime, dtf);
			
			if(localintime.compareTo(localouttime) >= 0){
			    System.out.println(outtime+" is an Invalid Out-Time");
			    return;
			}
			
			long noofhours = localintime.until(localouttime, ChronoUnit.HOURS);
			long cost = (noofhours * 10) + 10;
			System.out.println(cost+" Rupees");
		}
        
    }
}
