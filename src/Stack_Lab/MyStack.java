/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Stack_Lab;

import java.util.ArrayList;

/**
 *
 * @author JiaWen
 * @param <E>
 */
public class MyStack<E> {
    private ArrayList<E> stack;

    public MyStack() {
        this.stack = new ArrayList<>();
    }
    
    public void push(E o){
        stack.add(o);
    }
    
    public E pop(){
        E o = stack.get(getSize()-1);
        stack.remove(getSize()-1);
        return o;
    }
    
    public E peek(){
        return stack.get(getSize()-1);
    }
    
    public int getSize(){
        return stack.size();
    }
    
    public boolean isEmpty(){
        return stack.isEmpty();
    }
    
    @Override
    public String toString(){
        return "stack: " + stack.toString();
    }
    
    public boolean search(E o){ 
        for (int i = 0; i < stack.size(); i++ ) {
            //for loop
            if (stack.get(i).equals(o)){
                return true;
            }
        }
        return false;
    }

    
    
}

