/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pyq;

import java.util.LinkedList;

/**
 *
 * @author JiaWen
 * @param <E>
 */
public class Queue<E>{
    
    LinkedList<E> queue = new LinkedList<>();
    String code;

    public Queue(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
    
    public void enqueue(E e){
        queue.addLast(e);
    }
    
    public E dequeue(){
        return queue.removeFirst();
    }
    
    public E getElement(int i){
        return queue.get(i);
    }
    
    public E setElement(int i, E e){
        return queue.set(i, e);
    }
    
    public E peek(){
        return queue.getFirst(); 
    }
    
    public int getSize(){
        return queue.size();
    }
    
    public boolean contains(E e){
        return queue.contains(e);
    }
    
    public boolean isEmpty(){
        return queue.isEmpty();
    }

    @Override
    public String toString() {
        String output = "Product: " + this.code + "\n" ;
        for (E e : queue) {
            output = output + e + " --> ";
        }
        return output;
    }
    
    
    
    
}
