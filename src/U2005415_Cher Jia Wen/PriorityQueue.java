/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package U2005415_CJW;

/**
 *
 * @author JiaWen
 * @param <E>
 */
public class PriorityQueue<E extends Packet> {
    private java.util.LinkedList<E> priorityQ = new java.util.LinkedList<>();
    
    //enqueue based on the priority
    public void enqueue(Packet [] e){
        for (Packet e1 : e) {
            if (e1.priority() == 2) {
                priorityQ.addLast((E) e1);
            }
        }
        for (Packet e1 : e) {
            if (e1.priority() == 1) {
                priorityQ.addLast((E) e1);
            }
        }
        for (Packet e1 : e) {
            if (e1.priority() == 0) {
                priorityQ.addLast((E) e1);
            }
        }
    }
    
    //
    public E dequeue(){
        if(!priorityQ.isEmpty()){
            return priorityQ.removeFirst();
        }
        return null;
    }
    
    public E peek(){
        return priorityQ.getFirst(); 
    }
    
    public int getSize(){
        return priorityQ.size();
    }
    
    public boolean contains(E e){
        return priorityQ.contains(e);
    }
    
    public boolean isEmpty(){
        return priorityQ.isEmpty();
    }

   
    public void display(){
        System.out.println("Processing 10 network packets");
        for (int i = 0; i <priorityQ.size() ; i++){
            System.out.println(priorityQ.get(i).toString());
        }
    }
   
}
    

