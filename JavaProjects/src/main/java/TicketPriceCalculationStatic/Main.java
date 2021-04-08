package TicketPriceCalculationStatic;

import java.util.Scanner;

public class Main {

	@SuppressWarnings({ "resource", "unused", "static-access" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        Ticket t = new Ticket();
        System.out.println("Enter no of bookings:");
        int noofbookings = sc.nextInt();
        System.out.println("Enter the available tickets:");
        int availticks = sc.nextInt();
        t.setAvailableTickets(availticks);
        System.out.println("Enter the ticketid:");
        int tickid = sc.nextInt();
        t.setTicketid(tickid);
        System.out.println("Enter the price:");
        int tickprice = sc.nextInt();
        t.setPrice(tickprice);
        System.out.println("Enter the no of tickets:");
        int tickets=sc.nextInt();
        if(tickets<=availticks)
            System.out.println("Available tickets: "+t.getAvailableTickets());
        int totalamount = t.calculateTicketCost(tickets);
        if(totalamount == -1)
            System.out.println("-1");
        else{
            System.out.println("Total amount:"+totalamount);
            System.out.println("Available ticket after booking:"+t.getAvailableTickets());
        }   
	}

}
