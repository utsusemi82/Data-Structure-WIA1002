/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Graph;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JiaWen
 */
public class any {
    
    //class to store edges of the weighted graph
    class Edge {
        int src, dest;
        Edge(int src, int dest) {
                this.src = src;
                this.dest = dest;
               
            }
    }
    // Graph class
    class Graph {
        // node of adjacency list 
        static class Node {
            int value, weight;
            Node(int value)  {
                this.value = value;
               
            }
        };

    // define adjacency list

    List<List<Node>> adj_list = new ArrayList<>();

        //Graph Constructor
    public Graph(List<Edge> edges){
            // adjacency list memory allocation
            for (int i = 0; i < edges.size(); i++)
                adj_list.add(i, new ArrayList<>());

            // add edges to the graph
            edges.forEach(e -> {
                // allocate new node in adjacency List from src to dest
                adj_list.get(e.src).add(new Node(e.dest));
            });
        }
    // print adjacency list for the graph
        public void printEdges(Graph graph)  {
        int src_vertex = 0;
        int list_size = graph.adj_list.size();
 
        System.out.println("Print Edges:");
        while (src_vertex < list_size) {
            //traverse through the adjacency list and print the edges
            for (Node edge : graph.adj_list.get(src_vertex)) {
                System.out.print("#" + src_vertex + " ==> " + "[" + edge.value + 
                                 "]\t");
            }
 
            System.out.println();
            src_vertex++;
        }
    }
        
}
}
