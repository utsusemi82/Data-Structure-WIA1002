/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Queue_Lab;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author JiaWen
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Queue<Character> list = new LinkedList<>();
        
        System.out.print("Enter a string to check wheter it is a palindrome: ");
        String str = input.nextLine();
        
        for (int i = str.length() - 1; i >= 0; i--){
            list.add(str.charAt(i));
        }
        
        String strRev = "";
        while(!list.isEmpty()){
            strRev += list.poll();
        }
        
        if(str.equalsIgnoreCase(strRev)){
            System.out.println("It is a palindrome");
        }else{
            System.out.println("It is not a palindrome");
        }
    }
    
}
