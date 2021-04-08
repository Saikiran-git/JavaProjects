package DivideTwoNumbersUsefinally;

import java.util.*;
public class Division{
    
    @SuppressWarnings("finally")
	public String divideTwoNumbers(int a, int b){
        int q = -1;
        try{
            q = a / b;
        }
        catch(ArithmeticException e){
            System.out.println();
        }
        finally{
            if(q != -1)
                return ("The answer is "+q+". Thanks for using the application.");
            else
                return ("Division by zero is not possible. Thanks for using the application.");
        }
    }
    
    public static void main(String[] args){
        Division d = new Division();
        System.out.println("Enter the numbers");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        try{
            System.out.println(d.divideTwoNumbers(a, b));
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}