/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class BuyTicket {
<<<<<<< HEAD
    // Ticket[] tickets;
    int seatCount;
    int maxSeats;
    // int numberOfTickets;
    double normalPrice = 12;
    double vipPrice = 20;

=======
    Movie[] movies;
    Seat[] seats;
    int count;

   
>>>>>>> c8481b24a95cd1b63063aebcd42e689b8545b924

    public BuyTicket(){
       this(50);
    }
    public BuyTicket(int maxSeats){
<<<<<<< HEAD
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



=======
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
>>>>>>> c8481b24a95cd1b63063aebcd42e689b8545b924
