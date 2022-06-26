/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Queue_Lab;

/**
 *
 * @author JiaWen
 * @param <E>
 */
public class MyQueue<E> {
    private java.util.LinkedList<E> list = new java.util.LinkedList<>();

    public MyQueue() {
    }
    
    public MyQueue(E[] e){
        for(int i = 0; i < e.length ; i++ ){
            list.add(e[i]);
        }
    }
    
    public void enqueue(E e){
        list.addLast(e);
    }
    
    public E dequeue(){
        return list.removeFirst();
    }
    
    public E getElement(int i){
        return list.get(i);
    }
    
    public E setElement(int i, E e){
        return list.set(i, e);
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
    
    @Override
    public String toString(){
        return  list.toString() ;
    }
   
}


