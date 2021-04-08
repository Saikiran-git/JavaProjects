package FindAverageAge;

import java.util.*;
public class Test{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);;
        System.out.println("Enter total no.of employees:");
        int n = sc.nextInt();
        if(n > 1){
            int count = 0;
            int[] arr = new int[n];
            double ans = 0.0;
            System.out.println("Enter the age for "+n+" employees:");
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
                if(arr[i] >= 28 && arr[i] <= 40)
                    ans += arr[i];
                else if(arr[i] < 28 || arr[i] > 40){
                    count++;
                    break;
                }
            }
            if(count != 1){
                ans /= n;
                System.out.println("The average age is "+String.format("%.02f",ans));
            }
            else
                System.out.println("Invalid age encountered!");
        }
        else
            System.out.println("Please enter a valid employee count");
        sc.close();
    }
}