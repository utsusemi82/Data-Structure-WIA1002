/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pyq;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author JiaWen
 */
public class Person {
    private String name;
    private int age;
    private String gender;
    private String occupation;
    private static ArrayList<String> occupation_list = new ArrayList<>(Arrays.asList("doctor", "nurses", "teacher", "police"));
    private boolean frontliner = false;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.gender = null;
        this.occupation = null;
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.occupation = null;
    }

    public Person(String name, int age, String gender, String occupation) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.occupation = occupation;
        setFrontliner(occupation);
    }

    private void setFrontliner(String occupation) {
        if(occupation_list.contains(occupation))
            this.frontliner = true;
    }
    
    @Override
    public String toString() {
        return name 
                + " " + age 
                + " " + gender 
                + " " + (frontliner ? "Frontliner" : " Not Frontliner");
    }

     public int getAge() {
        return age;
    }
    
     public boolean isFrontliner(){
        return frontliner;
    }
     
     public int compareTo(Person o){
         return Integer.compare(this.age, o.getAge());
     }
}
