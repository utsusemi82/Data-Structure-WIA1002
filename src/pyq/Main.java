/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pyq;

import java.util.PriorityQueue;

/**
 *
 * @author JiaWen
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Stack<Person> raw = new Stack("Raw list");
        
        raw.push("ali",32,"m","doctor");
        raw.push("lisa",29,"f","nurse");
        raw.push("tanaka",41);
        raw.push("ahmad",18,"m","developer");
        raw.push("maria",20,"f","accountant");
        raw.push("chong",70,"m","lawyer");
        raw.push("raju",55,"m","police");
        raw.push("alex",16,"f","business man ");
        
        Person katie = new Person("katie",36,"f","teacher");
        raw.push(katie);
        raw.displayStack();

        System.out.println("~~~~~~~Sort into frontliners and others~~~~~");
        System.out.println();
        
        Stack<Person> Frontliners = new Stack<>("Frontliners");
        Stack<Person> others = new Stack<>("Others");
        
        while(!raw.isEmpty()){
            if(raw.peek().isFrontliner()){
                Frontliners.push(raw.pop());
            }else
                others.push(raw.pop());
        }
        
        raw.displayStack();
        
        System.out.println();
        System.out.println("-------------------");
        Frontliners.displayStack();
        
        System.out.println();
        System.out.println("-------------------");
        others.displayStack();
        
        Stack<Person> priority = new Stack<>("Vaccine Priority List");
        PriorityQueue<Person> qFrontliners = new PriorityQueue<>();
        PriorityQueue<Person> qOthers = new PriorityQueue<>();
        
        while(!others.isEmpty()){
            qOthers.add(others.pop());
        }
        
        while(!Frontliners.isEmpty()){
            qFrontliners.add(Frontliners.pop());
        }
        
        while(!qFrontliners.isEmpty()){
            priority.push(qFrontliners.poll());
        }
        
        priority.displayStack();
        
    }
}
    
