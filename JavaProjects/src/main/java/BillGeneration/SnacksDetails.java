package BillGeneration;

import java.util.*;
class SnacksDetails{
    public static void main(String[] args){
        int pizza, puff, drink;
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the no of pizzas bought:");
        pizza = sc.nextInt();
        System.out.println("Enter the no of puffs bought:");
        puff = sc.nextInt();
        System.out.println("Enter the no of cool drinks bought:");
        drink = sc.nextInt();
        sc.close();
        int Total;
        Total = (100 * pizza) + (20 * puff) + (10 * drink);
        System.out.println("Bill Details");
        System.out.println("No of pizzas:"+pizza);
        System.out.println("No of puffs:"+puff);
        System.out.println("No of cooldrinks:"+drink);
        System.out.println("Total price="+Total);
        System.out.println("ENJOY THE SHOW!!!");
    }
}
