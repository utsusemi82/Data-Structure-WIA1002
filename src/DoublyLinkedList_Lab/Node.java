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
public class Node<E> {
    E element;
    Node<E> next;
    Node<E> prev;

    public Node() {
    }

    public Node(E element) {
        this.element = element;
    }
    
}
