<<<<<<< HEAD
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
public class Showtime {
    String time;
    String date;
    int hallNumber;
<<<<<<< HEAD
    Movie movie;

    public Showtime(String time, String date , int hallNumber, Movie[] movies){
        this.time = time;
        this.date = date;
        this.hallNumber = hallNumber;
        this.movie = movie;
    }
=======

    public Showtime(String time, String date){
        this.time = time;
        this.date = date;
    }


    String name;
    String phoneNumber;
    int customerID;
    boolean isMember;
    int secretCode = 1234;

    public Customer(String name, String phoneNumber, int customerID, boolean isMember){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.customerID = customerID;
        this.isMember = isMember;
    }

    public boolean member(int code){
        if (code == secretCode){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {

        
      }




>>>>>>> c8481b24a95cd1b63063aebcd42e689b8545b924
}
