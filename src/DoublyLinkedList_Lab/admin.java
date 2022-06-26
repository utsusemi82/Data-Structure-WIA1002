/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DoublyLinkedList_Lab;

import java.util.Scanner;

/**
 *
 * @author JiaWen
 */
public class admin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        system<String> list = new system<>();
        
        //Enter name
        System.out.println("Enter your student name list. Enter 'n' to end..... ");
        while(true){
            String name = sc.nextLine();
            if(name.equalsIgnoreCase("n")){
                System.out.println("");
                break;
            }
            list.add(name);
        }
        
        //display name entered
        System.out.println("You have entered the following students' name: ");
        list.printList();
        System.out.println();
        
        //calculate size
        System.out.println("The number of students entered is: " + list.getSize());
        System.out.println();
  
        //Replace or not
        System.out.println("All the names entered are correct? Enter 'r' to rename the student name, 'n' to proceed ");
        String ans = sc.next();
        if(ans.equalsIgnoreCase("r")){
            System.out.println("Enter the existing student name that u want to rename :");
                String oldName = sc.nextLine();
                boolean contains = list.contains(oldName);
                    if(contains == true){
                    System.out.println("Enter the new name: ");
                    String newName = sc.nextLine();
                    System.out.println();
                    list.replace(oldName, newName);
                    list.printList();
                }else{
                    System.out.println("This is not existing student name.");
                }
        }else if(ans.equalsIgnoreCase("n")){
            //Remove or not
            System.out.println("Do you want to remove any of your student name? Enter 'y' for yes, 'n' to proceed.");
                String ans1 = sc.next();
                if(ans1.equalsIgnoreCase("y")){
                    System.out.println("Enter a student name to remove: ");
                    String removeName = sc.nextLine();
                    list.removeElement(removeName);
                    System.out.println();
                    System.out.println("The number of updated student is: " + list.getSize());
                    System.out.println("The updated students list is: ");
                    list.printList();
                    System.out.println();
                    System.out.println("All student data captured complete. Thank you! ");
                }else if(ans1.equalsIgnoreCase("n")){
                    System.out.println("All student data captured complete. Thank you! ");
                }else{
                    System.out.println("Error.");
                }
        }else{
            System.out.println("All student data captured complete. Thank you! ");
        }
    }
}
