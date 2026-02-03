/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class BuyTicket {
    // Ticket[] tickets;
    int seatCount;
    int maxSeats;
    // int numberOfTickets;
    double normalPrice = 12;
    double vipPrice = 20;


    public BuyTicket(){
       this(50);
    }
    public BuyTicket(int maxSeats){
         this.maxSeats = maxSeats;
        this.seatCount = 0;
    }  


    public boolean bookSeat(int numberOfSeats) {
        if (seatCount + numberOfSeats <= maxSeats) {
            seatCount += numberOfSeats;
            return true;
        } else {
            return false;
        }
    }

    public double calculateTotalPrice(double  normalTickets, double  vipTickets) {
        return (normalTickets * normalPrice) + (vipTickets * vipPrice);
    }

    public static void main(String[] args) {

        BuyTicket buy = new BuyTicket();

        int normalTickets = 3;
        int vipTickets = 2;

        if (buy.bookSeat(normalTickets + vipTickets)) {
            double totalPrice = buy.calculateTotalPrice(normalTickets, vipTickets);
            System.out.println("Tickets booked successfully!");
            System.out.println("Total Price: $" + totalPrice);
        } else {
            System.out.println("Not enough seats available.");
        }
    }


}



