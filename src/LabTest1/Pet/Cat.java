/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabTest1.Pet;

/**
 *
 * @author User
 */
public class Cat extends Pet{
    
    private String catName;

    public Cat(String catName, String breed, String sickness, double weight) {
        super(breed, sickness, weight);
        this.catName = catName;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    @Override
    public String toString() {
        String petToString = super.toString();
        return "Name: " + catName + petToString;
    }
    
    
    
}
