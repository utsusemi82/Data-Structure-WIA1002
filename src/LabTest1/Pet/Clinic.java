/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabTest1.Pet;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Clinic {
    
    private String clinicName;
    private Vet vet;

    public Clinic(String clinicName, Vet vet) {
        this.clinicName = clinicName;
        this.vet = vet;
    }

    public Vet getVet() {
        return vet;
    }
   
    public static void main(String[] args) {
        Vet vet1 = new Vet("Abu Bakar","DVM(India)");
        Clinic clinic1 = new Clinic("Happy Animal Clinic",vet1);
        
        Cat catA = new Cat("Dimmy","Siamese",5,"Diarrhea");
        Cat catB = new Cat("Tabby","British Shorthair",6,"Worms");
        
        ArrayList<Prescription> prescriptions = new ArrayList<>();
        prescriptions.add(new Prescription(catB,"Tylosin",5));
        prescriptions.add(new Prescription(catA,"Pyrantel",3));
        
        System.out.println("Clinic: " + clinic1.clinicName);
        System.out.println(clinic1.getVet());
        vet1.giveTreatment(prescriptions);
        
        String result = "";
        if(catA.compareTo(catB)==0)
            result = catA.getCatName() + " and " + catB.getCatName() + "have same weight.";
        else if(catA.compareTo(catB)>0)
            result = catA.getCatName() + " is heavier than " + catB.getCatName();
        else
            result = catB.getCatName() + " is heavier than " + catA.getCatName();
        
        System.out.println("Weight analysis: " + result);
        
        
        
    }
}
