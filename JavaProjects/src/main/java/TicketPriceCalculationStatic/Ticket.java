package TicketPriceCalculationStatic;

public class Ticket {
	private int ticketid;
    private int price;
    private static int availableTickets;
    
    public void setTicketid(int tickid){
         this.ticketid = tickid;
    }
    
    public int getTicketid(){
         return this.ticketid;
    }
    
    public void setPrice(int p){
        this.price = p;
    }
    
    public int getPrice(){
        return this.price;
    }
    
    public static void setAvailableTickets(int ticketcount){
        if(ticketcount <= 0)
            System.out.println("tickets are less than zero");
        else 
            availableTickets = ticketcount;
    }
    
    public static int getAvailableTickets(){
        return availableTickets;
    }
    
    int priceoftick = getPrice();
    
    public int calculateTicketCost(int nooftickets){
        int ticketcount = getAvailableTickets();
        if(ticketcount < nooftickets){
            return -1;
        }
        else{
            int tickcost = getPrice();
            int availtickets = ticketcount - nooftickets;
            setAvailableTickets(availtickets);
            int totalamount = nooftickets * tickcost;
            return totalamount;
        }
    }
}
