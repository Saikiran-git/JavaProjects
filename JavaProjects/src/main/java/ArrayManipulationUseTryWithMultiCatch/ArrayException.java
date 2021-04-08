package ArrayManipulationUseTryWithMultiCatch;

import java.util.Scanner;
public class ArrayException{
    
    public String getPriceDetails(){
        
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        
        try{
            int n = sc.nextInt();
            int[] arr = new int[n];
            
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            
            int index = sc.nextInt();
            
            return ("The array element is "+arr[index]);
        }
        
        catch(ArrayIndexOutOfBoundsException e){
            return ("Array index is out of range");
        }
            
        catch(Exception e){
            return ("Input was not in the correct format");
        }
        
    }
    
    public static void main(String args[]){
        ArrayException aaa = new ArrayException();
        System.out.println(aaa.getPriceDetails());
    }
    
}