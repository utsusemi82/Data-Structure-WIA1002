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
public class Vet {
    
    private String vetName;
    private String qualification;

    public Vet(String vetName, String qualification) {
        this.vetName = vetName;
        this.qualification = qualification;
    }

    public String getVetName() {
        return vetName;
    }

    public String getQualification() {
        return qualification;
    }

    public void setVetName(String vetName) {
        this.vetName = vetName;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
    
    
    
    public void giveTreatment( ArrayList<Prescription> prescriptions ){
        for(Prescription prescription : prescriptions){
            System.out.println(prescription.toString());
        }
    }

    @Override
    public String toString() {
        return "Vet On Duty: " + vetName + ", " + qualification; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
