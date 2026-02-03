<<<<<<< HEAD
import java.util.Scanner;
=======
>>>>>>> c8481b24a95cd1b63063aebcd42e689b8545b924
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
<<<<<<< HEAD

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Movie Ticket Booking System!");
        System.out.println("-------------------------------------------");

        Cinema cinema = new Cinema("Grand Cinema", 10);

        cinema.addMovie(1, "Inception", 2.5, "2025-02-01", "11:00 AM","2025");
        cinema.addMovie(2, "The Matrix", 2.0, "2025-02-01", "14:00 PM","2025");

        cinema.printMovies();

        
        System.out.println("F1 Primitive copy proof");
        double originalPrice = 12.00;
        double copyPrice = originalPrice;
        copyPrice = 15.00;

        System.out.println(""+ originalPrice);
        System.out.println(""+ copyPrice);

        //F2 - Reference copy prooof

        System.out.println("\nF2 Reference copy proof");

        Movie m1 = cinema.movies[0];
        Movie m2 = m1;            // reference copy
        m2.title = "Inception Updated";

        System.out.println("m1 title: " + m1.title);
        System.out.println("m2 title: " + m2.title);

        //F3 -Array stores reference proof
        System.out.println("\nF3 Array stores reference proof");

        m1.title = "Inception Final";
        System.out.println("Movie in cinema array: " + cinema.movies[0].title);





        //F4 - Snapshot proof 
        

       System.out.println("\nF4 Snapshot proof");

        Movie movieForTicket = cinema.movies[0];
        Customer customer = new Customer("kkkk","156335",44,true);

        Ticket ticket = new Ticket(1, movieForTicket, customer, 12.00, "VIP");

        movieForTicket.price = 20.00; // change original movie price

        System.out.println("Ticket price snapshot: " + ticket.priceSnapshot);










        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();


        System.out.print("Enter phone number: ");
        String phoneNumber = scanner.nextLine();

        System.out.print("Enter customer ID: ");
        
        int customerID = scanner.nextInt();

        System.out.println("Enter Secret Code to verify membership: ");
        int secretCodeInput = scanner.nextInt();

        Customer customer1 = new Customer(name, phoneNumber, customerID, false);

        if(customer1.member(secretCodeInput)){
            System.out.println("Welcome back, " + customer1.name + "! You are a verified member.");
            customer1.isMember = true;
        } else {
            System.out.println("Hello, " + customer1.name + ". You are not a member.");
        }

        System.out.println("\nCustomer Details:");
        System.out.println("Name: " + customer1.name);
        System.out.println("Phone: " + customer1.phoneNumber);
        System.out.println("ID: " + customer1.customerID);
        System.out.println("Is Member: " + customer1.isMember);


        System.out.println("Enter movie ID you want to watch: ");
        int chosenId = scanner.nextInt();
        Movie selectedMovie = cinema.findMovieById(chosenId);

        if (selectedMovie == null) {
            System.out.println("Movie not found!");
            return; // stop program safely
       }

        System.out.println("You selected: " + selectedMovie.title);
        




       

        


    }


             

}
=======
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
>>>>>>> c8481b24a95cd1b63063aebcd42e689b8545b924
