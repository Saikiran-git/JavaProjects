package SearchForTrainsJDBC;

import java.util.*;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// fill your code here
			
		ArrayList<Train> al = new ArrayList<>();
		TrainManagementSystem tms = new TrainManagementSystem();
        System.out.println("Enter the source");
        String source = sc.nextLine();
        System.out.println("Enter the destination");
        String destination = sc.nextLine();
        System.out.println("Enter the coach type");
        String coach = sc.nextLine();
        sc.close();
        if(coach.equalsIgnoreCase("AC1") || coach.equalsIgnoreCase("AC2") || coach.equalsIgnoreCase("AC3")){
            al = tms.viewTrain(coach, source, destination);
            if(al.size() == 0)
                System.out.println("No trains found");
            else{
                for(Train i:al)
                System.out.println(i.getTrainNumber()+" "+i.getTrainName());
            }
        }
        else if(coach.equalsIgnoreCase("Sleeper") || coach.equalsIgnoreCase("Seater")){
            al = tms.viewTrain(coach, source, destination);
            if(al.size() == 0)
                System.out.println("No trains found");
            else{
                for(Train i:al)
                System.out.println(i.getTrainNumber()+" "+i.getTrainName());
            }
        }
        else
            System.out.println("Invalid Coach type");
	}
}