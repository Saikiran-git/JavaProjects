package HighestPlacement;

import java.util.Scanner;

public class Placement {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of students placed in CSE:");
        int CSE = sc.nextInt();
        System.out.println("Enter the no of students placed in ECE:");
        int ECE = sc.nextInt();
        System.out.println("Enter the no of students placed in MECH:");
        int MECH = sc.nextInt();
        int maxnum = MECH > (CSE>ECE ? CSE:ECE) ? MECH:((CSE>ECE) ? CSE:ECE);
        int[] maxarr = new int[3];
        maxarr[0] = CSE;
        maxarr[1] = ECE;
        maxarr[2] = MECH;
        int index = 0;
        if(maxarr[0] < 0 || maxarr[1] < 0 || maxarr[2] < 0){
            System.out.println("Input is Invalid");
        }
        else if(maxarr[0] == maxarr[1] && maxarr[1] == maxarr[2] && maxarr[2] == maxarr[0]){
            System.out.println("None of the department has got the highest placement");
        }
        else{
            System.out.println("Highest placement");
            for(int i = 0; i < 3; i++){
                if(maxarr[i] == maxnum){
                    index = i;
                    if(index == 0)
                        System.out.println("CSE");
                    else if(index == 1)
                        System.out.println("ECE");
                    else
                        System.out.println("MECH");
                    continue;
                }
            }
        }
	}

}
