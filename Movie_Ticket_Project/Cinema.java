/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Cinema {
    String name;
    Seat[] seats;
    Movie[] movies ;
    int menucount;

    public Cinema(String name, int maxSeats){
        this.name = name;
        seats = new Seat[maxSeats];
        menucount = 0;
    }

    public void addMovie(int id, String title, double duration, String showTime, String showDate){
        if(menucount < movies.length){
            movies[menucount] = new Movie(id, title, duration, showTime, showDate);
            menucount++;
        } else {
            System.out.println("Cinema is full. Cannot add more movies.");  
        }
    }

    public void printMovies(){
        System.out.println("Movies in " + name + ":");
        for(int i=0; i<menucount; i++){
            System.out.println("Movie Id:" + movies[i].id + ", Title: " + movies[i].title + ", Duration: " + movies[i].duration + " hours"+", Showtime: " + movies[i].showTime+", Showdate: "+movies[i].showDate);
        }
    }

    public Movie getMovie(int index){
        if(index >=0 && index < menucount){
            return movies[index];
        } else {
            System.out.println("Invalid movie index.");
            return null;
        }
    }

    public BuyTicket createTicket(){
        return new BuyTicket();
    }

    public int getMenuCount(){
        return menucount;
    }


}
