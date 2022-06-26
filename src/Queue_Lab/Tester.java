/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Queue_Lab;

/**
 *
 * @author JiaWen
 */
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] item = new String[2];
        item[0] = "Durian";
        item[1] = "Blueberry";
        
        MyQueue<String> fruitQ = new MyQueue<>(item);
        fruitQ.enqueue("Apple");
        fruitQ.enqueue("Orange");
        fruitQ.enqueue("Grapes");
        fruitQ.enqueue("Cherry");
        
        System.out.println("Queue of fruitQ: " +  fruitQ.toString());
        System.out.println("Top item: " + fruitQ.peek());
        System.out.println("Size: " + fruitQ.getSize());
        System.out.println("Deleted: " + fruitQ.dequeue());
        System.out.println("Item in index position of 2: " + fruitQ.getElement(2));
        System.out.println("Consists of cherry? " + fruitQ.contains("Cherry"));
        System.out.println("Consists of durian? " + fruitQ.contains("Durian"));
        System.out.println("Display using the isEmpty(): ");
        while(!fruitQ.isEmpty()){
            System.out.print(fruitQ.dequeue() + " "); 
        }
    }
    
}
