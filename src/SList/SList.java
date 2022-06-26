/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SList;

/**
 *
 * @author JiaWen
 * @param <E>
 */
public class SList<E> {
    
    private SNode<E> head, tail;
    private int size = 0;

    public SList() {
    }
    
    //addLast
    public void appendEnd(E e){
       SNode<E> tmp = new SNode<>(e, null, tail);
       //checking
       if(size == 0){
        head = tmp; //assign tmp to head (prev connection)
        tail = tmp; //assign tmp to tail (prev connection)
       }else{
           tail.next = tmp; //assign tmp to tail.next
           tail = tmp;  //assign tmp to tail
       }
       size++;  //increase the size
    }
    
    //removeFirst
    public E removeInitial(){
        if(size == 0){
            return null;   //no node then return null
        }else{
            SNode<E> tmp = head;    //copy head to temp node before delete
            head = head.next;   //set new head
            head.next.prev = null;  //***** 
            size--; //decrease the size
            return tmp.element; //this is to know what we delete
        }  
    }
    
    public boolean contains(E e){
        boolean result = false;     //declare result with boolean type and assign to false
        SNode<E> current =  head;   //copy head to current node 
        for(int i = 0; i < size; i++){     //for loop
            if(current.element.equals(e)){  
                return true;
            }
            current = current.next;
        }
        return false;
    }
    
    public void clear(){
        size = 0;
        head = null;
        tail = null;
    }
    
    public void display(){
        SNode<E> current = head;
        for(int i = 0; i < size; i++){
            System.out.println(current.element + " ");
            current = current.next;
        }
    }
    
}
