/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ADT_Lab;

/**
 *
 * @author User
 */
public class ArrayBagDemo {
    public static void main(String[] args) {
        BagInterface<String> bag1 = new ArrayBag<>();
        BagInterface<String> bag2 = new ArrayBag<>();
        String[] contentsOfBag1 = {"A", "A", "B", "A", "C", "A"};
        String[] contentsOfBag2 = {"A", "B", "A", "C", "B", "C", "D", "another string"};
        
        //bag1
        System.out.println("bag1:");
        testAdd(bag1, contentsOfBag1);
        displayBag(bag1);
        System.out.println("\n");
        
        //bag2
        System.out.println("bag2:");
        testAdd(bag2, contentsOfBag2);
        displayBag(bag2);
        System.out.println("\n");
        
        //bag3
        System.out.println("bag3, test the method union of bag1 and bag2 ");
        BagInterface<String> bag3 = bag1.union(bag2);
        displayBag(bag3);
        System.out.println("\n");
        
        //bag4
        System.out.println("bag4, test the method intersection of bag1 and bag2 ");
        BagInterface<String> bag4 = bag1.intersection(bag2);
        displayBag(bag4);
        System.out.println("\n");
        
        //bag5
        System.out.println("bag5, test the method difference of bag1 and bag2 ");
        BagInterface<String> bag5 = bag1.difference(bag2);
        displayBag(bag5);
    }
    
    private static void testAdd(BagInterface<String> aBag, String[] content) {
        System.out.print("Adding ");
        for (int i = 0; i < content.length; i++) {
            aBag.add(content[i]);
            System.out.print(content[i] + " ");
        }
        System.out.println("");
    }

    private static void displayBag(BagInterface<String> aBag) {
        System.out.println("The bag contains " + aBag.getCurrentSize() + " string(s), as follows:");
        Object[] arrayBag = aBag.toArray();
        for (int i = 0; i < arrayBag.length; i++) {
            System.out.print(arrayBag[i] + " ");
        }
    }
}


