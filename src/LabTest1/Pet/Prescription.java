/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabTest1.Pet;

/**
 *
 * @author User
 * @param <E>
 */
public class Prescription<E extends Pet> {
    
    private String medication;
    private double dosage;
    private E pet;

    public Prescription(String medication, double dosage, Pet pet) {
        this.medication = medication;
        this.dosage = dosage;
        this.pet = (E) pet;
    }

    @Override
    public String toString() {
        String catToString = pet.toString();
        return "Prescription Note: \n" + catToString +
                "\nMedication: " + medication + 
                "\nDosage(ML): " + dosage ;
    }
    
    
    
    
    
    
}
