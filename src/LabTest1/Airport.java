/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabTest1;

/**
 *
 * @author User
 */
public class Airport {
    
    //main method
    public static void main(String[] args) {
        
        //Instantiate all the object
        Airline airline_name = new Airline ("ANA - Singapore Airlines");
        Airline flight_number  = new Airline ("SQ804");
        Account passanger = new Account ("1201,Khairul,khairul@gmail.com,012-9787765");
        Flight flight  = new Flight ("Business, RM9032");
        Flight meal  = new Flight("Chicken Satay, RM25 ");
        Flight cabincrew  = new Flight("Sue, Daniel, Lily");
       
        Airline airline_name  = new Airline ("Singapore Airlines");
        Airline flight_number  = new Airline ("SQ103");
        Account passenger  = new Account ("1202, Jimmy, jimmy@gmail.com, 019-2722398");
        Flight flight  = new Flight ("Economy, RM3176");
        Flight meal  = new Flight ("Nasi Lemak, RM13 ");
        Flight cabincrew  = new Flight ("Kyra, Rose, Syira");
       
        Airline airline  = new Airline ("Malaysia Airlines");
        Airline flightnum  = new Airline ("MH107");
        Account passenger  = new Account (" 1203, Brandon, brandon@gmail.com, 018-3234146");
        Flight flight  = new Flight ("Business, RM13210");
        Flight meal  = new Flight (" Grilled Lamb, RM39 ");
        Flight cabincrew  = new Flight ("Lingam, Ronny, Rudi, Maria");
    }
    
    
}
