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
public class Vertex<T extends Comparable<T>>{
    T vertexInfo;
    int inDeg , outDeg;
    Vertex<T> nextVertex;
    Edge<T> firstEdge;


    public Vertex(){
        this.vertexInfo = null;
        inDeg = outDeg = 0;
        this.nextVertex = null;
        this.firstEdge = null;
    }

    public Vertex(T vInfo , Vertex<T> next){
        this.vertexInfo = vInfo;
        this.nextVertex = next;
        this.inDeg = 0;
        this.outDeg = 0;
        this.firstEdge = null;
    }

    

}
