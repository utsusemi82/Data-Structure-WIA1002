/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labtest3;

/**
 *
 * @author JiaWen
 */
public class tester {
    public static void main(String[] args) {
        UnweightedGraph<String> graph = new UnweightedGraph<>();
        
        String[] actor = {"Barbara Windsor","Dick Van Dyke","Julie Andrews","Shirley MacLaine","Romy Schneider","Christopher Plummer"};
        
        for(String i : actor)
            graph.addVertex(i);
        
        graph.addEdge("Alice in Wonderland", "Chitty Chitty Bang Bang",null);
        graph.addEdge("Chitty Chitty Bang Bang", "Mary Poppins", "What a Way to Go");
        graph.addEdge("Mary Poppins", "The Sound of Music", null);
        graph.addEdge("The Apartment", "What a Way to Go",null);
        graph.addEdge("The Old Gun","Triple Cross",null);
        graph.addEdge("The Sound of Music", "Triple Cross",null);
        
        System.out.println("\nPrintEdges:");
        graph.printEdges();
        
//        graph.addEdgeMatrix(0,1);
//        graph.addEdgeMatrix();
//        graph.addEdgeMatrix();
//        graph.addEdgeMatrix();
//        graph.addEdgeMatrix();
//        graph.addEdgeMatrix();
        
        System.out.print(graph.toString());
        
        
       
    }
}
