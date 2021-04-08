package LeastOffer;

import java.util.Scanner;

class Cart{
    String name;
    int price, percent, disprice;
    public Cart(String name, int price, int percent, int disprice){
        this.name = name;
        this.price = price;
        this.percent = percent;
        this.disprice = disprice;
    }
    
    public String getName(){
        return name;
    }
    
    public int getDisprice(){
        return disprice;
    }
    
}

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int price;
        int percent;
        String name;
        Cart[] ct = new Cart[n];
        int leastprice=0;   
        for(int i = 0; i < n; i++){
            String input = sc.next();
            String[] values = input.split(",");
            name = values[0];
            price = Integer.parseInt(values[1]);
            percent = Integer.parseInt(values[2]);
            int disprice = (price * percent) / 100;
            ct[i] = new Cart(name, price, percent, disprice);
            if(i == 0 || disprice <= leastprice){
                leastprice = disprice;
                continue;
            }
        }
        for(Cart items : ct)
            if(items.getDisprice() == leastprice)   
                System.out.println(items.getName());
	}

}
