/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Graph;

import java.util.LinkedList;

/**
 *
 * @author JiaWen
 */
public class Graph {
    int size;
    LinkedList[] linkedlist;
    
    public Graph(int size){
        this.size = size;
        linkedlist = new LinkedList[size];
        for(int i = 0; i < size; i++){
            linkedlist[i] = new LinkedList();
        }
    }
    
    public void addEgde(int start, int end){
        linkedlist[start].addFirst(end);
    }
    
    public void printGraph(){
        for(int i = 0; i < size; i++){
            System.out.print("Node " + i + " is linked to: ");
            for(int j = 0; j < linkedlist[i].size(); j++){
                System.out.print(linkedlist[i].get(j) + " ");
            }
            System.out.println();
        }
    }
}

class tryGraph{
    public static void main(String[] args) {
        Graph graph = new Graph(3);
        graph.addEgde(0, 1);
        graph.addEgde(0, 2);
        graph.addEgde(1, 2);
        graph.addEgde(2, 1);
        graph.printGraph();
    }
}
