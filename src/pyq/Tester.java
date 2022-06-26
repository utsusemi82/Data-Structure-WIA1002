/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pyq;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

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
        LinkedList<Queue> list = new LinkedList<>();
        String input = "";
        
        try{
            Scanner inputStream = new Scanner(new FileInputStream("labtest2.txt"));
            while(inputStream.hasNextLine()){
                input = inputStream.nextLine();
            }
            inputStream.close();
        }catch(FileNotFoundException e){
            System.out.println("Error");
        }
        
        String[] inArray = input.split(" ");
        boolean found = false;
        for(int i = 0; i < inArray.length; i+=2){
            for(Queue q: list){
                 if(q.getCode().equals(inArray[i])){
                    q.enqueue(inArray[i+1]);
                    found = true;
                 }
            }
            if(!found){
                Queue<String> temp = new Queue<>(inArray[i]);
                temp.enqueue(inArray[i+1]);
                list.add(temp);
            }
            found = false;
        }
        System.out.print("Product Code in Queue : ");
        for(Queue q:list){
            System.out.print(q.getCode()+" --> ");
        }
        System.out.println("\nList of product by categories");
        for(Queue q: list){
            System.out.println(q.getCode() +" "+ q);
        }
        
        }
     
    }
    

