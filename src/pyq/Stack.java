/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pyq;

import java.util.ArrayList;

/**
 *
 * @author JiaWen
 * @param <E>
 */
public class Stack<E extends Person> {
    private ArrayList<E> stack;
    public String stack_name;

    public Stack() {
        this.stack = new ArrayList<>();
    }

    public Stack(String stack_name) {
        this.stack_name = stack_name;
    }

    public Stack(ArrayList<E> stack, String stack_name) {
        this.stack = stack;
        this.stack_name = stack_name;
    }
    
    public void push(String name, int age){
        stack.add((E)new Person(name, age));
    }
    
    public void push(String name, int age, String gender){
        stack.add((E)new Person(name, age, gender));
    }
    
    public void push(String name, int age, String gender, String occupation){
        stack.add((E)new Person(name, age, gender, occupation));
    }
    
    public void push(Person person){
        stack.add((E) person);
    }
    
    public E pop(){
        Person o = stack.get(getSize()-1);
        stack.remove(getSize()-1);
        return (E) o;
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
    
    public void displayStack(){
        System.out.println("----" + stack_name + "----");
        if(isEmpty()){
            System.out.println("Empty Stack");
        }
        for(int i = stack.size()-1; i > -1; i--){
            System.out.println(i + " " + stack.get(i).toString());
        }
    }
    
    public boolean search(E o){ 
        //return stack.contains(o);
        for (int i = 0; i < stack.size(); i++ ) {
            //for loop
            if (stack.get(i).equals(o)){
                return true;
            }
        }
        return false;
    }

}
