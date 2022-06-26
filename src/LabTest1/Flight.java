/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabTest1;

/**
 *
 * @author User
 */
public class Flight extends Airline{
    
    private Item flight, meal;

    //Constructor for flight class 
    public Flight(int user_id, String name, String email, String contact_number, String cabincrewName, String airline_name, String flight_number, Item flight, Item meal) {
        super(user_id, name, email, contact_number, cabincrewName, airline_name, flight_number);
        this.flight = flight;
        this.meal = meal;
    }

    //Getter 
    public Item getFlight() {
        return flight;
    }

    public Item getMeal() {
        return meal;
    }

    //setter
    public void setFlight(Item flight) {
        this.flight = flight;
    }

    public void setMeal(Item meal) {
        this.meal = meal;
    }

    
    
    
    
    
    
}
