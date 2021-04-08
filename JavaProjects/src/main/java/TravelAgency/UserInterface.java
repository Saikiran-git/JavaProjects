package TravelAgency;

import java.util.Scanner;

public class UserInterface {
    
    static Ticket t;
    static double cost = 0.0;
    
    public static CommissionInfo generateCommissionObtained (){
        CommissionInfo ci = var ->{
            String str = var.getClassType();
            double comm = 0;
            if(str.equalsIgnoreCase("SL") || str.equalsIgnoreCase("2S")) 
                comm += 60;
            else 
                comm += 100;
            return comm;
        };
        return ci;
    }
    
    @SuppressWarnings("resource")
	public static void main(String args[]) {
        
        // Fill the code here
        
        //double cost = 0.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of passengers");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            System.out.println("Details of Passenger "+(i + 1) +":");
            System.out.println("Enter the pnr no:");
            long pnrNo = sc.nextLong();
            System.out.println("Enter passenger name:");
            String passengerName = sc.next();
            System.out.println("Enter seat no:");
            int seatNo = sc.nextInt();
            System.out.println("Enter class type:");
            String classType = sc.next();
            System.out.println("Enter ticket fare:");
            double ticketFare = sc.nextDouble();
            UserInterface.t = new Ticket(pnrNo, passengerName, seatNo, classType, ticketFare);
            CommissionInfo c = UserInterface.generateCommissionObtained();
            UserInterface.cost += c.calculateCommissionAmount(t);
        }
        System.out.println("Commission Obtained");
        System.out.printf("Commission obtained per each person: Rs.%.2f",cost);
        
    }
    
}
