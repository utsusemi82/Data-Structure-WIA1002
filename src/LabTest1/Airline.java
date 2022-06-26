/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabTest1;

/**
 *
 * @author User
 */
public class Airline extends Account{
    
    private String airline_name, flight_number;

    //Constructor for airline class
    public Airline(int user_id, String name, String email, String contact_number, String cabincrewName, String airline_name, String flight_number) {
        super(user_id, name, email, contact_number, cabincrewName);
        this.airline_name = airline_name;
        this.flight_number = flight_number;
    }

    //getter for new variables
    public String getAirline_name() {
        return airline_name;
    }

    public String getFlight_number() {
        return flight_number;
    }

    //getter for new variables
    public void setAirline_name(String airline_name) {
        this.airline_name = airline_name;
    }

    public void setFlight_number(String flight_number) {
        this.flight_number = flight_number;
    }

    //toString method to return the airline name and flight number
    @Override
    public String toString() {
        String accountToString = super.toString();
        return "Airline Name: " +  airline_name + 
               "\nFlight Number: " + flight_number + accountToString;
    }
    
    
    
}
