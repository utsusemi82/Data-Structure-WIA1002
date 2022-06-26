/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabTest1.Pet;

/**
 *
 * @author User
 */
public class Pet implements Comparable<Pet> {
    private String breed,sickness;
    private double weight;

    public Pet(String breed, String sickness, double weight) {
        this.breed = breed;
        this.sickness = sickness;
        this.weight = weight;
    }

    public String getBreed() {
        return breed;
    }

    public String getSickness() {
        return sickness;
    }

    public double getWeight() {
        return weight;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setSickness(String sickness) {
        this.sickness = sickness;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    @Override
    public int compareTo(Pet pet){
        if(this.weight<pet.weight)
            return -1;
        if(this.weight==pet.weight)
            return 0;
        return 1;
    }

    @Override
    public String toString() {
        return "\nBreed: " + breed +
                "\nSickness: " + sickness +
                "\nWeight(KG): " + weight; //To change body of generated methods, choose Tools | Templates.
    }
            
    
    
    
}
