/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Stack_Lab;

import java.util.Scanner;

/**
 *
 * @author JiaWen
 */
//Q2
public class TestIntMyStack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        MyStack<Integer> stack3 = new MyStack<>();
        
        //Q2a
        System.out.println("Enter an integer value(>0): ");
        int num = sc.nextInt();
        
        //Q2b
        for(int i = 1; i <= num; i++){
            stack3.push(i);
        }
        
        //Q2c
        System.out.println("Size of stack: " + stack3.getSize());
        
        //Q2d
        for(int i = 0; i < num; i++){
            System.out.print(stack3.pop() + " ");
        }
        System.out.println();
        System.out.println("Empty? " + stack3.isEmpty());
    }
    
}
