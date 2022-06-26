/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package U2005415_CJW;

import java.util.LinkedList;

/**
 *
 * @author JiaWen
 * @param <E>
 */
public class Queue<E extends Packet> {
    
    private java.util.LinkedList<E> list = new java.util.LinkedList<>();
    
    public Queue(){
       list = new LinkedList<>();
    }
    
    public void enqueue(Packet[] e){
        list.addLast(e);
    }
    
    public E dequeue(){
        return list.removeFirst();
    }
    
    public E peek(){
        return list.getFirst(); 
    }
    
    public int getSize(){
        return list.size();
    }
    
    public boolean contains(E e){
        return list.contains(e);
    }
    
    public boolean isEmpty(){
        return list.isEmpty();
    }
    
    
   
        
    }
    

