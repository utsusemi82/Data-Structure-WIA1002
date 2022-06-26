/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package U2005415_CJW;

import java.util.LinkedList;

/**
 *
 * @author JiaWen
 * @param <E>
 */
public class Candy<E>{
    
    LinkedList<E> list = new LinkedList<>();
    
    public int getSize(){
        return list.size(); }
        
    //returns the top element in stack
    public E peek(){
        return list.getLast(); 
    }

    //returns and removes the top element in stack
    public E pop(){
        return list.removeLast(); 
    }
    
    // adds the element into the top of the stack
    public void push(E e){
        list.addFirst(e);
    }
    
    //check if it is empty
    public boolean isEmpty(){
        return list.isEmpty(); 
    }
    
    //prints the candies in the container
    public void display(){
        System.out.println("The candies in the container: ");
        if(!list.isEmpty()){
            for(int i=list.size()-1; i>=0; i--){
                System.out.print(" <-- ");
                System.out.print(list.get(i));
            }
        }
        else
            System.out.println("The container is empty");
    }
    
    
}
