/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package U2005415_CJW;

/**
 *
 * @author JiaWen
 */
public class Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Candy<String> candy = new Candy<>();
        Candy<String> temp = new Candy<>();
        
        //push candy into stack
        candy.push("Blue");
        candy.push("Yellow");
        candy.push("Yellow");
        candy.push("Orange");
        candy.push("Blue");
        candy.push("Red");
        candy.push("Orange");
        
        //display stack
        candy.display();
        
        System.out.println("");
        System.out.println("Ali takes all the candies one by one from the container and eats the blue ones.");
        System.out.println("He puts back the rest of candies in the container.");
        
        //if the container not empty and top element is Blue, it will be removed from the stack
        //If the top element isn't Blue, it will print the element
        while(!candy.isEmpty()){
            if(candy.peek().equals("Blue"))
                candy.pop();
            else
                temp.push(candy.pop());
        }
        
        while(!temp.isEmpty())
            candy.push(temp.pop());
        candy.display();
    }
}
    

