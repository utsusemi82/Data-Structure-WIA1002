/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabTest1;

/**
 *
 * @author User
 */
public class Account {
    private int user_id; 
    private String name, email, contact_number;
    private String cabincrewName;

    //Constructor for account
    public Account(int user_id, String name, String email, String contact_number, String cabincrewName) {
        this.user_id = user_id;
        this.name = name;
        this.email = email;
        this.contact_number = contact_number;
        this.cabincrewName = cabincrewName;
    }
    //Getter for the account class
    public int getUser_id() {
        return user_id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getContact_number() {
        return contact_number;
    }

    public String getCabincrewName() {
        return cabincrewName;
    }

    //Setter for the account class
    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setContact_number(String contact_number) {
        this.contact_number = contact_number;
    }

    public void setCabincrewName(String cabincrewName) {
        this.cabincrewName = cabincrewName;
    }

    //toString method to return the passenger information
    @Override
    public String toString() {
        return "Passanger Info: \n" + 
                "\nUser ID: " + user_id + 
                "\nName: " + name + 
                "\nEmail: " + email + 
                "\nContact Num: " + contact_number ;
    }
    
    
    
    
}
