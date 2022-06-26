/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkedList_Tutorial;

/**
 *
 * @author JiaWen
 * @param <E>
 */

//1a
//node class
public class Node<E>{
    
    //create two nodes contain alphabet
    Node<E> node1 = new Node<>('a');
    Node<E> node2 = new Node<>('z');
    
    //create 2 references:head & tail
    Node<E> head;
    Node<E> tail;
    
    //head points to node1; tail points to node2
    head = node1;
    tail = node2;
    
    //1c
    head.next=tail;
    
    //1d & 1g
    public void addFirst(E e){
        Node<E> firstNode = new Node<>(e);
        firstNode.next = head;
        head = firstNode;
        size++;
        if(tail==null) tail=head;
    }
    
    //e) If we have no information about the status of a linked-list, what are the conditions we need to consider to perform the operation in (d)?
    

    //f) Write a list of operations/steps/pseudocode needed to add the firstNode to the first location.
    /*
    Start
    Initialize newNode with element e
    newNode.next = head 
    head = newNode 
    size++
    if tail is null
    tail = head
    Stop

    */
    
    
    
    
    
}
