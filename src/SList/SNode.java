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
public class SNode<E> {
    E element;      //contains the element
    SNode<E> next;      //make references
    SNode<E> prev;

    public SNode() {    //default constructor
    }

    public SNode(E element) {       //constructor that receives a generic item
        this.element = element;
    }

    public SNode(E element, SNode<E> next, SNode<E> prev) {     //initialise the variables
        this.element = element;
        this.next = next;
        this.prev = prev;
    }
}
