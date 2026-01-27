/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class BuyTicket {
    Movie[] movies;
    Seat[] seats;
    int count;

   

    public BuyTicket(){
       this(50);
    }
    public BuyTicket(int maxSeats){
        seats = new Seat[maxSeats]; 
        count = 0;
    }

    public void addSeat(Seat seat){
        if(seat == null){
            System.out.println("Cannot add null seat.");
            return;
        }
        if(count<=seats.length){
            seats[count] = seat;
            count++;
        } else {
            System.out.println("Seat array is full. Cannot add more seats.");
        }

    }
    public double calculateTotalPrice(){
        double total = 0.0;
        for(int i=0; i<count; i++){
            total += seats[i].price ;
        }
        return total;
    }
    public void displayTickets(){
        System.out.println("Tickets Purchased:");
        for(int i=0; i<count; i++){
            System.out.println("Movie Name: " + movies[i].title + " , Seat Number: " + seats[i].seatNumber + ", Price: $" + (seats[i].price));
        }
        System.out.println("Total Price: $" + calculateTotalPrice());
    }
    

}
