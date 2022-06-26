/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Stack_Lab;

/**
 *
 * @author JiaWen
 */

//Q1
public class TestMyStack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Q1b
        MyStack<Character> stack1 = new MyStack<>();
        
        stack1.push('a');
        stack1.push('b');
        stack1.push('c');
        
        System.out.println("Stack 1: " + stack1.toString());
        System.out.println("Check if element 'b' is in the stack. Ans: " + stack1.search('b'));
        System.out.println("Check if element ‘k’ is in the stack. Ans: " + stack1.search('k'));
        System.out.println();
        
        //Q1c
        MyStack<Integer> stack2 = new MyStack<>();
        
        stack2.push(1);
        stack2.push(2);
        stack2.push(3);
        System.out.println("Stack 2: " + stack2.toString());
        System.out.println("Check if element ‘6’ is in the stack. Ans: " + stack2.search(6));
    }
    
}
