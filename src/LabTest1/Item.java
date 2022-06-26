/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabTest1;

/**
 *
 * @author User
 * @param <E1>
 * @param <E2>
 */

//generic class Item with 2 parameter type
public class Item<E1,E2> {
    
    E1 item_name;
    E2 item_price;
    
    //Constructor for the parameter
    public Item(E1 item_name, E2 item_price) {
        this.item_name = item_name;
        this.item_price = item_price;
    }

    //Getter to get name and price
    public E1 getItem_name() {
        return item_name;
    }

    public E2 getItem_price() {
        return item_price;
    }

    //setter to set name and price
    public void setItem_name(E1 item_name) {
        this.item_name = item_name;
    }

    public void setItem_price(E2 item_price) {
        this.item_price = item_price;
    }

    //toString method to return name and price for the item
    @Override
    public String toString() {
        return "\n[Item Name:" + item_name + 
                "\nItem Price: RM" + item_price + "]" ;
    }
    
    
    
    
    
}
