/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labtest3;

/**
 *
 * @author JiaWen
 * @param <T>
 */
public class Edge<T extends Comparable<T>>{
    Vertex <T> toVertex;
    Edge<T> nextEdge;

    public Edge(){
        this.toVertex = null;
        this.nextEdge = null;
    }

    public Edge (Vertex<T> destination , Edge<T> nextEdge ){
        this.nextEdge = nextEdge;
        this.toVertex = destination;
    }

    

}
