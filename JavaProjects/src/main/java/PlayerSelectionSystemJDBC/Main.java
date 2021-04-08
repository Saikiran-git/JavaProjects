package PlayerSelectionSystemJDBC;

import java.util.Scanner;
import java.util.List;
public class Main {
	public static void main(String[] args) {
	
		// fill your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the minimum height");
        double minh = sc.nextDouble();
        System.out.println("Enter the maximum weight");
	    double maxw = sc.nextDouble();
	    PlayerSelectionSystem pss = new PlayerSelectionSystem();
	    List<String> al = pss.playersBasedOnHeightWeight(minh, maxw);
	    if(al.size() == 0){
	        System.out.println("No players are with minimum height of "+minh+" and maximum weight of "+maxw);
	        System.exit(0);
	    }
	    for(String i:al)
	        System.out.println(i);
		sc.close();
	}

}
