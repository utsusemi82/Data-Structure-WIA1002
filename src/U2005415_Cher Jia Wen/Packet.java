/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package U2005415_CJW;

/**
 *
 * @author JiaWen
 */
public class Packet {
    
    String type;
    int index;
    int priority;
    
    //Constructor for packet
    public Packet() {
    }
    
    //Constructor to construct the details
    public Packet(String type, int index) {
        this.type = type;
        this.index = index;
    }
    
    //set priority
    public int priority(){

        if (type.equalsIgnoreCase("voice")){
            priority = 2;
        }else if(type.equalsIgnoreCase("video")){
            priority = 1;
        }else {
            priority = 0;
        }

        return priority;
    }
    
    
    
    @Override
    public String toString() {
        return type + " " + index + " " + "(Priority=" + priority + ")";
    }
    
    
    
}


