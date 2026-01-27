/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Seat {
    int seatNumber;
    String seatType;
    boolean isAvailable;
    double price;

    public Seat( int seatNumber, String seatType, boolean isAvailable, double price){
        this.seatNumber = seatNumber;
        this.seatType = seatType;
        this.isAvailable = isAvailable;
        this.price = price;


    }

    public void priceSeat(){
        if(seatType.equals("VIP")){
            price += 20.0;
        } else if (seatType.equals("Regular")){
            price += 10.0;
        }
    }

}
