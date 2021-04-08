package FuelConsumptionCalculator;

import java.util.Scanner;

public class FuelConsumption {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of liters to fill the tank");
        int a = sc.nextInt();
        
        if(a<=0)
            System.out.println(a+" is an Invalid Input");
        else{
            System.out.println("Enter the distance covered");
            int b = sc.nextInt();
            
            if(b<=0)
                System.out.println(b+" is an Invalid Input");
            else{
                System.out.println("Liters/100KM");
                double lit = ((double)a/b)*100;
                System.out.printf("%.2f",lit);
                System.out.println("\nMiles/gallons");
                lit = (b*0.6214)/(a*0.2642);
                System.out.printf("%.2f",lit);
            }
        }
	}

}
