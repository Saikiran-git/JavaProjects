package AccountManipulationAbstractClass;

import java.util.Scanner;
public class Main{
    
    @SuppressWarnings("resource")
	public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        String c = sc.nextLine();
        String d = sc.nextLine();
        Customer e = new Customer(b, c, d);
        double f = sc.nextDouble();
        double g = sc.nextDouble();
        double h = sc.nextDouble();
        
        SavingsAccount sa = new SavingsAccount(a, e, f, g);
        boolean flag = sa.withdraw(h);
        if(flag == true)
            System.out.println("withdraw successful");
        else
            System.out.println("failed");
    }
}