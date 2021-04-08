package IncrementCalculation;

import java.util.*;
class IncrementCalculation{
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the salary");
        int old = sc.nextInt();
        System.out.println("Enter the Performance appraisal rating");
        float incr = sc.nextFloat();
        sc.close();
        int sal = 0;
        if(old <= 0.0 || incr < 1.0 || incr > 5.0){
            System.out.println("Invalid Input");
        }
        else if(incr >= 1.0 && incr <= 3.0){
            sal = old + (old * 10/100);
            System.out.println(sal);
        }
        else if(incr >= 3.1 && incr <= 4.0){
            sal = old + (old * 25 / 100);
            System.out.println(sal);
        }
        else{
            sal = old + (old * 30/100);
            System.out.println(sal);
        }
    }
}