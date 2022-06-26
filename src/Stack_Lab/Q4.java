/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Stack_Lab;

import java.util.Scanner;

/**
 *
 * @author JiaWen
 */
public class Q4 {
    
    public static <E> boolean isPalindrome(MyStack<E> stack){
        int count = stack.getSize();
        if (count>15){
            System.out.println("String exceeds limit.");
            return false;
        }else{
            String str = "";
            String str2 = "";
            for (int i = 0; i <count; i++){
                str += (Character)stack.pop();
            }
            for (int i = str.length() - 1; i >= 0; i--){
                str2 += str.charAt(i);
            }
            if (str.equals(str2)){
                return true;
            }else{
                return false;
            }
        }
    }
    
    public static void main(String[] args) {
        MyStack<Character> stack = new MyStack<>();
        Scanner sc = new Scanner (System.in);
        System.out.println("Please enter a string: ");
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++){
            stack.push(str.charAt(i));
        }
        System.out.println(stack.toString());
        System.out.println("Is it a palindrome? " + isPalindrome(stack));
        
    }
    
}
