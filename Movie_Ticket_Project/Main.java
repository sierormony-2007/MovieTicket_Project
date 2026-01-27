/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Main {
    public static void main(String[] args) {
        Cinema cinema = new Cinema("Grand Cinema", 100);
        
        cinema.addMovie(1, "Inception", 2.5, "18:00", "2024-07-01");
        cinema.addMovie(2, "The Matrix", 2.0, "20:00", "2024-07-01");
        
        cinema.printMovies();
        
        Movie selectedMovie = cinema.getMovie(0);
        if (selectedMovie != null) {
            System.out.println("Selected Movie: " + selectedMovie.title);
        }
        
        BuyTicket ticket = cinema.createTicket();
        
        Seat seat1 = new Seat(1, "VIP", true, 20.0);
        Seat seat2 = new Seat(2, "Regular", true, 10.0);
        
        ticket.addSeat(seat1);
        ticket.addSeat(seat2);
        
        ticket.displayTickets();
    }
}
