/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SList;

/**
 *
 * @author JiaWen
 */
public class TestSList {
    public static void main(String[] args) {
        
        SList<String> list =  new SList<>();
        
        //appendEnd
        list.appendEnd("Linked list, ");
        list.appendEnd("is, ");
        list.appendEnd("easy. ");
        
        
        //display
        list.display();
        System.out.println();
        
        //removeInitial
        System.out.println("Remove initial and display removed value: ");
        System.out.println(list.removeInitial());
        System.out.println();
        
        //display current list
        System.out.println("Current list: ");
        list.display();
        System.out.println();
        
        //check
        System.out.println("Check if 'difficult' is in the list.");
        System.out.println(list.contains("difficult"));
        System.out.println();
        
        //clear
        System.out.println("Clear the list:");
        list.clear();
        list.display();
 
    }
}
