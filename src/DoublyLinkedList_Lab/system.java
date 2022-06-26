/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DoublyLinkedList_Lab;

/**
 *
 * @author JiaWen
 * @param <E>
 */
public class system<E> {
    
    private Node<E> head, tail;
    private int size = 0;

    public system() {
    }
     
    public void add(E e){
        Node<E> temp = new Node<>(e);
        if(size == 0){
            head = temp;
            tail = temp;
        }else{
            tail.next = temp;
            tail = temp;
        }
        size++; 
    }
    
    public void removeElement(E e){
        Node<E> current = head;
        int index = -1;
        for(int i = 0; i < size; i++){
            if(current.element.equals(e)){
                index = i;
                break;
            }
            current = current.next;
        }
        current = head;
        for(int i = 0; i < index - 1; i++){
            current = current.next;
        }
        current.next = current.next.next;
        size--;
    }
    
    public void printList(){
        Node<E> current = head;
        for(int i = 0; i < size; i++){
            if(i == size - 1){
                System.out.print(current.element + ".");
            }else{
                System.out.print(current.element + ", ");
            }
            current = current.next;
        }
    }
    
    public int getSize(){
        return size;
    }
    
    public boolean contains(E e){
        boolean result = false;
        Node<E> current =  head;
        for(int i = 0; i < size; i++){
            if(current.element.equals(e)){
                return true;
            }
            current = current.next;
        }
        return false;
    }
    
    public void replace(E e, E newE){
        Node<E> current = head;
        for(int i = 0; i < size; i++){
            if(current.element.equals(e)){
                current.element = newE;
                break;
            }
            current = current.next;
        }
    }
    
}
