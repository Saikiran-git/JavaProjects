package AddFlightUsingJDBC;

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int flightid = sc.nextInt();
        String source = sc.nextLine();
        String destination = sc.nextLine();
        int noofseats = sc.nextInt();
        double flightfare = sc.nextDouble();
        Flight fl = new Flight(flightid, source, destination, noofseats, flightfare);
        FlightManagementSystem fms = new FlightManagementSystem();
        boolean appended = fms.addFlight(fl);
        try{
            if(appended) 
                System.out.println("Flight details added successfully");
            else
                System.out.println("Addition not done");
        }
        catch(Exception e){
            extracted();
        }
        sc.close();
    }

	private static void extracted() {
	}
}